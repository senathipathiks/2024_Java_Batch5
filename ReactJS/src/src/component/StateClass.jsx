import React, { Component } from 'react'

class StateClass extends Component {
 
    constructor(){
        super();
        this.greet=
        this.state={count:0 ,msg : "Welcome to our page!! Please like share and follow!"};
        this.clickHandler=this.clickHandler.bind(this);
    }
 

    clickHandler(){
      this.setState({count:this.state.count+1})
    }
    // ClickHandler=()=>{
    //     this.setState({count:this.state.count+1})
    // }
   ClickSubsc=()=>{
    this.setState({msg:"Thank you for following our page"})
   }
 
 
 
 
    render() {
    return (
      <div>
        <h2>{this.state.count}</h2>
        <br />
        <button onClick={()=>this.clickHandler()}>Click me</button>
        <br />
        <h2>{this.state.msg}</h2>
        <button onClick={()=>this.ClickSubsc()}>Follow</button>
      </div>
    )
  }
}

export default StateClass
