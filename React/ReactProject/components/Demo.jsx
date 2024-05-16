import { useState, useEffect } from "react";
import React from "react";
import ChildComponent from"./ChildComponent";

function Demo() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    setTimeout(() => {
      setCount((count) => count + 1);
    }, 1000);
    console.log("Child Component");
  });

  return (
  <div>
    <h1>I have rendered {count} times!</h1>
  <ChildComponent name="Ani"></ChildComponent>
  </div>
  
  )
}
export default Demo