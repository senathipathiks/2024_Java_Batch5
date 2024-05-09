import React from 'react'
import { useState } from 'react';
import { useEffect } from 'react';

function UseEffectEx() {
    const[count,setCount]=useState(0);
    useEffect(()=>{
            setTimeout(()=>{
                setCount((count)=>count+1);
            },500);
        })
    
  return (
    <div>
      <h1>UseEffect {count}</h1>
    </div>
  )
}

export default UseEffectEx