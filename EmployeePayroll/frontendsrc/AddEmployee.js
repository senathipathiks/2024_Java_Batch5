import axios from "axios";
import React from "react";
import { useState,useEffect } from "react";
import { useNavigate } from "react-router-dom";
import "./Home.css";

function Add() {
  const[columns,setColumns] = useState([]);
  const[records,setRecords] = useState([]);
  const [inputData, setInputData] = useState({
    empid:"-1",
    empname: "",
    empdesignation: "",
    empcity: "",
    emprole: "",
    payroll:{
      payrollid:"",
      basic:"",
      hra:"",
      da: "",
      ta:"",
      pf:"",
      ctc:""
  }
  });

  useEffect(() => {
    axios
      .get("http://localhost:8787/payroll/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  const naviget = useNavigate();

  
  // const handleSelectChange = (e) => {
  //   const selectedRecordId = e.target.value;
  //   if (selectedRecordId) {
  //     axios
  //       .get("http://localhost:8787/payroll/"+selectedRecordId)
  //       .then((response) => {
  //         const selectedPayroll = response.data;
  //         setInputData((prevState) => ({
  //           ...prevState,
  //           payroll: {
  //             // payrollid:selectedPayroll.payrollid,
  //             basic:selectedPayroll.basic,
  //             hra: selectedPayroll.hra,
  //             da: selectedPayroll.da,
  //             ta: selectedPayroll.ta,
  //             pf: selectedPayroll.pf,
  //             ctc:(selectedPayroll.basic+selectedPayroll.hra+selectedPayroll.da+selectedPayroll.ta+selectedPayroll.pf)
  //           }
  //         }));
  //       })
  //       .catch((err) => {
  //         console.log(err);
  //       });
  //   }
  // };

  const handleSelectChange = async (e) => {
    const payrollId = e.target.value;
    console.log(`Selected Payroll ID: ${payrollId}`);
    try {
      const response = await axios.get("http://localhost:8787/payroll/"+payrollId);
      console.log('Payroll data fetched:', response.data);
      setInputData(prevState => ({
        ...prevState,
        payroll: {
          ...prevState.payroll,
          ...response.data,
          pid: payrollId
        }
      }));
    } catch (err) {
      console.error("Error fetching payroll data:", err);
    }
  };

  useEffect(() => {
    console.log('Updated inputData:', inputData);
  }, [inputData]);

  

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:8787/employee", inputData)
        .then((res) => {
          alert("employee added Successfully");
          naviget("/viewEmployee");
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
     if (inputData.empname.length === 0) {
      alert("Please enter  empname !!!");
      return false;
    } else if (inputData.empdesignation.length === 0) {
      alert("Please enter empdesignation !!!");
      return false;
    } else if (inputData.empcity.length === 0) {
      alert("Please enter empcity !!!");
      return false;
    } else if (inputData.emprole.length === 0) {
      alert("Please Enter the Valid emprole!!!");
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
          <h2 id="align">Add Employee's Data</h2>
          
          <div>
            <lable htmlFor="empname">Name :</lable>
            <input
              type="text"
              name="empname"
              className="form-control"
              placeholder="Enter Name"
              onChange={(e) =>
                setInputData({ ...inputData, empname: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="empdesignation">Designation :</lable>
            <input
              type="text"
              name="empdesignation"
              className="form-control"
              placeholder="Enter Designation"
              onChange={(e) =>
                setInputData({ ...inputData, empdesignation: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="empcity">City :</lable>
            <input
              type="text"
              name="empcity"
              className="form-control"
              placeholder="Enter City"
              onChange={(e) =>
                setInputData({ ...inputData, empcity: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="emprole">Role :</lable>
            <input
              type="text"
              name="emprole"
              className="form-control"
              placeholder="Enter Role"
              onChange={(e) =>
                setInputData({ ...inputData, emprole: e.target.value })
              }
            />
          </div>
          
          <div>
            <label>Select Payroll Record:</label>
            <select onChange={handleSelectChange} className="form-control">
              <option value="">Select a record</option>
              {records.map((record) => (
                <option key={record.payrollid} value={record.payrollid}>
                  {record.payrollid}
                </option>
              ))}
            </select>
          </div>
          <br/>

          <button id = "value" className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
  );
}

export default Add;
