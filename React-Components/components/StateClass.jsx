import React, { Component } from 'react'

export class StateClass extends Component {
    constructor()
    {
        super();
        this.state={count:0}
    }

    Click=()=>{
        this.setState({count:this.state.count+1})
    }
  render() {
    return (
      <div>
        <h1>StateClass {this.state.count}</h1>
        <br />
        <button onClick={()=>(this.Click())}>Click me</button>
      </div>
    )
  }
}

export default StateClass
