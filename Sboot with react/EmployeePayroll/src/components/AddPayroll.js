import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddPayroll() {
  const [inputData, setInputData] = useState({
    basic: "",
    hra: "",
    da: "",
    pf: "",
    ctc:""
  });
 const[total,setTotal]=useState(0);
  function calculatetotal()
  {
    setTotal(inputData.basic+inputData.hra+inputData.da+inputData.pf);
  }
  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:1250/payroll", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/");
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
    if (inputData.basic.length === 0) {
      alert("Please enter valid input !!! ");
      return false;
    } else if (inputData.hra.length === 5) {
      alert("Please enter valid input");
      return false;
    } else if (inputData.da.length === 0) {
      alert("Please enter valid input");
      return false;
    } else if (inputData.pf.length === 0) {
      alert("Please enter valid input");
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
          <h1>ADD PAYROLL DATA</h1>
          <div>
            <lable htmlFor="basic">Basic Pay</lable>
            <input
              type="number"
              name="basic"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, basic: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="hra">HRA :</lable>
            <input
              type="number"
              name="hra"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, hra: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="da">DA :</lable>
            <input
              type="number"
              name="da"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, da: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pf">PF :</lable>
            <input
              type="number"
              name="pf"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, pf: e.target.value })}
              
              
            />
          </div>
          <div>
            <lable htmlFor="ctc">CTC :</lable>
            <input
              type="number"
              name="ctc"
              className="form-control"
              value={parseInt(inputData.basic)+parseInt(inputData.hra)+parseInt(inputData.da)+parseInt(inputData.pf)}
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
  );
}

export default AddPayroll;
