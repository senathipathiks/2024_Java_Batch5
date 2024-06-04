import React, { Component } from 'react'

class EventBindingHandlerCls extends Component {
    constructor(){
        super();
        this.state = {count : 0}
        this.clickEventBindingHandlerCls=this.clickEventBindingHandlerCls.bind(this)


    }
    clickEventBindingHandlerCls(){
        this.setState({count:this.state.count+1})
    }

    // clickEventBindingHandlerCls=()=> this.setState({count:this.state.count+1})          binding using Arrow functions 
  render() {
    return (
      <div>
        <h1>{this.state.count}</h1>
        <br />
        <button onClick = {this.clickEventBindingHandlerCls}>ClickMe</button>
      </div>
    )
  }
}

export default EventBindingHandlerCls
