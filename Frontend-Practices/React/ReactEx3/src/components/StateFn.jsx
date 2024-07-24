import React, { useState } from "react";

function StateFn() {
  const [count, setCount] = useState(0);
  const [msg,setMsg] = useState('Welcome to my Page');

//   clickHandler=()=>{
//     setCount(count + 1);
//   }

function clickHandler(){
    setCount(count+1);
}

function ClickSub(){
    setMsg("Thanks for Subscribe");
}



  return (
    <div>
      <h1>{count}</h1>
      <br />
      <button onClick={()=>clickHandler()}>
        Click Me
      </button>
      <h1>{msg}</h1>
      <br />
      <button onClick={()=>ClickSub()}>Subscribe
      </button>
    </div>
  );
}

export default StateFn;
