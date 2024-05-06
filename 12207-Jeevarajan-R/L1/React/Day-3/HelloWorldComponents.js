import React, { Component } from 'react'

export class HelloWorldComponents extends Component {
  render() {
    return (
      <div>
        <h1>Hello World !!!</h1>
      </div>
    )
  }
}

// export default HelloWorldComponents;

class NewClassCompont extends Component {
  render() {
    return (
      <div>
        <p> This is P tag</p>                
      </div>
    )
  }
}

export default NewClassCompont;


//anonymous function for greeting
export const Greet=()=>{
    return(
    <div>
        <h2>Good Morning Guys</h2>
    </div>
    )
}