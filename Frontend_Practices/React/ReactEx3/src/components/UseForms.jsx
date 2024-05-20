// import React, { Component } from 'react'

// class UseForms extends Component {

//     constructor(){
//         super();
//         this.state = {firstName: "",lastName: "",email: "",password: ""};
//     }

//     formHandler = (event)=>{
//         this.setState({firstName: event.target.value});  
//         // console.log(this.state.firstName);
//     }
//     forms=(event)=>{
//         this.setState({lastName: event.target.value});
//     }
//     forms1=(event)=>{
//         this.setState({email: event.target.value});
//     }
//     forms2=(event)=>{
//         this.setState({password: event.target.value});
//     }

//     submitHandler = (event) =>{
//         event.preventDefault();
//         console.log(this.state.firstName);        
//         console.log(this.state.lastName);        
//         console.log(this.state.email);        
//         console.log(this.state.password);        

//     }

//   render() {
//     return (
//       <div>
//         <form onSubmit={this.submitHandler}>
//             <p>Enter your First Name: {this.state.firstName}</p>
//             <input type="text" onBlur={this.formHandler} name='firstName'/>
//             <p>Enter your Last Name: {this.state.lastName}</p>
//             <input type="text" onBlur={this.forms} name='lastName'/>
//             <p>Enter your Email Id: {this.state.email}</p>
//             <input type="email" onBlur={this.forms1} name='email'/>
//             <p>Enter your Password: {this.state.password}</p>
//             <input type="password" onBlur={this.forms2} name='password'/>
//             <input type="submit" />

//         </form>
//       </div>
//     )
//   }
// }

// export default UseForms;

import React from 'react';
import { useState } from 'react';

function UseForms() {

    var [state,setState] = useState({
        firstName: "", lastName: "", email: "", password: ""
    });

    function addUser(){
        setState(previousState=>{
            
        });
    }
  return (
    <div>
       <form onSubmit={this.submitHandler}>
//             <p>Enter your First Name: {this.state.firstName}</p>
//             <input type="text" onBlur={this.formHandler} name='firstName'/>
//             <p>Enter your Last Name: {this.state.lastName}</p>
//             <input type="text" onBlur={this.forms} name='lastName'/>
//             <p>Enter your Email Id: {this.state.email}</p>
//             <input type="email" onBlur={this.forms1} name='email'/>
//             <p>Enter your Password: {this.state.password}</p>
//             <input type="password" onBlur={this.forms2} name='password'/>
//             <input type="submit" />

//         </form>
    </div>
  )
}

export default UseForms


