import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function Add1() {
  const [inputData, setInputData] = useState({
    Category: "",
    Cost: "",
    Author: "",
    Valid: "",
    Link: "" ,
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:5002/users", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/");
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
    if (inputData.Category.length === 0) {
      alert("Please enter Category !!! ");
      return false;
    } else if (inputData.Cost.length < 0) {
      alert("Please netre the cost carefully Only !!!");
      return false;
    } else if (inputData.Author.length === 0) {
      alert("Please enter Author Name !!!");
      return false;
    } else if (inputData.Valid.length === 0) {
      alert("Please Enter the Valid Months!!!");
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
          <h1>ADD ADVERTISEMENT DATA</h1>
          <div>
            <lable htmlFor="name">Category</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Category: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="Mobile">Cost :</lable>
            <input
              type="number"
              name="mobile"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Cost: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">Author :</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Author: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pincode">Valid :</lable>
            <input
              type="number"
              name="number"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Valid: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="pincode">Link :</lable>
            <input
              type="text"
              name="number"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Link: e.target.value })
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

export default Add1;

