import React, { Component } from 'react'

class ConClass extends Component {
    constructor(){
        super();
        this.state={flag:true}
    }
    
  render() {
    const trueEle=<div>Welcom Gopi</div>
    const falseEle =<div>Welcome new user</div>
    return (this.state.flag? trueEle:falseEle);
  }
}

export default ConClass
