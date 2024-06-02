import React, { Component } from 'react'

class Handler extends Component {
    constructor(){
        super();
        this.state={count:0}
        this.clickHandler=this.clickHandler.bind(this)
    }
    clickHandler(){
        this.setState({count:this.state.count+1})
    }
  render(){
    return (
      <div>
        <h1>{this.state.count}</h1>
        <br ></br>
        <button onClick={this.clickHandler}>ClichMe</button>
      </div>
    )
  }
}

export default Handler
