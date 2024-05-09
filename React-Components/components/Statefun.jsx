import React, {useState} from 'react'

function Statefun() {
    const[count,setCount]=useState(0); //usestate is hooks method,changing value of the state
    function clickHandler(){
        setCount(count+1)
    }
  return (
    <div>
      <h1>Function State {count}</h1> 
      <br />
      <button onClick={()=>clickHandler()}>Click me</button>
    </div>
  )
}

export default Statefun
