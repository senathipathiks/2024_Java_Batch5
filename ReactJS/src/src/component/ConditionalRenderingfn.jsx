import React, { Component } from 'react'
//import { useState } from 'react'
// function ConditionalRenderingfn() {
//     const [flag , setflag] = useState(true);                          //function 
//     const trueEle =<div>Welcome vashanth</div>
//     const falseEle= <div>Welcome Guest user</div>
//   return (flag? trueEle :falseEle );
// }

// export default ConditionalRenderingfn

export class ConditionalRenderingfn extends Component {                        //class

constructor(){
    super();
    this.states={flag:false};
}

  render() {

        const trueEle =<div>Welcome vashanth</div>
        const falseEle= <div>Welcome Guest user</div>
      return (this.states.flag? trueEle :falseEle );
   
  }
}

export default ConditionalRenderingfn;
