import React, { useState } from 'react'
import Childcomponent from './Childcomponent';
function Memoex() {
   const[count , setCount]=useState(0);
   setTimeout(()=>{
    setCount(count+1)
   },1000);
   console.log("Parent component");
  return (
    <div>
      Count :{count}
      <Childcomponent name='vashanth'></Childcomponent>
    </div>
  )
}

export default Memoex
