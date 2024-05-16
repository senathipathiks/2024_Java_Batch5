import React, {useState} from 'react';

function StateFunex2() {

    const [msg,setMsg] = useState("Welcome to my page");
    function click(){
        setMsg("Thank you for subscribing")
        
    }


  return (
    <div>
        <h1>{msg}</h1>
        <br />
        <button onClick={()=>click()}>Click Me</button>
    </div>
  )
}

export default StateFunex2;
