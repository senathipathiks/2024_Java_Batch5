import React, { Component } from 'react'

export class StateClass1 extends Component {
    constructor()
    {
        super();
        this.state={count:"Hi ANi"}
    }
    clickHandler(){
        this.setState({count:this.state.count="Good morning"})
    }
  render() {
   
    return (
      <div>
        <div>
        <h1>{this.state.count}</h1>
        <button onClick={()=>this.clickHandler()}>Click Me</button>
      </div>
      </div>
    )
  }
}

export default StateClass1
