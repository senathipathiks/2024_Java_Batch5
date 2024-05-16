import React, { Component } from 'react';

export class EventBinding extends Component {

    constructor(){
        super();
        this.state = {count:0}
        //this.clickHandler = this.clickHandler.bind(this); //  by using bind method explicitly
    }

//    clickHandler(){
//         this.setState({count:this.state.count+1})
//     }  

    clickHandler = () => {this.setState({count:this.state.count+1})} // by using arrow function we binded
  render() {
    return (
      <div>
        <h1>{this.state.count}</h1>
        <br />
        <button onClick={this.clickHandler}>Click Me</button>
      </div>
    );
  }
}

export default EventBinding;
