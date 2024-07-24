import axios from "axios";
import React from "react";
import { useState, useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";
import Navbar from "../components/Navbar";

function Add() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const [selectedId, setSelectedId] = useState('');
  const [inputData, setInputData] = useState({
    id:"",
    name: "",
    department: "",
    designation: "",
    gender: "",
    payroll: {
      payrollId: "",
      basicSalary: "",
      hra: "",
      ta: "",
      ma: "",
      otherAllowances:"",
      netSalary: ""
    }
  });

  const naviget = useNavigate();

  useEffect(() => {
    axios
      .get("http://localhost:7777/payroll/all")
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  const handleChange = (event) => {
    setSelectedId(event.target.value);
    axios
      .get("http://localhost:7777/payroll/" + event.target.value)
      .then((response) => {
        setInputData((inputData) => ({
          ...inputData,
          payroll: response.data
        }));
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const result = validateValues(inputData);

    if (result) {
      console.log(inputData);
      // const jsonString = JSON.stringify(inputData);
      // console.log(jsonString);
      axios
        .post("http://localhost:7777/employees", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/"); // Navigate to home page
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    } else {
      alert("Please Enter Valid Inputs!!!");
    }
  };

  const validateValues = (inputData) => {
    if (inputData.name.length === 0) {
      alert("Please enter Employee Name !!! ");
      return false;
    } else if (inputData.department.length === 0) {
      alert("Please enter Employee Department !!!");
      return false;
    } else if (inputData.designation.length === 0) {
      alert("Please enter Employee Designation !!!");
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
            <label htmlFor="gender" className="form-label">
              Gender
            </label>
            <input
              type="text"
              name="gender"
              className="form-control"
              onChange={(e) => setInputData({ ...inputData, gender: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="selectId">Select an Payroll ID:</label>
            <select id="selectId" onChange={handleChange}  >
              <option value="">Select an ID</option>
              {data.map((item) => (
                <option key={item.id} value={item.id}>
                  {item.payrollId}
                </option>
              ))}
            </select>
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
