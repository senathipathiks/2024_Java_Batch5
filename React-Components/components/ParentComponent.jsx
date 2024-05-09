import React from 'react'
import { useState } from 'react';
import { useEffect } from 'react';
import ChildComponent from './ChildComponent';

function ParentComponent() {
    const[count,setCount]=useState(0);
            setTimeout(()=>{
                setCount(count+1);
            },2000);
            console.log("Parent component");
    
  return (
    <div>
      <h1> {count}</h1>
      <ChildComponent name="Supraja"></ChildComponent>
    </div>
  )
  }

export default ParentComponent
