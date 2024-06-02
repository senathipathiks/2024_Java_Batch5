import React, { Component } from 'react'

export class Subs extends Component {
    constructor(){
        super();
        this.state={x:""}
    }
    ClicKHandler(){
        this.setState({x:this.x="Thank you for Subscribing"})
    }
  render() {
    return (
      <div>
        <h1>This in my new youtube channel:</h1>
        <h2> {this.state.x}</h2>
        <button onClick={()=>{this.ClicKHandler()}}>SUBSCRIBE</button>
        
      </div>
    )
  }
}

export default Subs
