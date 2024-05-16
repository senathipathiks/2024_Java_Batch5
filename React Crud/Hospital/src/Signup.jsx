import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import './Signup.css';

function Signup() {
        const[inputField,setInputFields]=useState( {
            username:"",
            email:"",
            password:"",
            cpassword:""

        });

        const[errors,setErrors]=useState({});
        const[submitting,setSubmitting]=useState(false);

        const validate = (inputField) =>{
            let errors = {};
            if(inputField.username.length < 5){
                errors.username = "username is too short";
            }
            if(inputField.email.length < 15){
                errors.email =" email is too short";
            }
            if(inputField.password.length < 7){
                errors.password = "password is too short";
            }
            if(inputField.cpassword != inputField.password){
                errors.cpassword = "password not matched";
            }
            return errors;
;
        } 

        const changeHandler = (e)=>{
            setInputFields({...inputField,[e.target.name]:e.target.value});
        };

        const submitHandler = (e)=>{
            e.preventDefault();
            setErrors(validate(inputField));
            setSubmitting(true);

        };


    return (
        <div>
            <div id="con"> 
                {Object.keys(errors).length===0 && submitting ? (<span id="success" className='success'>SignUp Successfully ✓</span>):null}
            </div>
            <div id="log">
                <form onSubmit={submitHandler}>
                    <h1>SignUp</h1><br /><br />
                    <label htmlFor='username'>UserName</label><br /><br />
                    <input
                        name="username"
                        type="text"
                        value={inputField.username}
                        onChange={changeHandler}
                    >
                    </input><br /><br />

                    <label htmlFor='email'>Email</label><br /><br />
                    <input
                        name="email"
                        type="email"
                        value={inputField.email}
                        onChange={changeHandler}
                    >
                    </input><br /><br />

                    <label htmlFor='password'>Password</label><br /><br />
                    <input
                        name="password"
                        type="password"
                        value={inputField.password}
                        onChange={changeHandler}
                    >
                    </input><br /><br />

                    <label htmlFor='cpassword'>Confirm Password</label><br /><br />
                    <input
                        name="cpassword"
                        type="password"
                        value={inputField.cpassword}
                        onChange={changeHandler}
                    >
                    </input><br /><br />

                    <button className='btn btn-outline-success'>Submit</button><br /><br />
                   <Link to="/login">Back to Login</Link>
                </form>
            </div>
            <div id="align">
                {errors.username ? (<p className='error'>Username should be at least 5 characters</p>):null}
                {errors.email ?(<p className='error'>Email should be at least 15 characters</p>):null}
                {errors.password ?(<p className='error'> Password should be at least 7 characters</p>):null}
                {errors.cpassword?(<p className='error'>Confirm password should be matched to password</p>):null}
            </div>
        </div>
    );
}

export default Signup;
