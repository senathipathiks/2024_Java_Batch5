import React, { useEffect, useState } from 'react';

function UseEffect() {

    const [count,setCount] = useState(0);

    useEffect( () => {
        setTimeout( ()=>{
            setCount(()=>count+1-0);
        },1000);
       
    } )
    
  return (
    <div>
      <h1>{count}</h1>
    </div>
  );
}

export default UseEffect;
