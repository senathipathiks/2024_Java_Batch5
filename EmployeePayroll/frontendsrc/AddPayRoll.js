
import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Home.css";

function AddAdmin() {
  const [inputData, setInputData] = useState({
    basic:"",
    hra: "",
    da: "",
    ta: "",
    pf: "",
    ctc:""
  });

  const[total,setTotal]=useState(0);
  function calculatetotal()
  {
    setTotal(inputData.basic+inputData.hra+inputData.da+inputData.ta+inputData.pf);
  }

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:8787/payroll", inputData)
        .then((res) => {
          alert("Payroll added Successfully");
          naviget("/viewPayroll");
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
      alert("Please enter basic !!! ");
      return false;
    }
    else if (inputData.hra.length === 0) {
      alert("Please enter hra !!! ");
      return false;
    } else if (inputData.da.length === 0) {
      alert("Please enter da !!!");
      return false;
    } else if (inputData.ta.length === 0) {
      alert("Please enter ta !!!");
      return false;
    }  else if (inputData.pf.length === 0) {
        alert("Please Enter the pf!!!");
        return false;
    }
    else {
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
          <h2 id="align">Add Payroll's Data</h2>
          <div>
            <lable htmlFor="basic">BASIC</lable>
            <input
              type="number"
              name="basic"
              className="form-control"
              placeholder="Enter basic"
              onChange={(e) =>
                setInputData({ ...inputData, basic: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="hra">HRA</lable>
            <input
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
              type="number"
              name="da"
              className="form-control"
              placeholder="Enter da"
              onChange={(e) =>
                setInputData({ ...inputData, da: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="ta">TA :</lable>
            <input
              type="number"
              name="ta"
              className="form-control"
              placeholder="Enter ta"
              onChange={(e) =>
                setInputData({ ...inputData, ta: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="pf">PF :</lable>
            <input
              type="number"
              name="pf"
              className="form-control"
              placeholder="Enter pf"
              onChange={(e) =>
                setInputData({ ...inputData, pf: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="ctc">CTC :</lable>
            <input
              type="number"
              name="ctc"
              className="form-control"
              value={parseInt(inputData.basic)+parseInt(inputData.hra)+parseInt(inputData.da)+parseInt(inputData.ta)+parseInt(inputData.pf)}
              placeholder="Enter ctc"
              onBlur={(e) =>
                setInputData({ ...inputData, ctc: e.target.value })
              }
            />
          </div>
          <br/>
          

          <button id="value" className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
  );
}

export default AddAdmin;
