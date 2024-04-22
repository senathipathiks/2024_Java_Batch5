import React from 'react'
import { useNavigate } from 'react-router-dom';

function Register() {

    const navigate = useNavigate();
    let handler = (e) =>{
        alert("Signin success!!!");
        navigate("/user");
    }
  return (
    <>
    <div className='display-1 text-center'>
      Register Here
    </div>
    <br />
    <div className="field text-center">
        Fullname<br />
        <input type="text" />
        <br />

        E-mail ID<br />
        <input type="email" />
        <br />


        Password <br />
        <input type="password" /> <br /> <br />
        <button className='btn btn-success' onClick={handler}>SignUp</button>
    </div>
    </>
  )
}


export default Register
