import React, { Component } from 'react'

class Propsclass extends Component {
  render() {
    const {name , city} =this.props;
    return (
      <div>
        <h1>Welcome {this.props.name} fro   m the city {this.props.city}</h1>
      </div>
    )
  }                                                                                                                                             
}

export default Propsclass
