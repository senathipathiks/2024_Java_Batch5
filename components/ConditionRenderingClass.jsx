import React, { Component } from 'react'

class ConditionRenderingClass extends Component {
    constructor()
    {
        super();
        this.state = {flag : true}
    }
  render() {
    const trueEle = <div>Welcome Ganapathy</div>
    const falseEle = <div>Welcome Guest</div>
        return(this.state.flag? trueEle: falseEle);
  }
}

export default ConditionRenderingClass
