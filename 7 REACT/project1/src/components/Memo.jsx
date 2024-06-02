import React, {useState } from 'react'
import ChildMemo from './ChildMemo';

function Memo() {
    const [count, setCount] = useState(0);
        setTimeout(() => {
          
            setCount(count + 1);
        },1000);
        console.log("Parent Component");
    return (
        <div>
            <h1>{count}</h1>
            <ChildMemo name="Gopi"></ChildMemo>
        </div>
    )
}

export default Memo
