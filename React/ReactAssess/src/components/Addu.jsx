import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function Addu() {
  const [inputData, setInputData] = useState({
    Name: "",
    Quantity: "",
    City: "",
    Price: "",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:8001/users/", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/user");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Inputs!!!");
    }
  };

  // validation Part for add user for student management system
  // const [errors, setErrors] = useState({});
  // const [submitting, setSubmitting] = useState(false);

  const validateValues = (inputData) => {
    if (inputData.Name.length === 0) {
      alert("Please enter Item Name !!! ");
      return false;
    } else if (inputData.Quantity.length < 0) {
      alert("Quantity should not be empty !!!");
      return false;
    } else if (inputData.City.length === 0) {
      alert("Please enter City Name !!!");
      return false;
    } else if (inputData.Price.length === 0) {
      alert("Price should not be empty!!!");
      return false;
    } else {
      return true;
    }
  };

  return (
    <div
      id="add2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center "
    >
      <div className="w-50 border bg-light p-5">
        <form onSubmit={handleSubmit}>
          <h1>Add Items</h1>
          <div>
            <lable htmlFor="name">Item Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Name: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="Quantity">Quantity</lable>
            <input
              type="number"
              name="mobile"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Quantity: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">City</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, City: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="price">Price</lable>
            <input
              type="number"
              name="number"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Price: e.target.value })
              }
            />
          </div>
          <br />

          <button className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
  );
}

export default Addu;
