import React, {Component, useState} from "react";

export class NameForm extends Component {
    constructor() {
      super();
      this.state = {value: ''};
  
      this.handleChange = this.handleChange.bind(this);
      this.handleSubmit = this.handleSubmit.bind(this);
    }
  
    handleChange(e) {
      this.setState({value: e.target.value});
    }
  
    handleSubmit(event) {
      // alert('A name was submitted: ' + this.state.value);
      event.preventDefault();
    }
  
    render() {
      return (
        <form onSubmit={this.handleSubmit}>
          <label>
            Name:
            <input type="text" value={this.state.value} onChange={this.handleChange} />
          </label>
          <button type="submit" value="Submit" /> 
        </form>
      );
    }
  }

  // import React from 'react'
  
  function FunctionalNameForm() {
    const [name, setName] = useState("");

    function submitHandler(event){
      event.preventDefault();
      console.log(name);
    }

    
    return (
      <div>
        <form onSubmit={submitHandler()}>
          <label htmlFor="name">Name :</label>
          <input type="text" name="name" id="nm" placeholder="Please Enter your name" onBlur={(e)=>{setName(e.target.value)}}/>
          <h2>{name}</h2>
          <button type="submit">Submit</button>
        </form>
        
      </div>
    )
  }
  
  export default FunctionalNameForm
  