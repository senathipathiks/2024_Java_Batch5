import React, { Component } from 'react';

export class ClassCondional extends Component {
    constructor(){
        super();
        this.state = {flag:true}
    }

  render() {

    
    const trueEle = <div>Welcome Aravind!</div>
    const falseEle = <div>Welcome Guest</div>

      if(this.state.flag)
        return (trueEle)
      
      else
        return (falseEle)

    // return(this.state.flag ? trueEle : falseEle)
    
  }
}

export default ClassCondional;
