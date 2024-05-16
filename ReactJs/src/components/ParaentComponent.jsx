import React, { useEffect, useState } from 'react';
import ChildComponent from './ChildComponent';

function ParaentCoponents() {
    const [count,setCount] = useState(0);

    useEffect(() =>{
        setTimeout( () => {
            setCount(()=>count+1);
        },1000)
        console.log("paraent component")
    })
  return (
    <div>
      <h1>{count}</h1>
      <ChildComponent name="aravind Rajan"></ChildComponent>
    </div>
  );
}

export default ParaentCoponents;
