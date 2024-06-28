import React from 'react'
import { useEffect, useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import './Login.css';
import './App2.css';
import './Home.css';

function Login() {
    const [inputFields, setInputFields] = useState({
        username:"",
        password:"",
      });
 
      const [errors, setErrors] = useState({});
      const [submitting, setSubmitting] = useState(false);
 
    const validateValues = (inputValues) => {
        let errors = {};
        if (inputValues.username.length < 10) {
          errors.username = "Username is too short";
        }
        if (inputValues.password.length < 5) {
          errors.password = "Password is too short";
        }
        return errors;
      };
   
    const handleChange = (e) => {
        setInputFields({ ...inputFields, [e.target.name]: e.target.value });
      };
   
      const handleSubmit = (event) => {
        event.preventDefault();
        setErrors(validateValues(inputFields));
        setSubmitting(true);
      };
  return (
    
  <div
    id="add2"
    className="d-flex w-100 vh-100 justify-content-center align-items-center "
  >
    <div id='regform' className="w-50 border bg-purple p-5">
    
    <div class="head">
      {Object.keys(errors).length === 0 && submitting ? (
        <span className="success text-success">Login Successfull  ✓</span>
        ) : null}
       
  <center><form onSubmit={handleSubmit}>
  <h3 class="text-center" > Login</h3><br></br>
    <div>
 
      <label for="username">Username: </label>
      <input
        type="username"
        name="username"
        value={inputFields.username}
        onChange={handleChange}
      ></input>
    </div> <br />
    <center>{errors.username ? (
  <p className="error text-danger">
    Username should be at least 10 characters long
  </p>
) : null}</center>
 
    <div>
      <label for="password">Password: </label>
      <input
        type="password"
        name="password"
        value={inputFields.password}
        onChange={handleChange}
      ></input>
    </div> <br />
    <center>{errors.password ? (
  <p className="error text-danger">
    Password should be at least 5 characters long
  </p>
) : null}</center>
 
 
    <button type="submit">Login</button>
  </form></center>
 
  
 

 
    </div>
    </div>
    </div>
  )


}
export default Login