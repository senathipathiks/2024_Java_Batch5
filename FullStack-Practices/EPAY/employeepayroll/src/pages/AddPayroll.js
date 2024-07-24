import axios from "axios";
import React from "react";
import { useState, useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";
import Navbar from "../components/Navbar";

function Add() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const [inputData, setInputData] = useState({
   
      basicSalary: "",
      hra: "",
      ta: "",
      ma: "",
      otherAllowances:"",
      netSalary: ""
    
  });

  const naviget = useNavigate();

  useEffect(() => {
    axios
      .get("http://localhost:2222/payroll/all")
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  const handleSubmit = (e) => {
    e.preventDefault();
    // const result = validateValues(inputData);

    // if (result) {
      console.log(inputData);
      // const jsonString = JSON.stringify(inputData);
      // console.log(jsonString);
      axios
        .post("http://localhost:2222/payroll", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/"); // Navigate to home page
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    // } else {
    //   alert("Please Enter Valid Inputs!!!");
    // }
  };

//   const validateValues = (inputData) => {
//     if (inputData.name.length === 0) {
//       alert("Please enter Employee Name !!! ");
//       return false;
//     } else if (inputData.department.length === 0) {
//       alert("Please enter Employee Department !!!");
//       return false;
//     } else if (inputData.designation.length === 0) {
//       alert("Please enter Employee Designation !!!");
//       return false;
//     } else {
//       return true;
//     }
//   };

  return (
    <><Navbar />
    <div
      id="add2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center"
      style={{ backdropFilter: 'blur(5px)', backgroundColor: '#f9f9f9' }}
    >
      <div className="w-50 border bg-light p-5" style={{ animation: 'fadeIn 0.5s',  border: '4px solid black', borderRadius: '30px' }}>
        <form onSubmit={handleSubmit}>
          <h1 style={{ marginBottom: '20px', color: '#333' }}>ADD PAYROLL DATA</h1>
          <div className="mb-3">
            <label htmlFor="basicSalary" className="form-label">
              Basic Salary
            </label>
            <input
              type="number"
              name="basicSalary"
              className="form-control"
              onChange={(e) => setInputData({ ...inputData, basicSalary: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="hra" className="form-label">
              HRA
            </label>
            <input
              type="number"
              name="hra"
              className="form-control"
              onChange={(e) => setInputData({ ...inputData, hra: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="ta" className="form-label">
              TA
            </label>
            <input
              type="number"
              name="ta"
              className="form-control"
              onChange={(e) => setInputData({ ...inputData, ta: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="ma" className="form-label">
              MA
            </label>
            <input
              type="number"
              name="ma"
              className="form-control"
              onChange={(e) => setInputData({ ...inputData, ma: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="otherAllowances" className="form-label">
              Other Allowances
            </label>
            <input
              type="number"
              name="otherAllowances"
              className="form-control"
              onChange={(e) => setInputData({ ...inputData, otherAllowances: e.target.value })}
            />
          </div>

          <div className="mb-3">
            <label htmlFor="netSalary" className="form-label">
              Net Salary
            </label>
            <input
              type="number"
              name="netSalary"
              className="form-control"
              value={parseInt(inputData.basicSalary)+parseInt(inputData.hra)+parseInt(inputData.ta)+parseInt(inputData.ma)+parseInt(inputData.otherAllowances)}
              onBlur={(e) => setInputData({ ...inputData, netSalary: e.target.value })}
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
