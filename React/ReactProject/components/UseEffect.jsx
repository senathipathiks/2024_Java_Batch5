import { useState, useEffect } from "react";
import React from "react";

function UseEffect() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    setTimeout(() => {
      setCount((count) => count + 1);
    }, 1000);
  });

  return <div>I have rendered {count} times!</div>;
}
export default UseEffect