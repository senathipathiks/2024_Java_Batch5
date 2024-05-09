import React, { Component } from 'react'

export class PropsClass extends Component {
  render() {
    const{name,age}=this.props; //props destructuring
    return (
      <div>
        {/* <h1>Welcome Class component {this.props.name} age{this.props.age}</h1> */}
        Welcome class component {name} age{age}<br></br>
        {this.props.children}
      </div>
    )
  }
}

export default PropsClass
