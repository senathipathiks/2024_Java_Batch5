import React from 'react'
import axios from "axios"; 
import { useState} from 'react';
import {useEffect} from 'react';
import { useNavigate } from 'react-router-dom';

function Add() {
   const[inputdata, setInputdata] = useState({
      bp: "",
      da: "",
      ta: "",
      hr: "",
      sal: ""
  
   });
   const [data,setData] = useState([]);
   const naviget = useNavigate();

   useEffect(() => {
    axios
      .get("http://localhost:1000/payroll/all")
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

   
  let handleSubmit=(e)=>{
    e.preventDefault();
    let result =validateValues(inputdata);


    if(result === true){
     axios 
     .post("http://localhost:1000/payroll", inputdata)
     .then((res) => {
       alert("Data added Successfully");
       naviget("/");
       console.log(res.data);
     })
     .catch((err) => console.log(err));
    }else  {
        alert("Please Enter the Valid Inputs!!!");
      }
  }
  const validateValues = (inputdata) => {
    if (inputdata.bp  === 0) {
      alert("Please enter any  value!!! ");
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
          <h1>ADD Payroll DATA</h1>
          <div>
            <lable htmlFor="BasicPay">BasicPay</lable>
            <input
              type="number"
              name="bp"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, bp: e.target.value })
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
                setInputdata({ ...inputdata, da: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="ta">ta :</lable>
            <input
              type="number"
              name="ta"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, ta: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="hr">HRA :</lable>
            <input
              type="number"
              name="hr"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, hr: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="sal">Salary :</lable>
            <input
              type="number"
              name="sal"
              className="form-control"
              value={parseInt(inputdata.bp)+parseInt(inputdata.hr)+parseInt(inputdata.da)+parseInt(inputdata.ta)}
              onBlur={(e) =>
                setInputdata({ ...inputdata, sal: e.target.value })
              }
            />
          </div>



        






          
          <br />

          <button className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
  )
}

export default Add
