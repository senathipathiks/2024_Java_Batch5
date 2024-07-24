import React, { useEffect, useState } from 'react';

function UseEffects() {

    var [count,setCount]=useState(-1);

    useEffect(()=>{
        setTimeout(()=>{setCount((count)=>count+1);
    },1000);
});

  return (
    <h1>
      {count}
    </h1>
  )
}

export default UseEffects;
