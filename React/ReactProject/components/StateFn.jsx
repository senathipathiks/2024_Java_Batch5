import React, { useState } from 'react'
// import { useState } from 'react';

function StateFn() {
    const [count,setCount]=useState(0);
    function clickHandler()
    {
        setCount(count+1)
    }
  return (
    <div>
        <h1>{count}</h1><br/>
        <button onClick={()=>clickHandler()}>Click Me</button>
      
    </div>
  )
}

export default StateFn
