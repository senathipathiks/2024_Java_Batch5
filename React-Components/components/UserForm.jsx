import React, { useState } from 'react'

const DUMMY_HOBBIES = [
    "swimming",
    "cricket",
    "football",
    "hockey",
    "tennis",
    "squash",
    "golf",
    "archery"
  ];

function UserForm() {
    //defaults
    const[enteredUsername,setenteredUsername]=useState("");
    const[enteredAge,setenteredAge]=useState("");
    const[selectedHobby,setselectedHobby]=useState("Archery");

    //event handlers for each form field
    const usernameChangeHandler = (event) => {
        setenteredUsername(event.target.value);
      };
      const ageChangeHandler = (event) => {
        setenteredAge(event.target.value);
      };
      const hobbydropdownhandler = (event) => {
        setselectedHobby(event.target.value);
      };

      // form submission
  const submitHandler = (event) => {
    event.preventDefault();
    // entered details user object
    const UserForm = {
      username: enteredUsername,
      age: enteredAge,
      hobby: selectedHobby
    };

    // fixme - remove the alert with proper implementation
    alert(JSON.stringify(UserForm));
  };
  return (
    <div>
      <form onSubmit={submitHandler}>
        {/* //Username input field */}
        <label htmlFor="username">Username</label>
        <input id="username" 
               type="text" 
               value={enteredUsername}
               onChange={usernameChangeHandler}
        ></input>

        {/* age input field */}
        <br />
        <label htmlFor="age">Age(years)</label>
        <input id="age"
               type="number"
               value={enteredAge}
               onChange={ageChangeHandler}
        ></input> 

        {/* hobbies dropdown */}
        <br />
        <label htmlFor="hobbies">Hobbies</label>
        <select id="hobbies"
                value={selectedHobby}
                onChange={hobbydropdownhandler}
        >
            {DUMMY_HOBBIES.map((item,idx)=>(
                <option key={idx} value={item}>
                    {item}
                </option>
            ))}
        </select>

       {/* form submit button */}
       <br />
       <button type="submit">Add user</button>
      </form>
    </div>
  )
}

export default UserForm
