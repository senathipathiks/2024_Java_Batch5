import React, { Component } from 'react'

class TextField extends Component {
    constructor(){
        super()
        this.state = {firstName: ""}
    }
    formHander = (event) => {
        this.setState({firstName:event.target.value});
    };
    submitHandler = (event) =>{
        event.preventDefault();
        console.log(this.state.firstName);
    };
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
            <p> Your Name : {this.state.firstName}</p>
            <input type="text" onBlur={this.formHander} name="firstName"/>
            <input type="submit" />
        </form>
      </div>
    )
  }
}

export default TextField
