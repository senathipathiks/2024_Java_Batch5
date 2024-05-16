import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function Add() {
  const [inputData, setInputData] = useState({
    PName: "",
    PMobile: "",
    Disease: "",
    Consultant:"",
    Age:"",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:5000/users/", inputData)
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
    if (inputData.PName.length === 0) {
      alert("enter Patient's Name !!! ");
      return false;
    } else if (inputData.PMobile.length < 5) {
      alert("enter Mobile No registered in hospital");
      return false;
    } else if (inputData.Disease.length === 0) {
      alert("enter Disease diagnosed !!!");
      return false;
    } else if (inputData.Consultant.length === 0) {
      alert("Please Enter consultant");
      return false;
    } else if (inputData.Age.length === 0) {
      alert("Please Enter age");
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
          <h1>ADD PATIENT DATA</h1>
          <div>
            <lable htmlFor="name">Patient's Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, PName: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="Mobile">Patient's Contact  :</lable>
            <input
              type="number"
              name="mobile"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, PMobile: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">Disease Diagnosed :</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Disease: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pincode"> Consultant :</lable>
            <input
              type="text"
              name="pincode"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Consultant: e.target.value })
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
