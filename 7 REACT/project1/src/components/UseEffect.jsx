import React, { useEffect } from 'react'
import { useState } from 'react';

function UseEffect() {
    const [count, setCount] = useState(0);
    useEffect(() => {
        setTimeout(() => {
          
            setCount((count) => count + 1);
        }, 1000)
    })
    return (
        <div>
            <h1>{count}</h1>
        </div>
    )
}

export default UseEffect
