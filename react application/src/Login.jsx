import React from 'react'
import { useEffect, useState } from "react";
import { Link, useNavigate } from "react-router-dom";

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
    <div>
      {Object.keys(errors).length === 0 && submitting ? (
        <span className="success">Login Successfull  ✓</span>
        ) : null}
       
  <center><form onSubmit={handleSubmit}>
  <h3 class="text-center"> Login</h3><br></br>
    <div>
 
      <label for="username">Username</label>
      <input
        type="username"
        name="username"
        value={inputFields.username}
        onChange={handleChange}
      ></input>
    </div> <br />
 
    <div>
      <label for="password">Password</label>
      <input
        type="password"
        name="password"
        value={inputFields.password}
        onChange={handleChange}
      ></input>
    </div> <br />
 
 
    <button type="submit">Login</button>
  </form></center>
 
  <center>{errors.username ? (
  <p className="error">
    Username should be at least 10 characters long
  </p>
) : null}</center>
 
 <center>{errors.password ? (
  <p className="error">
    Password should be at least 5 characters long
  </p>
) : null}</center>
 
    </div>
  )
}

export default Login