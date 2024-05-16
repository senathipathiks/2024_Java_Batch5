import React, { Component } from 'react'

export default class ConditionalClass extends Component {
    constructor()
    {
        super();
        this.state={flag:true}
    }
  render() {
    const trueEle=<div>Welcome ani </div>
    const falseEle =<div>Welcome guest</div>
    return (this.state.flag? trueEle:falseEle);
  }
}
