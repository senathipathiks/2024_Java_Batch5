import React, { Component } from 'react'
// import PropTypes from 'prop-types'

export default class StateClass extends Component {
  constructor(){
    super();
    this.state = {count:0, msg:"Welcome to my page"};
    // this.state = {};
  }
  subscribe() {
    this.setState({msg: "Thanks for Subscribing!!!"});
  }

  counter(){
    this.setState({count: this.state.count + 1});
  }

  render() {
    return (
      <div>
        <h1>{this.state.msg}</h1>
        <button onClick={ ()=> this.counter()}>Count</button>
        <h2>{this.state.count} </h2>
        <button onClick={ () => this.subscribe()}>Subscribe</button>
      </div>
    )
  }
}
