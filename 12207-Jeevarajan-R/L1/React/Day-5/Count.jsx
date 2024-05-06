import React, { useState } from 'react'
import Child from './Child';

export default function Count() {
  const [count, setCount]=useState(0);

  setTimeout(()=>{
    setCount(count+1)
  },2000);
  console.log("Parent Component");

    return (
    <div>
      <h1>{count}</h1>
      <Child name="James"></Child>
    </div>
  )
}

