import React from 'react'
import { useState } from 'react';

function Conditional() {
    const [flag,setFlag]= useState(false);
    const trueEle=<div>Welcom Gopi</div>
    const falseEle =<div>Welcome new user</div>
  return (flag? trueEle:falseEle);
} 

export default Conditional
