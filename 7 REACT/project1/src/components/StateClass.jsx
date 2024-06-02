import React, { Component } from 'react'

class StateClass extends Component {
    
    constructor(){
        super();
        this.state={count:0}
    }
    ClicKHandler(){
        this.setState({count:this.state.count+1})
    }
  render() {
    return (
      <div>
        <h1>{this.state.count}</h1>
        <button onClick={()=>{this.ClicKHandler()}}>click me</button>
      </div>
    )
  }
}

export default StateClass
