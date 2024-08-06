import axios from "axios";
import React, { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import "./SignUp.css";
 
function SignUp() {
  const [inputData, setInputData] = useState({
    userId: "",
    userName: "",
    email: "",
    password: ""
  });
 
  const navigate = useNavigate();
 
  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
 
    if (result === true) {
      axios
       .post("http://localhost:4444/user", inputData)
       .then((res) => {
        alert("Registered Successfully !!!");
          navigate("/home");
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
                    role="username"
                    className="form-control"
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
                    role="email"
                    className="form-control"
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
                    role="password"
                    className="form-control"
                    onChange={(e) =>
                      setInputData({...inputData, password: e.target.value })
                    }
                  />
                </div>
 
                <button className="btton btton-primary" onClick={handleSubmit}>
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