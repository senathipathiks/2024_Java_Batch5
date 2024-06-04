import React, { useState } from 'react'
import { useEffect } from 'react';

function RegistrationValidation() {

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
        <div>
            {Object.keys(errors).length === 0 && submitting ? (
                <span className="success">Registration Successfull  ✓</span>
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
                <div>

                    <label for="username">Username : </label>
                    <input
                        type="username"
                        name="username"
                        value={inputFields.username}
                        onChange={handleChange}
                    ></input>
                </div> <br />

                <div>
                    <label for="password">Password : </label>
                    <input
                        type="password"
                        name="password"
                        value={inputFields.password}
                        onChange={handleChange}
                    ></input>
                </div> <br />
                <div>
                    <label for="Age">Age : </label>
                    <input
                        type="number"
                        name="age"
                        value={inputFields.age}
                        onChange={handleChange}
                    ></input>
                </div> <br />


                <button type="submit">Register</button>
            </form></center>

            <center>{errors.email ? (
                <p className="error">
                    Email should be at least 15 characters long
                </p>
            ) : null}</center>

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

            <center>{errors.age ? <p className="error"> Minimum age is 18</p> : null}</center>

        </div>
    )
}


export default RegistrationValidation
