import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function EditSale() {
  const { id } = useParams();
  const saleId = id;
  const [saleDate, setSaleDate] = useState("");
  const [quantitySold, setQuantitySold] = useState(0);
  const [furniture, setFurniture] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    axios
      .get(`http://localhost:1225/sales/${id}`)
      .then((response) => {
        const saleData = response.data;
        setSaleDate(saleData.saleDate);
        setQuantitySold(saleData.quantitySold);
        setFurniture(saleData.furniture);
        setRecords(saleData);
      })
      .catch((err) => {
        console.log(err);
      });
  }, [id]);
  console.log("*****");
console.log(records);
  const handleSubmit = (e) => {
    e.preventDefault();

    const salesData = {
      saleId,
      saleDate,
      quantitySold,
      furniture,
    };
    axios
      .put("http://localhost:1225/sales", salesData)
      .then((response) => {
        alert("Sale record updated successfully!");
        navigate("/viewsales");
      })
      .catch((err) => {
        console.error(err);
      });
  };

  return (
    <div id="body">
      <div className="container paddings">
        <div className="p-3 mb-2 bg-primary text-white">
          <h1 className="text-center text-bg-success">Edit Sale Record</h1>
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
                  <button type="submit" className="btn btn-primary mt-3 button">
                    Update Sale
                  </button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default EditSale;
