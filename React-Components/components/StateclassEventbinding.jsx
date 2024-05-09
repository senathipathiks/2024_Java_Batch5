import React, { Component } from 'react'

export class StateclassEvent extends Component {
    constructor()
    {
        super();
        this.state={count:0}
        //this.clickHandler=this.clickHandler.bind(this); //constructor level binding
    }
    // clickHandler(){
    //     this.setState({count:this.state.count+1})
    // }

    clickHandler=()=>{this.setState({count:this.state.count+1})}   //arrow binding,automatically invoked
  render() {
    return (
      <div>
        <h1>{this.state.count}</h1>
        <br />
        <button onClick={this.clickHandler}>Click me</button>
      </div>
    )
  }
}

export default StateclassEvent
