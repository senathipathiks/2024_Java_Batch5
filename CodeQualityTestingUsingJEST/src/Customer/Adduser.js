import React from 'react'
import axios from "axios"; 
import { useState} from 'react';
import {useEffect} from 'react';
import { useNavigate } from 'react-router-dom';

function Add() {
   const[inputdata, setInputdata] = useState({
    cid: "",
    uname: "",
    addr: "",
    cmobile: "",
    pt: "",
    billSts: ""
  
   });
   const [data,setData] = useState([]);
   const naviget = useNavigate();

   useEffect(() => {
    axios
      .get("http://localhost:1000/customer/all")
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

   
  let handleSubmit=(e)=>{
    e.preventDefault();
    let result =validateValues(inputdata);


    if(result === true){
     axios 
     .post("http://localhost:1000/customer", inputdata)
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
    if (inputdata.bill  === 0) {
      alert("Bill Cannot be empty value!!! ");
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
          <h1>ADD CUSTOMER DATA</h1>
          <div>
            <lable htmlFor="uname">User Name</lable>
            <input
              type="text"
              name="uname"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, uname: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="addr">Address :</lable>
            <input
              type="text"
              name="addr"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, addr: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="cmobile">Mobile :</lable>
            <input
              type="number"
              name="cmobile"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, cmobile: e.target.value })
              }
            />
          </div>

          <div>
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
            <lable htmlFor="bill">Bill Status :</lable>
            <input
              type="text"
              name="billSts"
              className="form-control"
              
              // value={parseInt(inputdata.bp)+parseInt(inputdata.hr)+parseInt(inputdata.da)+parseInt(inputdata.ta)}
              onChange={(e) =>
                setInputdata({ ...inputdata, billSts: e.target.value })
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
