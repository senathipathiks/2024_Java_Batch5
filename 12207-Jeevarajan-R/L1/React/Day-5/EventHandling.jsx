import React, { Component } from 'react'

export default class EventHandling extends Component {
    constructor(){
        super();
        this.state = { count:0 };
        this.clickHandler = this.clickHandler.bind(this);
    }
    clickHandler(){
        this.setState({count : this.state.count+1});
    }
  render() {
    return (
      <div>
        <h1>Counter : {this.state.count}</h1>
        <button onClick={this.clickHandler}>Count</button>
      </div>
    )
  }
}
export class LoggingButton extends React.Component {
  handleClick() {
    console.log('this is:', this);
  }

  render() {
    // This syntax ensures `this` is bound within handleClick
    return (
      <button onClick={() => this.handleClick()}>
        Click me
      </button>
    );
  }
}