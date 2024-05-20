import React, { Component } from 'react'

export default class PropsClass extends Component {
  render() {
    return (
      <div> 
        <h1>Welcome {this.props.name} from the city of {this.props.city}</h1>
      </div>
    )
  }
}

