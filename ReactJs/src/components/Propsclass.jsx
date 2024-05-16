import React, { Component } from 'react';

export class Propsclass extends Component {
  render() {
    const{name,city} = this.props; //props destructuring
    return (
      <div>
         {/* <h1>Hello {this.props.name} from city of {this.props.city}</h1> */}
        <h1>Hello {name} from city of {city}</h1>
      </div>
    );
  }
}

export default Propsclass;
