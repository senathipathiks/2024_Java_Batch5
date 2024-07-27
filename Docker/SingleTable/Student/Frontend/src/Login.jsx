import React, { useState } from 'react';
import './Login.css';
import axios from 'axios';
import { Link } from 'react-router-dom';
import { useNavigate } from "react-router-dom";
function Login() {
    const [inputData, setInputData] = useState({
        username: "", password: ""
    });
    const naviget = useNavigate();
    let handleSubmit = (e) => {
        e.preventDefault();
        let result = validateValues(inputData);
        if (result === true) {
            axios.post("http://localhost:8050/user/login",inputData)
                .then((res) => {
                    

                    alert("login success");
                    naviget("/home");
                })
                .catch((err) => console.log(err))

        }
        

    }


    const validateValues = (inputData) => {

        if (inputData.username.length === 0) {
            alert("Please enter user id");
            return false;
        } else if (inputData.password.length === 0) {
            alert("please enter password");
            return false;
        } else {
            return true;
        }
    };

    return (
        <section  style={{ marginLeft: '400px'}}>
            <div className='container pt-5'>
                <form onSubmit={handleSubmit}>
                    <div className='login'>
                        <h1 role="heading">Sign <span>In</span></h1>
                        <hr className='text-light' />
                        <div>
                            <label role="username">UserName:</label><br />
                            <input role="userfield" type="text" name="username" className="form-control" onChange={(e) => setInputData({ ...inputData, username: e.target.value })} /><br /> <br />
                        </div>
                        <div>
                            <label role="password">Password:</label><br />
                            <input role="passfield" type="password" name="password" className="form-control" onChange={(e) => setInputData({ ...inputData, password: e.target.value })} /> <br /><br />
                        </div>
                        <div>
                            <br />
                            <button className='btn btn-danger' role="login" name="user-login">Login</button>
                        </div>
                        <div className="mt-3">
                            <span>Not registered? <Link to="/signup">Register here</Link></span>
                        </div>
                    </div>

                </form>

            </div>
        </section>
    );
}

export default Login;
