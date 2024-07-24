import React, { Component } from "react";

class StateClass extends Component {
  constructor() {
    super();
    this.state = { count: 0, msg: "Welcome to my page" };
    // this.clickHandler=this.clickHandler.bind(this);
  }

  clickHandler(){
    this.setState({ count: this.state.count + 10 });
  };


  // clickHandler=()=> {
  //   this.setState({ count: this.state.count + 10 });
  // };

  clickSubscribe = () => {
    this.setState({ msg: "Thanks for Subscribe" });
  };
  render() {
    return (
      <div>
        <h1>{this.state.count}</h1>
        <br />
        {/* <button onClick={() => this.clickHandler()}>Click Me</button> */}
        <button onClick={this.clickHandler}>Click Me</button>
        <h1>{this.state.msg}</h1>
        <br />
        <button onClick={() => this.clickSubscribe()}>Subscribe</button>
      </div>
    );
  }
}

export default StateClass;

// import React, { Component } from 'react'

// export class StateClass extends Component {

//     constructor(){
//         super();
//         this.state = {msg:'Welcome to my page'}
//     }

//     clickHandler=()=>{

//           this.setState({msg:'Thanks for Subscribe'})

//     }

//   render() {
//     return (
//       <div>
//         <h1>{this.state.msg}</h1><br />
// //         <button onClick={()=>this.clickHandler()}>Subscribe</button>
//       </div>
//     )
//   }
// }

// export default StateClass
