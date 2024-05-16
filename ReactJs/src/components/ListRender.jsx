
import React from 'react';

function ListRender() {
    const arr=[10,20,30];
    const myElement = (
        <ul>
            <li>One</li>
            <li>Two</li>
            <li>Three</li>
        </ul>
    )
        const val = arr.map((item)=>{return (item*2)})

  return (
    <div>
      {myElement}
     <h1>  {val +" "} </h1>
    </div>
  );
}

export default ListRender;
