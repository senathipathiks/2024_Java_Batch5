import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddCampaign() {
  const [inputData, setInputData] = useState({
    campaignName: "",
    venueLocation: "",
    partyName: "",
    candidateName: "",
    startTime: "",
    endTime: "",
    email: "",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:7010/campaign", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/viewcampaign");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Inputs!!!");
    }
  };


  const validateValues = (inputData) => {
    if (inputData.campaignName.length === 0) {
      alert("Please enter Campaign Name !!! ");
      return false;
    } else if (inputData.venueLocation.length === 0) {
      alert("Please enter Venue Location !!!");
      return false;
    } else if (inputData.partyName.length === 0) {
      alert("Please enter Party Name !!!");
      return false;
    } else if (inputData.candidateName.length === 0) {
      alert("Please enter Candidate Name !!!");
      return false;
    } else if (inputData.startTime.length === 0) {
      alert("Please enter Start Time !!!");
      return false;
    } else if (inputData.endTime.length === 0) {
      alert("Please enter End Time !!!");
      return false;
    } else if (inputData.email.length === 0) {
      alert("Please enter Email !!!");
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
          <h1>ADD CAMPAIGN DATA</h1>
          <div>
            <lable htmlFor="campaignname">Campaign Name :</lable>
            <input
              type="text"
              name="campaignName"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, campaignName: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="venuelocation">Venue Location :</lable>
            <input
              type="text"
              name="venueLocation"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, venueLocation: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="partyname">Party Name :</lable>
            <input
              type="text"
              name="partyName"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, partyName: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="candidatename">Candidate Name :</lable>
            <input
              type="text"
              name="candidateName"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, candidateName: e.target.value })
              }
            />
          </div>
          
          <div>
            <lable htmlFor="starttime">Start Time :</lable>
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
            <lable htmlFor="endtime">End Time :</lable>
            <input
              type="text"
              name="endTime"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, endTime: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="email">Email :</lable>
            <input
              type="email"
              name="email"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, email: e.target.value })
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

export default AddCampaign;
