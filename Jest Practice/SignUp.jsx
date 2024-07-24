

import axios from "axios";
import React, { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import "./SignUp.css";

function SignUp() {
  const [inputData, setInputData] = useState({
    userId: "",
    userName: "",
    email: "",
    password: "",
    confirmPassword: ""
  });

  const navigate = useNavigate(); 

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);

    if (result === true) {
      axios
       .post("http://localhost:7727/user", inputData)
       .then((res) => {
          alert("Data added Successfully");
          navigate('/AppRoute');
          console.log(res.data);
        })
       .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Inputs!!!");
    }
  };

  const validateValues = (inputData) => {
    if (inputData.userName.length === 0) {
      alert("Please enter  Name!!! ");
      return false;
    } else if (inputData.email.length === 0) {
      alert("Please enter email!!!");
      return false;
    } else if (inputData.password.length === 0) {
      alert("Please Enter the password!!!");
      return false;
    } else if (inputData.confirmPassword.length === 0) {
      alert("Please enter confirm password!!!");
      return false;
    } else if (inputData.password !== inputData.confirmPassword) {
      alert("Password doesn't match!!!");
      return false;
    } else {
      return true;
    }
  };

  return (
    <div className="containersign">
      <div className="row justify-content-center">
        <div className="col-md-6">
          <div className="card">
            <div className="card-body">
              <h2 className="card-title">Register</h2>
              <form>
                <div className="form-group">
                  <label htmlFor="userName">Username</label>
                  <input
                    type="text"
                    name="userName"
                    className="form-control"
                    role="username"
                    onChange={(e) =>
                      setInputData({...inputData, userName: e.target.value })
                    }
                  />
                </div>

                <div className="form-group">
                  <label htmlFor="email">Email</label>
                  <input
                    type="email"
                    name="email"
                    className="form-control"
                    role="emailID"
                    onChange={(e) =>
                      setInputData({...inputData, email: e.target.value })
                    }
                  />
                </div>

                <div className="form-group">
                  <label htmlFor="password">Password</label>
                  <input
                    type="password"
                    name="password"
                    className="form-control"
                    role="password"
                    onChange={(e) =>
                      setInputData({...inputData, password: e.target.value })
                    }
                  />
                </div>

                <div className="form-group">
                  <label htmlFor="confirmPassword">Confirm Password</label>
                  <input
                    type="password"
                    name="confirmPassword"
                    className="form-control"
                    onChange={(e) =>
                      setInputData({...inputData, confirmPassword: e.target.value })
                    }
                  />
                </div>

                <button className="btton btton-primary" name="btton-primary" onClick={handleSubmit}>
                  Register
                </button>
                <p>Already have an account?</p>
                <Link to={"/login"}>
                  <button className="btton btton-secondary">Sign In</button>
                </Link>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default SignUp;