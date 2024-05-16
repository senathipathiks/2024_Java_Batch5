import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function Add() {
  const [inputData, setInputData] = useState({
    UName: "",
    Adnum: "",
    Address: "",
    Member:"",
    Age:"",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:5001/users/", inputData)
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
    if (inputData.UName.length === 0) {
      alert("enter User's Name !!! ");
      return false;
    } else if (inputData.Adnum.length < 10) {
      alert("enter valid adhaar number");
      return false;
    } else if (inputData.Address.length === 0) {
      alert("enter address");
      return false;
    } else if (inputData.Consultant.length === 0) {
      alert("Please enter family member count");
      return false;
    } else if (inputData.Age.length === 0) {
      alert("Please Enter your age");
      return false;
    }
    else {
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
          <h1>ADD USERS DATA</h1>
          <div>
            <lable htmlFor="name">User's Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, UName: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="Mobile">User's Adhaar Number :</lable>
            <input
              type="number"
              name="mobile"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Adnum: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">Enter Address</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Address: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pincode"> Member Count</lable>
            <input
              type="number"
              name="pincode"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Member: e.target.value })
              }
            />
          </div>
          <br />

          <div>
            <lable htmlFor="age"> Age:</lable>
            <input
              type="number"
              name="Age"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Age: e.target.value })
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

export default Add;
