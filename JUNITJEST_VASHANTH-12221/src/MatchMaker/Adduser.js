import React from 'react'
import axios from "axios"; 
import { useState} from 'react';
import {useEffect} from 'react';
import { useNavigate } from 'react-router-dom';

function Add() {
   const[inputdata, setInputdata] = useState({
    mid: "",
    mname: "",
    mnum: "",
    maddr: ""
  
   });
   const [data,setData] = useState([]);
   const naviget = useNavigate();

   useEffect(() => {
    axios
      .get("http://localhost:1000/match/all")
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

   
  let handleSubmit=(e)=>{
    e.preventDefault();
    let result =validateValues(inputdata);


    if(result === true){
     axios 
     .post("http://localhost:1000/match", inputdata)
     .then((res) => {
       alert("Data added Successfully");
       naviget("/view");
       console.log(res.data);
     })
     .catch((err) => console.log(err));
    }else  {
        alert("Please Enter the Valid Inputs!!!");
      }
  }
  const validateValues = (inputdata) => {
    if (inputdata.mname === null) {
      alert("Name Cannot be empty value!!! ");
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
          <h1 data-testid="heading">ADD MATCHMAKER  DATA</h1>
          <div>
            <lable htmlFor="mname"> Name</lable>
            <input
              type="text"
              role='name'
              name="mname"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, mname: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="addr">Address :</lable>
            <input
              type="text"
              name="addr"
              role='addr'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, maddr: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="cmobile">Mobile :</lable>
            <input
              type="number"
              name="cmobile"
              role='mobile'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, mnum: e.target.value })
              }
            />
          </div>

          {/* <div>
            <lable htmlFor="pt">Payment Type :</lable>
            <input
              type="Text"
              name="pt"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, pt: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="bill">Bill amount :</lable>
            <input
              type="number"
              name="bill"
              className="form-control"
              // value={parseInt(inputdata.bp)+parseInt(inputdata.hr)+parseInt(inputdata.da)+parseInt(inputdata.ta)}
              onChange={(e) =>
                setInputdata({ ...inputdata, bill: e.target.value })
              }
            />
          </div> */}



        






          
          <br />

          <button className="btn btn-info " data-testid="submitbutton">Submit</button>
        </form>

        
      </div>
    </div>
  )
}

export default Add
