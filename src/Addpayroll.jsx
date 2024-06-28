import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

function Add() {
  const [inputData, setInputData] = useState({
   
        hra:"",
        da:"",
        ta:"",
        pf:"",
        ctc:""
    
  });
 
  const[total,setTotal]=useState(0);
  function calculatetotal()
  {
    setTotal(inputData.hra+inputData.da+inputData.ta+inputData.pf);
  }
  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:12209/payrolltable", inputData)
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
    if (inputData.hra.length === 0) {
      alert("Please enter House Rent Allowance !!! ");
      return false;
    
    } else if (inputData.da.length === 0) {
      alert("Please enter Your DA  !!!");
      return false;
    } else if (inputData.ta.length === 0) {
      alert("Please Enter the Travel Allowance!!!");
      return false;
    } 
    else if (inputData.pf.length === 0) {
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
      <div className="w-50 border  p-5" style={{color:"white"}} id="add3">
        <form onSubmit={handleSubmit}>
          <h1 className="fst-italic" >ADD PAYROLL'S DATA</h1>
          <div>
            <lable htmlFor="hra" className="fst-italic">House Rent Allowance</lable>
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
            <lable htmlFor="da" className="fst-italic">DA :</lable>
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
            <lable htmlFor="ta" className="fst-italic">Travel Allowance :</lable>
            <input
              type="number"
              name="ta"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, ta: e.target.value })
              }
            />
          </div>
          
          <div>
            <lable htmlFor="pf" className="fst-italic">PF:</lable>
            <input
              type="number"
              name="pf"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, pf: e.target.value })
              }
            />
          </div>
      

          <div>
            <lable htmlFor="ctc" className="fst-italic">CTC :</lable>
            <input
              type="number"
              name="ctc"
              className="form-control"
              value={parseInt(inputData.hra)+parseInt(inputData.da)+parseInt(inputData.ta)+parseInt(inputData.pf)}
              onBlur={(e) =>
                setInputData({ ...inputData, ctc:e.target.value })
              }
            />
          </div>
         
          <br />

          <button className="btn btn-info " className="fst-italic">Submit</button>
        </form>

        
      </div>
    </div>
  );
}

export default Add;
