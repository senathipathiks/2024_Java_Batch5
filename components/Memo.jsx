import React from 'react'
import { useState } from 'react'
import ChildComponent from './ChildComponent';

function Memo() {
    const[count,setCount] = useState(0);
   
        setTimeout(() =>{
            setCount(count + 1);
        },2000);
        console.log("Parent Component");
  return (
    <div>
      <h1> {count} </h1>
      <ChildComponent name = "React"></ChildComponent>
    </div>
  )
}

export default Memo
