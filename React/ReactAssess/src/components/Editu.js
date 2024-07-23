import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function Editu() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:8001/users/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:8001/users/" + id, data).then((res) => {
      alert("Data Updated Successfully");
      navigate("/user");
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
            <h1>Warehouse Management System</h1>
            <div>
              <lable htmlFor="id">Item Id</lable>
              <input
                type="text"
                disabled
                name="id"
                className="form-control"
                value={data.id}
                onChange={(e) => setData({ ...data, Name: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="name">Item Name</lable>
              <input
                type="text"
                name="name"
                className="form-control"
                value={data.Name}
                onChange={(e) => setData({ ...data, Name: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="quantity">Quantity</lable>
              <input
                type="number"
                name="quantity"
                className="form-control"
                value={data.Quantity}
                onChange={(e) => setData({ ...data, Quantity: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="city">City :</lable>
              <input
                type="text"
                name="city"
                className="form-control"
                value={data.City}
                onChange={(e) => setData({ ...data, City: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="Price">Price</lable>
              <input
                type="number"
                name="price"
                className="form-control"
                value={data.Price}
                onChange={(e) => setData({ ...data, Price: e.target.value })}
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

export default Editu;
