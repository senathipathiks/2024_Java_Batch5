
import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Home.css";

function AddAdmin() {
  const [inputData, setInputData] = useState({
    Name: "",
    Mobile: "",
    City: "",
    Pincode: "",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:6001/admins", inputData)
        .then((res) => {
          alert("Admin added Successfully");
          naviget("/viewa");
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
    if (inputData.Name.length === 0) {
      alert("Please enter Admin Name !!! ");
      return false;
    } else if (inputData.Mobile.length < 5) {
      alert("Mobile No should be Max 12 Numbers Only !!!");
      return false;
    } else if (inputData.City.length === 0) {
      alert("Please enter City Name !!!");
      return false;
    }  else if (inputData.Pincode.length === 0) {
        alert("Please Enter the Valid Pincode!!!");
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
          <h2 id="align">Add Admin's Data</h2>
          <div>
            <lable htmlFor="name">Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              placeholder="Enter Name"
              onChange={(e) =>
                setInputData({ ...inputData, Name: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="Mobile">Mobile :</lable>
            <input
              type="number"
              name="mobile"
              className="form-control"
              placeholder="Enter Mobile No"
              onChange={(e) =>
                setInputData({ ...inputData, Mobile: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">City :</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              placeholder="Enter City"
              onChange={(e) =>
                setInputData({ ...inputData, City: e.target.value })
              }
            />
          </div>

          <br />

          <div>
            <lable htmlFor="pincode">Pincode :</lable>
            <input
              type="number"
              name="number"
              className="form-control"
              placeholder="Enter Pin Code"
              onChange={(e) =>
                setInputData({ ...inputData, Pincode: e.target.value })
              }
            />
          </div>
          

          <button id="value" className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
  );
}

export default AddAdmin;
