import React, { Component } from 'react'

export default class HandlerClass extends Component {
    constructor()
    {
        super();
        this.state={count:"Hi Ani"}
        this.clickHandler=this.clickHandler.bind(this);
    }
    clickHandler(){
        this.setState({count:this.state.count="Good morning"})
    }
    // clickHandler=()=>{this.setState({count:this.state.count="Good morning"})}
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



