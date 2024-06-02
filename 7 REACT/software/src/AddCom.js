import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Home.css";
import ViewCom from './ViewCom';

function AddCom() {
  const [inputData, setInputData] = useState({
    cName: "",
    cLink: "",
    cCode: "",
    phoneNo: "",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:3000/company", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/viewCompany");
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
    if (inputData.cName.length === 0) {
      alert("Please enter company Name !!! ");
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
          <h2 id="align">Add New Company Data</h2>
          <div>
            <lable htmlFor="name">Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              placeholder="Enter company Name"
              onChange={(e) =>
                setInputData({ ...inputData, cName: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="Mobile">Link :</lable>
            <input
              type="text"
              name="link"
              className="form-control"
              placeholder="Enter Link"
              onChange={(e) =>
                setInputData({ ...inputData, cLink: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">Code :</lable>
            <input
              type="number"
              name="code"
              className="form-control"
              placeholder="Enter Company Code"
              onChange={(e) =>
                setInputData({ ...inputData, cCode: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pincode">phoneNo :</lable>
            <input
              type="number"
              name="pnoneNo"
              className="form-control"
              placeholder="Enter PhoneNo "
              onChange={(e) =>
                setInputData({ ...inputData, phoneNo: e.target.value })
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

export default AddCom;
