import React, { useState } from 'react'
import { useEffect } from 'react';
import './Login.css'
import './App2.css'
import './Home.css'

function Register() {

    const [inputFields, setInputFields] = useState({
        email: "",
        username: "",
        password: "",
        age: null
    });

    const [errors, setErrors] = useState({});
    const [submitting, setSubmitting] = useState(false);

    const validateValues = (inputValues) => {
        let errors = {};
        if (inputValues.email.length < 15) {
            errors.email = "Email is too short";
        }
        if (inputValues.username.length < 10) {
            errors.username = "Username is too short";
        }
        if (inputValues.password.length < 5) {
            errors.password = "Password is too short";
        }
        if (!inputValues.age || inputValues.age < 18) {
            errors.age = "Minimum age is 18";
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
        
            {Object.keys(errors).length === 0 && submitting ? (
                <span className="success text-success" >Registration Successfull  ✓</span>
            ) : null}

            <center><form onSubmit={handleSubmit}>
                <h3 class="text-center"> Registration</h3><br></br>
                <div>

                    <label for="email">Email : </label>
                    <input
                        type="email"
                        name="email"
                        value={inputFields.email}
                        onChange={handleChange}
                    ></input>
                </div> <br />
                <center>{errors.email ? (
                <p className="error text-danger">
                    Email should be at least 15 characters long
                </p>
            ) : null}</center>

                <div>

                    <label for="username">Username : </label>
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
                    <label for="password">Password : </label>
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
                <div>
                    <label for="Age">Age : </label>
                    <input
                        type="number"
                        name="age"
                        value={inputFields.age}
                        onChange={handleChange}
                    ></input>
                </div> <br />
                <center>{errors.age ? <p className="error text-danger"> Minimum age is 18</p> : null}</center>


                <button type="submit" >Register</button>
            </form></center>

            
            

          </div>  

        </div>
       
    )
}


export default Register
