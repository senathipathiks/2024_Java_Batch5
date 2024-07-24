import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";
import Navbar from "../components/Navbar";

function EditPayroll() {
  const { id } = useParams();
  const [selectedId, setSelectedId] = useState('');
  const [inputData, setInputData] = useState([]);
  const naviget = useNavigate();
  

  useEffect(() => {
    axios
      .get("http://localhost:7777/payroll/"+id)
      .then((response) => setInputData(response.data))
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
        .post("http://localhost:7777/payroll", inputData)
        .then((res) => {
          alert("Data Updated Successfully");
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
            <label htmlFor="id"> PAYROLL ID:</label>
            <input
              type="number"
              disabled
              name="payrollId"
              className="form-control"
              value={inputData.payrollId}
              onChange={(e) => setInputData({ ...inputData, payrollId: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="basicSalary" className="form-label">
              Basic Salary
            </label>
            <input
              type="number"
              name="basicSalary"
              className="form-control"
              value={inputData.basicSalary}
              onChange={(e) => setInputData({ ...inputData, basicSalary: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="hra" className="form-label">
              House Rent Allowances
            </label>
            <input
              type="number"
              name="hra"
              className="form-control"
              value={inputData.hra}
              onChange={(e) => setInputData({ ...inputData, hra: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="ta" className="form-label">
              Travel Allowances
            </label>
            <input
              type="number"
              name="ta"
              className="form-control"
              value={inputData.ta}
              onChange={(e) => setInputData({ ...inputData, ta: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="ma" className="form-label">
              Medical Allowances
            </label>
            <input
              type="number"
              name="ma"
              className="form-control"
              value={inputData.ma}
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
              value={inputData.otherAllowances}
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
            //   value={inputData.netSalary}
            value={parseInt(inputData.basicSalary)+parseInt(inputData.hra)+parseInt(inputData.ta)+parseInt(inputData.ma)+parseInt(inputData.otherAllowances)}

              onBlur={(e) => setInputData({ ...inputData, netSalary: e.target.value })}
            />
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

export default EditPayroll;
