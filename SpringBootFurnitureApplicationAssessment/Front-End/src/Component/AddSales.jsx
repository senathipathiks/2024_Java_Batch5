import React, { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddSales() {
    const [saleDate, setSaleDate] = useState("");
    const [quantitySold, setQuantitySold] = useState(0);
    const [furnitureOptions, setFurnitureOptions] = useState([]);
    const [selectedFurniture, setSelectedFurniture] = useState([]);
    const navigate = useNavigate();

    useEffect(() => {
        axios
            .get("http://localhost:1225/furniture/all")
            .then((response) => {
                setFurnitureOptions(response.data);
            })
            .catch((err) => {
                console.log(err);
            });
    }, []);

    const handleSubmit = (e) => {
        e.preventDefault();

        const furniture = selectedFurniture.map((id) => {
            const selected = furnitureOptions.find((item) => item.id === parseInt(id));
            return {
                id:selected.id,
                name: selected.name,
                description: selected.description,
                price: selected.price,
                stock: selected.stock,
            };
        });

        const salesData = {
            saleDate,
            quantitySold,
            furniture,
        };

        axios
            .post("http://localhost:1225/sales", salesData)
            .then((response) => {
                alert("Sale record added successfully!");
                navigate("/");
            })
            .catch((err) => {
                console.error(err);
            });
    };

    return (
        <div id="body">
            <div className="container paddings">
                <div className="p-3 mb-2 bg-primary text-white">
                    <h1 className="text-center text-bg-success">ADD SALES RECORD</h1>
                </div>
                <div className='bod'>
            <div className="wrapper flexCenter paddings innerWidth">
                <div id="add2" className="d-flex w-100 vh-100 justify-content-center align-items-center">
                    <div className="w-50 border bg-light">
                <form onSubmit={handleSubmit} className="formcolor">
                    <div className="form-group">
                        <label>Sale Date</label>
                        <input
                            type="date"
                            className="form-control"
                            value={saleDate}
                            onChange={(e) => setSaleDate(e.target.value)}
                            required
                        />
                    </div>
                    <div className="form-group">
                        <label>Quantity Sold</label>
                        <input
                            type="number"
                            className="form-control"
                            value={quantitySold}
                            onChange={(e) => setQuantitySold(e.target.value)}
                            required
                        />
                    </div>
                    <div className="form-group">
                        <label>Furniture</label>
                        <select
                            multiple
                            className="form-control"
                            value={selectedFurniture}
                            onChange={(e) =>
                                setSelectedFurniture(Array.from(e.target.selectedOptions, (option) => option.value))
                            }
                            required
                        >
                            {furnitureOptions.map((furniture) => (
                                <option key={furniture.id} value={furniture.id}>
                                    {furniture.id}
                                </option>
                            ))}
                        </select>
                    </div>
                    <button type="submit" className="btn btn-primary mt-3 button">Add Sale</button>
                </form>
                </div>
                </div>
                </div>
                </div>
            </div>
        </div>
    );
}

export default AddSales;