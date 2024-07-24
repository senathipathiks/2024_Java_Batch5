import React, { useEffect, useState } from "react";
import ChildComponent from "./ChildComponent";

function Memo() {
  var [count, setCount] = useState(-1);

  useEffect(() => {
    setTimeout(() => {
      setCount((count) => count + 1);
    }, 2000);
  });

  console.log("Parent Component");

  return (
    <>
    <h1>{count}</h1>
    <ChildComponent name="Nandha"></ChildComponent></>
  
);
}

export default Memo;
