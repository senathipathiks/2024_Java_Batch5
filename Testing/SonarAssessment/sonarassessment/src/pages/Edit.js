import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";
import Navbar from "../components/Navbar";

function Edit() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const [selectedId, setSelectedId] = useState('');
  const [inputData, setInputData] = useState([]);
  const naviget = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:7777/payroll/all")
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  useEffect(() => {
    axios
      .get("http://localhost:7777/employees/"+id)
      .then((response) => setInputData(response.data))
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
          alert("Data Updated Successfully");
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
    <div>
      <Navbar />
      
    <div
      id="edit2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center"
      style={{ backdropFilter: 'blur(5px)', backgroundColor: '#f9f9f9', padding: '20px' }}
    >
      <div className="w-50 border bg-light p-5" style={{ animation: 'fadeIn 0.5s',  border: '4px solid black', borderRadius: '30px' }}>
        <form onSubmit={handleSubmit}>
          <h1 style={{ marginBottom: '20px', color: '#333', fontFamily: 'Arial, sans-serif' }}>
            UPDATE EMPLOYEES DATA
          </h1>
          <div className="mb-3">
            <label htmlFor="id">ID:</label>
            <input
              type="number"
              disabled
              name="id"
              className="form-control"
              value={inputData.id}
              onChange={(e) => setInputData({ ...inputData, id: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="name" className="form-label">
              Name
            </label>
            <input
              type="text"
              name="name"
              className="form-control"
              value={inputData.name}
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
              value={inputData.department}
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
              value={inputData.designation}
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
              value={inputData.gender}
              onChange={(e) => setInputData({ ...inputData, gender: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="selectId">Select an Payroll ID:</label>
            <select id="selectId" onChange={handleChange}  >
              <option value="">Select an ID</option>
              {data.map((item) => (
                <option key={item.payrollId} value={item.payrollId}>
                  {item.payrollId}
                </option>
              ))}
            </select>
          </div>
          <button className="btn btn-info" style={{ fontSize: '16px', padding: '10px 20px' }}>
            Update
          </button>
        </form>
      </div>
    </div>
  

    </div>
  );
}

export default Edit;
