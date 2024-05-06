import React, { useState } from 'react'

function AddUser() {

    var acc = [
        "Admin",
        "Guest",
        "Premium",
        "Regular"
    ]

    //default value of the input fields
    const [username, setUserName] = useState("");
    const [password, setPassWord] = useState("");
    const [accountType, setAccountType] = useState("Select acc type");

    //template of the JSON file
    
    function userNameHandler(e){
        setUserName(e.target.value);
    }
    function passWordHandler(e){
        setPassWord(e.target.value);
    }
    function accountTypeHandler(e){
        setAccountType(e.target.value);
    }
    
    //this will change objects into JSON file.
    function submitHandler(e){
        e.preventDefault();
        const user = {
            Username:username,
            Password:password,
            AccountType:accountType
        };
        alert(
            JSON.stringify(user)
            );
    } 

    //this is the render return method
    return (
    <div>
        <form onSubmit={submitHandler}>

            {/* getting username  */}
            <label htmlFor="username">Userame :</label>
            <input type="text" name="username" id="username" placeholder='please enter your username' onBlur={userNameHandler} required/><br />

            {/* getting password */}
            <label htmlFor="username">Password :</label>
            <input type="password" name="username" id="username" placeholder='please enter your username' onBlur={passWordHandler} required/><br />


            {/* getting account type */}
            <label htmlFor="accTp">Account Type :</label>
            <select name="accTp" id="actp" onChange={accountTypeHandler} required>
                {acc.map((item,idx) =>(
                    <option key={idx} value={item}>{item}</option>
                ))}
            </select>

            {/* submit button */}
            <div>
                <button type='submit'>Add user</button>
            </div>
        </form>
        
    </div>
    )
}

export default AddUser