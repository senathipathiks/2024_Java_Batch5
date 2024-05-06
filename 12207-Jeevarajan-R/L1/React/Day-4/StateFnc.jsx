import React,{useState} from 'react'


function StateFnc() {
    var [count, setCount] = useState(0);
    var [msg,setMsg] = useState("Welcome to my channel");
    function counter(){
        setCount(count+1);
    }
    function settMsg(){
        setMsg("Thanks for superising!!!");
    }
  return (
    <div>
        <h1>{msg}</h1>
        <button onClick={counter} >Count</button> 
        <h2>{count}</h2>
        <button onClick={settMsg}>Subscribe</button>     
    </div>
  )
}

export default StateFnc
