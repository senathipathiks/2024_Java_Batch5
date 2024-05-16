import React from "react";
import { useState } from "react";

function ConditionalRend(){
    const[flag,setFlag]=useState(true);
    const trueEle=<div>Welcome ani </div>
    const falseEle =<div>Welcome guest</div>
    // if(flag)
    // {
    //     return (trueEle)
    // }
    // else{
    //     return (falseEle)
    // }

    return(flag? trueEle: falseEle);
}
export default ConditionalRend