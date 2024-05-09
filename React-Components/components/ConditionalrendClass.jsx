import React, { Component } from 'react'

 class ConditionalrendClass extends Component {
    constructor()
    {
        super();
        this.state={flag:true}
    }
  render() {
    const trueEle=<div>Welcome Supraja</div>
    const falseEle=<div>Welcome Guest</div>
    return (this.state.flag?trueEle:falseEle);
  }
}

export default ConditionalrendClass
