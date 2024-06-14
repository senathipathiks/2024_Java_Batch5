import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function Add() {
  const [inputData, setInputData] = useState({
    name: "",
   
    city: "",
    email: "",
    age: "",
    role: "",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:2222/student", inputData)
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
    if (inputData.name.length === 0) {
      alert("Please enter Employee Name !!! ");
      return false;
    
    } else if (inputData.city.length === 0) {
      alert("Please enter City Name !!!");
      return false;
    } else if (inputData.email.length === 0) {
      alert("Please Enter the Valid Email!!!");
      return false;
    } 
    else if (inputData.age.length === 0) {
      alert("Please Enter the Valid Age!!!");
      return false;
    } 
    else if (inputData.role.length === 0) {
        alert("Please Enter the Valid Role!!!");
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
          <h1>ADD EMPLOYEE DATA</h1>
          <div>
            <lable htmlFor="name">Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, name: e.target.value })
              }
            />
          </div>
          

          <div>
            <lable htmlFor="city">City :</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, city: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="email">Email :</lable>
            <input
              type="text"
              name="email"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, email: e.target.value })
              }
            />
          </div>
          
          <div>
            <lable htmlFor="age">Age</lable>
            <input
              type="number"
              name="age"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, age: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="role">Role</lable>
            <input
              type="text"
              name="role"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, role: e.target.value })
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
  