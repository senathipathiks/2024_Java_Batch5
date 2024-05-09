import React, { Component } from 'react'

export class StateClass1 extends Component {
    constructor()
    {
        super();
        this.state={msg:"State changed by class"}
    }

    Clickmsg()
    {
        this.setState({msg:this.state.msg="Yeah!This is StateClass"})
    }

  render() {
    return (
      <div>
        <h1>{this.state.msg}</h1>
        <br />
        <button onClick={()=>{this.Clickmsg()}}>Click for msg</button>
      </div>
    )
  }
}

export default StateClass1
