import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddProduct() {
  const [inputData, setInputData] = useState({
    Name: "",
    Price:"",
    Discount:""
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:6001/products", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/viewproduct");
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
      alert("Please enter Student Name !!! ");
      return false;
    } else if (inputData.Price.length == 0) {
      alert("Please enter price !!!");
      return false;
    } else if (inputData.Discount.length === 0) {
      alert("Please enter Discount!!!");
      return false;
    }  else {
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
          <h1>ADD Product'S DATA</h1>
          <div>
            <lable htmlFor="name">Name</lable>
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
            <lable htmlFor="Price"> Price:</lable>
            <input
              type="number"
              name="price"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Price: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="discount">Discount :</lable>
            <input
              type="text"
              name="discount"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Discount: e.target.value })
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

export default AddProduct;
