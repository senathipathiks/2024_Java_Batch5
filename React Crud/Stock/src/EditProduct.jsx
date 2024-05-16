import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function EditProduct() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:6001/products/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:6001/products/" + id, data).then((res) => {
      alert("User Updated Successfully");
      navigate("/viewproduct");
    });
  };

  return (
    <div>
      <div
        id="edit2"
        className="d-flex w-100 vh-100 justify-content-center align-items-center "
      >
        <div className="w-50 border bg-light p-5">
          <form onSubmit={handleSubmit}>
            <h1>UPDATE PRODUCT'S DATA'S</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="name"
                className="form-control"
                value={data.id}
                onChange={(e) => setData({ ...data, Name: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="name">Name :</lable>
              <input
                type="text"
                name="name"
                className="form-control"
                value={data.Name}
                onChange={(e) => setData({ ...data, Name: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="price">Price :</lable>
              <input
                type="number"
                name="price"
                className="form-control"
                value={data.Price}
                onChange={(e) => setData({ ...data, Price: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="discount">Discount :</lable>
              <input
                type="text"
                name="discount"
                className="form-control"
                value={data.Discount}
                onChange={(e) => setData({ ...data, Discount: e.target.value })}
              />
            </div>

           
            <br />

            <button className="btn btn-info ">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default EditProduct;
