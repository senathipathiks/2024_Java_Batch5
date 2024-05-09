import React, { useState } from 'react'

function Statefun1() {
    const[msg,setMsg]=useState("Welcome by Supraja");
    function Click(){
        setMsg("Trust timings");
        setMsg("Be Kind to everyone");
    }
  return (
    <div>
      <h1>{msg}</h1>
      <br />
      <button onClick={()=>Click()}> Update msg here</button>
    </div>
  )
}

export default Statefun1
