import React from 'react'
import { useState } from 'react';

function ConditionRendering() {
    const [flag,setFlag] = useState(true);
    const trueEle = <div>Welcome Ganapathy</div>
    const falseEle = <div>Welcome Guest</div>

    // if (flag)
    //     return (trueEle)
    // else
    //     return (falseEle)

    return(flag? trueEle: falseEle);
}

export default ConditionRendering
