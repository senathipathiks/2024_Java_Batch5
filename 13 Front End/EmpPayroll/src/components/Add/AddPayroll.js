import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Add.css";

function AddPayroll() {
  const [inputData, setInputData] = useState({
    basic: "",
    hra: "",
    da: "",
    ta: "",
    pf: "",
    ctc: ""
  });


  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);



    if (result === true) {
      axios
        .post("http://localhost:8005/payroll", inputData)
        .then((response) => {
          alert("Data added Successfully");
          naviget("/viewpayroll");
          console.log(response.data);
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
    if (inputData.basic.length === 0) {
      alert("Please enter Basic pay !!! ");
      return false;
    } else if (inputData.hra.length === 0) {
      alert("Please enter HRA !!! ");
      return false;
    } else if (inputData.da.length === 0) {
      alert("Please enter DA !!!");
      return false;
    } else if (inputData.pf.length === 0) {
      alert("Please Enter the PF!!!");
      return false;
    } else {
      return true;
    }
  };


  return (

    <div class="body">
      <div class="cards">
        <form onSubmit={handleSubmit}>
          <h2 id="align">Add Payroll's Data</h2>

          <div>
            <lable htmlFor="basic">Basic Pay :</lable>
            <input
              id="a"
              type="number"
              name="basic"
              className="form-control"
              placeholder="Enter department"
              // onkeyup="sum();
              onChange={(e) =>
                setInputData({ ...inputData, basic: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="hra">HRA :</lable>
            <input
              id="b"
              type="number"
              name="hra"
              className="form-control"
              placeholder="Enter hra"
              onChange={(e) =>
                setInputData({ ...inputData, hra: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="da">DA :</lable>
            <input
              id="c"
              type="number"
              name="da"
              className="form-control"
              placeholder="Enter department"
              onChange={(e) =>
                setInputData({ ...inputData, da: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="ta">TA :</lable>
            <input
              id="d"
              type="number"
              name="ta"
              className="form-control"
              placeholder="Enter department"
              onChange={(e) =>
                setInputData({ ...inputData, ta: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pf">PF :</lable>
            <input
              id="e"
              type="number"
              name="pf"
              className="form-control"
              placeholder="Enter department"
              onChange={(e) =>
                setInputData({ ...inputData, pf: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="ctc">CTC :</label>
            <input
              type="number"
              name="ctc"
              className="form-control"
              placeholder="CTC"
              value={parseInt(inputData.basic)+parseInt(inputData.da)+parseInt(inputData.hra)+parseInt(inputData.ta)+parseInt(inputData.pf)} // Display the calculated salary
              onBlur={(e) =>
                setInputData({ ...inputData, ctc: e.target.value })
              }
            />
          </div>


          <br />
          <center><button className="btn btn-primary">Submit</button></center>
        </form>


      </div>
    </div>
  );
}

export default AddPayroll;
