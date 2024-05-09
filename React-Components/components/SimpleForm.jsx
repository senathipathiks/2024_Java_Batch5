import React, { Component } from 'react'

export class SimpleForm extends Component {
    constructor()
    {
        super();
        this.state={firstName:""};
    }

    formHandler=(event)=>{
        this.setState({firstName:event.target.value});
        //console.log(this.state.firstName);

    }

    submitHandler=(event)=>{
        event.preventDefault(); 
        console.log(this.state.firstName);
    }
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
            <p>Enter your name:{this.state.firstName}</p>
            <input type="text" onBlur={this.formHandler} name="firstName" />
            <input type="submit" />
        </form>
      </div>
    )
  }
}

export default SimpleForm
