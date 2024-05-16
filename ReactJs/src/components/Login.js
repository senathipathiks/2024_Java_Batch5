import React, { useState } from 'react';
import './Login.css'

function Login() {
  const [inputfield, setInputfield] = useState(
    {
      email: "",
      password: ""
    }
  )
  const [errors, setErrors] = useState({})
  const [submitting, setSubmit] = useState(false)

  const validate = (inputfield) => {
    let errors = {};
    if (inputfield.email.length < 15) {
      errors.email = "email too short";
    }
    if (inputfield.password.length < 7) {
      errors.password = "password less than 7 character"
    }
    return errors;
  }

  const changeEvent = (e) => {
    setInputfield({ ...inputfield, [e.target.name]: e.target.value })

  }

  const submitHandle = (e) => {
    e.preventDefault();
    setErrors(validate(inputfield));
    setSubmit(true);
  }

  return (
    <div>
      <div id="con">
        {Object.keys(errors).length === 0 && submitting ? (<span className='success' id="success">Successfully Login ✓</span>) : null}
      </div>
      <div id="log">
        <h1>Login</h1>
        <form onSubmit={submitHandle}>
          <lable htmlfor="email">Email</lable>
          <br /><br />
          <input
            name="email"
            type="email"
            value={inputfield.email}
            onChange={changeEvent}
          >
          </input>
          <br /><br />
          <lable htmlfor="password">Password</lable><br /><br />
          <input
            name="password"
            type="password"
            value={inputfield.password}
            onChange={changeEvent}
          >
          </input><br /><br />
          <button>Submit</button> <br/><br/>
          <a href='Fotgot.jsx'>ForgotPassword</a><br/><br/>
          Don't have account?<a href="SignUp.jsx">SignUp</a>
        </form><br/><br/>
      </div>
      <div id="align">
      {errors.email ? (<p className='error'>Email should be at least 15 character</p>) : null}
      {errors.password ? (<p className='error'>password should be at least 7 character long </p>) : null}
    </div>
    </div>
  );
}

export default Login;
