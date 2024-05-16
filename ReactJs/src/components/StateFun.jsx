import React, { useState } from 'react';

function StateFun() {
    const [count,setCount] = useState(0);
    function clickHandler(){
        setCount(count+1)
    }



  return (
    <div>
      <h1>{count}</h1>
      <br />
      <button onClick={()=>clickHandler()}>Click me</button>
    </div>
  );
}

export default StateFun;
