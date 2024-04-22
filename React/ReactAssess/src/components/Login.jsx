import React from 'react'
import { useNavigate } from 'react-router-dom';



function Login() {
    const navigate = useNavigate();
    let handle = (e) =>{
        alert("Log in success!!!");
        navigate("/user");
    }
  return (
    <>
    <div className='display-1 text-center'>
      Login
    </div>
    <br />
    <div className="field text-center">
        Username <br />
        <input type="text" />
        <br />
        Password <br />
        <input type="password" /> <br /> <br />
        <button className='btn btn-success' onClick={handle}>Login</button>
    </div>
    </>
  )
}

export default Login
