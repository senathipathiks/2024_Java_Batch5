//import React, { Component } from 'react'

// export class Forms extends Component {
//     constructor(){

//         super();
//         this.state ={fname : ""};
//         this.state ={mail : ""};
//         this.state ={pwd : ""};
//     }
//     formHandler  = (event)=>{
//         this.setState({fname:event.target.value});
//         this.setState({mail:event.target.value});
//         this.setState({pwd:event.target.value});


//     } ;
//     submitHandler = (event)=>{
//         event.preventDefault();
//         console.log(this.state.fname);
//         console.log(this.state.mail);
//         console.log(this.state.pwd);
//         alert(this.state.fname+this.state.fname+this.state.fname)
//     }


//   render() {
//     return (
//       <div>
//         <form onSubmit={this.submitHandler}>
//          <p>Your Name is : {this.state.fname} </p>
//          <input type="text" onBlur={this.formHandler}  name='fname'/><br />
//          <p> Email id is : {this.state.mail} </p>
//          <input type="email" onBlur={this.formHandler}  name='mail'/><br />
//          <p>Your Password is : {this.state.pwd} </p>
//          <input type="password" onBlur={this.formHandler}  name='pwd'/>
//           <br />
//         <br /> <input type="submit" />


//         </form>

//       </div>
//     )
//   }
// }

// export default Forms
import React, { useState } from "react";

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
   
  const User = () => {
    // defaults
    const [enteredUsername, setEnteredUsername] = useState("");
    const [enteredAge, setEnteredAge] = useState("");
    const [selectedHobby, setSelectedHobby] = useState("archery");
   
    // event handlers for each form field
    const usernameChangeHandler = (event) => {
      setEnteredUsername(event.target.value);
    };
    const ageChangeHandler = (event) => {
      setEnteredAge(event.target.value);
    };
    const hobbydropdownhandler = (event) => {
      setSelectedHobby(event.target.value);
    };
   
    // form submission
    const submitHandler = (event) => {
      event.preventDefault();
      // entered details user object
      const user = {
        username: enteredUsername,
        age: enteredAge,
        hobby: selectedHobby
      };
     
      // fixme - remove the alert with proper implementation
      alert(JSON.stringify(user));
    };
   
    return (
      <div>
        <form onSubmit={submitHandler}>
          {/* username input field */}
          <label htmlFor="username">Username</label>
          <input
            id="username"
            type="text"
            value={enteredUsername}
            onChange={usernameChangeHandler}
          ></input>
   
          {/* age input field */}
          <br />
          <label htmlFor="age">Age (years)</label>
          <input
            id="age"
            type="number"
            value={enteredAge}
            onChange={ageChangeHandler}
          ></input>
   
          {/* hobbies dropdown */}
          <br />
          <label htmlFor="hobbies">Hobbies</label>
          <select
            id="hobbies"
            value={selectedHobby}
            onChange={hobbydropdownhandler}
          >
            {DUMMY_HOBBIES.map((item, idx) => (
              <option key={idx} value={item}>
                {item}
              </option>
            ))}
          </select>
   
          {/* form submit button */}
          <br />
          <button type="Submit">Add user</button>
        </form>
       
      </div>
    );
  };
   
  export default User;