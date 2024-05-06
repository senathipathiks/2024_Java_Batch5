import  React, { useState, Component } from 'react'
// import React, { Component } from 'react'

export default function ConditonalRendering() {
    const [flag] = useState(true);
    const trueEle = <h1>Welcome Guys!</h1>;
    const falseEle = <h1>Welcome Fellas!</h1>;

    if(flag){
        return(
        <div>
            {trueEle}
        </div>)
    } else {
        return(
        <div>
            {falseEle}  
        </div>)
    }        

    // {flag ? trueEle : falseEle};


  
}



export class ClassConditonalRendering extends Component {
    constructor(){
        super();
        this.state = {
            flag1:true,
            truEle:<h1>Hello in Class Component</h1>,
            falEle : <h1>Welcome in Class Component</h1>
        }
    }

    render() {

        // if(this.state.flag1){
        //     return (
        //         <div>
        //             {this.state.truEle}
        //         </div>
        //     )
        // } else {
        //     return(
        //         <div>
        //             {this.state.falEle}
        //         </div>
        //     )
        // }
        return(this.state.flag1? this.state.truEle : this.state.falEle);
    }
}

