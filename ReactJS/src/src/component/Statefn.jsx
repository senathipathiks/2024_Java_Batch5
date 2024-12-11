import React, { useState } from 'react'

function Statefn() {
  const  [cnt ,setcnt ] =useState(0);
  function ClickHandler(){
    setcnt(cnt+1)
  }
  const [msg , setmsg ] = useState("Welcome to my page ");
  function Subscribe(){
    setmsg("Thankyou for subcribing");
  }
  return (
    <div>
      <h2>{cnt}</h2>
      <button onClick={()=>ClickHandler()}>Click here</button>  
      <br />
      <h2>{msg}</h2>
      <button onClick={()=>Subscribe()}>subscribe</button>  
    </div>
  )
}

export default Statefn
