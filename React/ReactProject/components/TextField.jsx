import React, { Component } from 'react'

export default class TextField extends Component {
    constructor(){
        super();
        this.state={firstName: "" };
    }
    formHandler=(event)=>{
        this.setState({firstName:event.target.value});
        // console.log(this.state.value)
    }
    submitHandler=(event)=>{
        event.preventDefault();
        console.log(this.state.firstName)
    }
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
            <p>Enter the Name:{this.state.firstName}</p>
            <input type="text" onBlur={this.formHandler} name="firstName"/>
            <input type="Submit"/>
        </form>
      </div>
    )
  }
}
