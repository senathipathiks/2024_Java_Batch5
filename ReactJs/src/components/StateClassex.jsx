import React, { Component } from 'react';

class StateClassex extends Component {
    
    constructor(){
        super();
        this.state = {msg:"welcome to my page"}

    }

    ClickMsg(){
        this.setState({msg:this.state.msg="Thank you for subscribing"})
    }
  
    render() {    
    return (
      <div>
        <h1>{this.state.msg}</h1>
        <br />
        <button onClick={()=> {this.ClickMsg()}}>ClickMe</button>
      </div>
    );
  }
}

export default StateClassex;
