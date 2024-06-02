import React, { useState } from 'react'

function StateFun() {
    const [count,setCount]=useState(0);
    function clickHandler(){
        setCount(count+1);
    }
  return (
    <div>
      <h1>{count}</h1>
      <button onClick={()=>{clickHandler()}}>+++</button>
    </div>
  )
}

export default StateFun
