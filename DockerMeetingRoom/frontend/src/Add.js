import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function Add() {
  const [inputData, setInputData] = useState({
    roomNo: "",
    teamName: "",
    startTime: "",
    endTime: "",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:2222/meetroom", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/viewmeetroom");
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
    if (inputData.roomNo.length === 0) {
      alert("Please enter Room Number !!! ");
      return false;
    } else if (inputData.teamName.length === 0) {
      alert("Please enter Team Name !!!");
      return false;
    } else if (inputData.startTime.length === 0) {
      alert("Please enter startTime !!!");
      return false;
    } else if (inputData.endTime.length === 0) {
      alert("Please enter endTime !!!");
      return false;
    } else {
      return true;
    }
  };

  return (
    <div id="body">

    <div
      id="add2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center "
    >
      <div className="w-50 border p-5 rounded" id="addemp">
        <form onSubmit={handleSubmit}>
          <h1>ADD MEETING ROOM DATA</h1>
          <div>
            <label htmlFor="roomNo">Room Number</label>
            <input
              type="text"
              name="roomNo"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, roomNo: e.target.value })
              }
            />
          </div>
          <div>
            <label htmlFor="teamName">Team Name</label>
            <input
              type="text"
              name="teamName"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, teamName: e.target.value })
              }
            />
          </div>
          <div>
            <label htmlFor="startTime">Start Time :</label>
            <input
              type="text"
              name="startTime"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, startTime: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="endTime">End Time :</label>
            <input
              type="text"
              name="endTime"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, endTime: e.target.value })
              }
            />
          </div>

          <br />

          <button className="btn btn-info ">Submit</button>
        </form>

      </div>

      </div>
    </div>
  );
}

export default Add;
