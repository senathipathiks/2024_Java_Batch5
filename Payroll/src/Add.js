import React from 'react'
import axios from "axios"; 
import { useState} from 'react';
import {useEffect} from 'react';
import { useNavigate } from 'react-router-dom';

function Add() {
   const[inputdata, setInputdata] = useState({
    id: "1",
    name : "",
    mobile:"",
    city:"",
    dept:"",
    salary: {
      pid: "",
      bp: "",
      da: "",
      ta: "",
      hr: "",
      sal: ""
  }
   });
   const [id, setId] = useState([]);
   const [data,setData] = useState([]);
   const naviget = useNavigate();

   useEffect(() => {
    axios
      .get("http://localhost:1000/payroll/all")
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);
  
  const handleChange = (e) => {
    setId(e.target.value);
    axios
      .get("http://localhost:1000/payroll/" + e.target.value)
      .then((response) => {
        setInputdata((inputData) => ({
          ...inputData,
          salary: response.data
        }));
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
};

   
  let handleSubmit=(e)=>{
    e.preventDefault();
    let result =validateValues(inputdata);


    if(result === true){
     axios 
     .post("http://localhost:1000/employee", inputdata)
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
    if (inputdata.name.length === 0) {
      alert("Please enter Student Name !!! ");
      return false;
    } else if (inputdata.mobile.length < 5) {
      alert("Mobile No should be Max 12 Numbers Only !!!");
      return false;
    } else if (inputdata.city.length === 0) {
      alert("Please enter City Name !!!");
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
          <h1>ADD EMPLOYEE DATA</h1>
          <div>
            <lable htmlFor="name">Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, name: e.target.value })
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
                setInputdata({ ...inputdata, mobile: e.target.value })
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
                setInputdata({ ...inputdata, city: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="desg">Designation :</lable>
            <input
              type="text"
              name="desg"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, dept: e.target.value })
              }
            />
          </div>



          <div>
        <label htmlFor="selectId">Select an Payroll ID:</label>
        <select id="selectId" onChange={handleChange}>
          <option value="" >Select an ID</option>
          {data.map((item) => (
            <option key={item.id} value={item.id}>
              {item.pid} 
            </option>
          ))}
        </select>
        
      </div>






          
          <br />

          <button className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
  )
}

export default Add
