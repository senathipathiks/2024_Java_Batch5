import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddCandidate() {
  const [inputData, setInputData] = useState({
    candidateName: "",
    Age: "",
    Gender: "",
    Email: "",
    partyName: ""
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:7010/candidate", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/viewcandidate");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Inputs!!!");
    }
  };


  const validateValues = (inputData) => {
    if (inputData.candidateName.length === 0) {
      alert("Please enter Candidate Name !!! ");
      return false;
    } else if (inputData.Age.length === 5) {
      alert("Please enter Age !!!");
      return false;
    } else if (inputData.Email.length === 0) {
      alert("Please enter Email !!!");
      return false;
    } else if (inputData.partyName.length === 0) {
      alert("Please enter Party Name !!!");
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
          <h1>ADD CANDIDATE DATA</h1>
          <div>
            <lable htmlFor="candidatename">Candidate Name :</lable>
            <input
              type="text"
              name="candidatename"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, candidateName: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="age">Age :</lable>
            <input
              type="text"
              name="age"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Age: e.target.value })
              }
            />
          </div>
          

          <div>
            <lable htmlFor="gender">Gender :</lable>
            <input
              type="text"
              name="gender"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Gender: e.target.value })
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
                setInputData({ ...inputData, Email: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="partyname">Party Name :</lable>
            <input
              type="text"
              name="partyname"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, partyName: e.target.value })
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

export default AddCandidate;
