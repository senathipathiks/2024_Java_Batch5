import React, { Component } from 'react';

class FormApplication extends Component {
    constructor(){
        super();
        this.state = {firstName: ""}
    }


    formHandler = (e)=>{
        this.setState({firstName:e.target.value});
    };

    submitHandler = (e) =>{
        e.preventDefault();
        console.log(this.state.firstName);
    }
  render() {
    return (
      <div>
        <form onSubmit = {this.submitHandler}>
            <p>Enter your name: {this.state.firstName}</p>
            <input type="text" onBlur={this.formHandler} name="firstName" />
            <input type="submit" />
        </form >
      </div>
    );
  }
}

export default FormApplication;
