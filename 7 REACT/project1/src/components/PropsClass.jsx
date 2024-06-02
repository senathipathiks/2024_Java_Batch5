import React, { Component } from 'react'

 class PropsClass extends Component {
  render() {
    const{name,city}=this.props;
    return (
      <div>
        <h1>Welcome to JSX Props {this.props.name}, from the city of {this.props.city}. </h1>
      <h1>Welcome to JSX Props {name}, from the city of {city}. </h1>
      {this.props.children}
      </div>
    )
  }
}

export default PropsClass
