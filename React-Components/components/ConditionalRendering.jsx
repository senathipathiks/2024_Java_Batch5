import React from 'react'
import { useState } from 'react';

function ConditionalRendering() {
    const[flag,setFlag]=useState(true);
    const trueEle=<div>Welcome Supraja</div>
    const falseEle=<div>Welcome Guest</div>

    // if(flag)
    //   return (trueEle)
    // else
    //   return (falseEle)

  return (flag?trueEle:falseEle);
}

export default ConditionalRendering
