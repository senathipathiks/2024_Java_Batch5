import React, { Component } from 'react'

class PropsClassEx extends Component {
    
  render() {
    const{name,city,location} = this.props; //destructuring
    return (
      <div>
        <h1>Welcome {name} from the city of {city} and the location is {location} </h1>
        {this.props.children}
      </div>
    )
  }
}

export default PropsClassEx
