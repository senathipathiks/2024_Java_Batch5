import React from 'react'
import axios from "axios"; 
import { useState} from 'react';
import { useNavigate } from 'react-router-dom';

function Add() {
   const[inputdata, setInputdata] = useState({
    Name : "",
    Mobile:"",
    City:"",
    Disease:"",
   });

   const naviget = useNavigate();
   
  let handleSubmit=(e)=>{
    e.preventDefault();
    let result =validateValues(inputdata);


    if(result == true){
     axios 
     .post("http://localhost:5002/users", inputdata)
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
    if (inputdata.Name.length === 0) {
      alert("Please enter Patient Name !!! ");
      return false;
    } else if (inputdata.Mobile.length < 5) {
      alert("Mobile No should be Max 12 Numbers Only !!!");
      return false;
    } else if (inputdata.City.length === 0) {
      alert("Please enter City Name !!!");
      return false;
    } else if (inputdata.Disease.length === 0) {
      alert("This field should not be empty!!!");
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
          <h1>ADD PATIENT DATA</h1>
          <div>
            <lable htmlFor="name">Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, Name: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="Mobile">Mobile :</lable>
            <input
              type="number"
              name="mobile"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, Mobile: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">City :</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, City: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="prblm">Disease :</lable>
            <input
              type="text"
              name="prblm"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, Disease : e.target.value })
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
