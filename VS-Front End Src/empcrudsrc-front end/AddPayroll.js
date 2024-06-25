import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddPayroll() {
  const [inputData, setInputData] = useState({
    hre: '',
    ta: '',
    bp: '',
    pf: '',
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:2456/payroll", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/viewpayroll");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Inputs!!!");
    }
  };


  const validateValues = (inputData) => {
    if (inputData.hre.length === 0) {
      alert("Please enter hre !!! ");
      return false;
    } else if (inputData.ta.length === 0) {
      alert("Please enter ta !!!");
      return false;
    } else if (inputData.bp.length === 0) {
      alert("Please enter bp !!!");
      return false;
    } else if (inputData.pf.length === 0) {
      alert("Please enter pf !!!");
      return false;
    } 
      else {
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
          <h1>ADD PAYROLL DATA</h1>
          <div>
            <lable htmlFor="hre">HRE :</lable>
            <input
              type="text"
              name="hre"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, hre: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="ta">TA :</lable>
            <input
              type="text"
              name="ta"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, ta: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="bp">BP :</lable>
            <input
              type="text"
              name="bp"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, bp: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pf">PF :</lable>
            <input
              type="text"
              name="pf"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, pf: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="ctc">CTC :</lable>
 
            <input
              type="text"
              name="ctc"
              className="form-control"
              value={parseInt(inputData.hre)+parseInt(inputData.ta)+parseInt(inputData.bp)-parseInt(inputData.pf)}
              onBlur={(e) =>
                setInputData({ ...inputData, ctc:e.target.value })
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

export default AddPayroll;
