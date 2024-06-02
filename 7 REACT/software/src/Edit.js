import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Home.css";
import View from './View';

function Add() {
  const [inputData, setInputData] = useState({
    sName: "",
    sVersion: "",
    sPurchased: "",
    sInstalled: "",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:3000/software", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/view");
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
    if (inputData.sName.length === 0) {
      alert("Please enter Software Name !!! ");
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
          <h2 id="align">Add New Software Data</h2>
          <div>
            <lable htmlFor="name">Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              placeholder="Enter Software Name"
              onChange={(e) =>
                setInputData({ ...inputData, sName: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="Mobile">Version :</lable>
            <input
              type="text"
              name="mobile"
              className="form-control"
              placeholder="Enter Version"
              onChange={(e) =>
                setInputData({ ...inputData, sVersion: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">Purchased :</lable>
            <input
              type="number"
              name="city"
              className="form-control"
              placeholder="Enter purchased count"
              onChange={(e) =>
                setInputData({ ...inputData, sPurchased: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pincode">Installed :</lable>
            <input
              type="number"
              name="number"
              className="form-control"
              placeholder="Enter installed Count"
              onChange={(e) =>
                setInputData({ ...inputData, sInstalled: e.target.value })
              }
            />
          </div>
          <br />

          <button id="value" className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
  );
}

export default Add;
