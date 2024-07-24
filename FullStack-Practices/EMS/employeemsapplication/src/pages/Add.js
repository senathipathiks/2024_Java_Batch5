import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";
import Navbar from "../components/Navbar";

function Add() {
  const [inputData, setInputData] = useState({
    name: "",
    department: "",
    designation: "",
    salary: "",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:1111/employee", inputData)
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
    } else if (inputData.department.length === 0) {
      alert("Please enter Employee Department !!!");
      return false;
    }else if (inputData.designation.length === 0) {
      alert("Please enter Employee Designation !!!");
      return false;
    }else if (inputData.salary.length === 0) {
      alert("Please enter Employee Salary !!!");
      return false;
    } else {
      return true;
    }
  };

  return (
    <><Navbar />
    <div
      id="add2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center"
      style={{ backdropFilter: 'blur(5px)', backgroundColor: '#f9f9f9' }}
    >
      <div className="w-50 border bg-light p-5" style={{ animation: 'fadeIn 0.5s',  border: '4px solid black', borderRadius: '30px' }}>
        <form onSubmit={handleSubmit}>
          <h1 style={{ marginBottom: '20px', color: '#333' }}>ADD EMPLOYEES DATA</h1>
          <div className="mb-3">
            <label htmlFor="name" className="form-label">
              Name
            </label>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) => setInputData({ ...inputData, name: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="department" className="form-label">
              Department
            </label>
            <input
              type="text"
              name="department"
              className="form-control"
              onChange={(e) => setInputData({ ...inputData, department: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="designation" className="form-label">
              Designation
            </label>
            <input
              type="text"
              name="designation"
              className="form-control"
              onChange={(e) => setInputData({ ...inputData, designation: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="salary" className="form-label">
              Salary
            </label>
            <input
              type="number"
              name="salary"
              className="form-control"
              onChange={(e) => setInputData({ ...inputData, salary: e.target.value })}
            />
          </div>
          <button className="btn btn-info" style={{ fontSize: '16px', padding: '10px 20px' }}>
            Submit
          </button>
        </form>
      </div>
    </div>
    </>
  );
}







export default Add;
