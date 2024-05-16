import React, { Component } from 'react'

class StateClass extends Component {
    constructor()
    {
        super();
        this.state={count:0}
    }
    clickHandler(){
        this.setState({count:this.state.count+1})
    }
  render() {
    return (
      <div>
        <h1>{this.state.count}</h1>
        <button onClick={()=>this.clickHandler()}>Click Me</button>
      </div>
    )
  }
}

export default StateClass
