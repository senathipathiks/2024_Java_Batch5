import React, { Component } from 'react'

// class PropsEX1 extends Component {
//   render() {
//     return (
//       <div>
//         <h1>Welcome {this.props.name}</h1>
//       </div>
//     )
//   }
// }
// export default PropsEX1
class PropsEX1 extends Component {
    render() {
        const{name,city}=this.props;
      return (
        <div>
          <h1>Welcome {name} from the3 city {city}</h1>
          {/* {this.props.children} */}
        </div>
      )
    }
  }
  export default PropsEX1