import React, { Component } from 'react'

class StateClass extends Component {

    constructor(){
        super();
        this.state={count:0}
    }
    clickHandler = () =>{
        this.setState({count:this.state.count+1})
    }

  render() {
    return (
      <div>
        {this.state.count}
        <br />
        <button onClick = {() => {this.clickHandler()}}>clickMe</button>
      </div>
    )
  }
}

export default StateClass
