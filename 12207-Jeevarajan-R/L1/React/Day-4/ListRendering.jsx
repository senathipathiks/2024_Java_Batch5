import React from 'react'

export default function ListRendering() {
    var myList = (
        <ul>
            <li>One</li>
            <li>Two</li>
            <li>Three</li>
        </ul>
    )
    var arr = [10,20,30];
    arr = arr.map((it)=>{return(<li>{it}</li>)})
  return (
    <div>
        <div>{myList}</div>
        <div>
            <ol>

            {arr}
            </ol>
        </div>
    </div>
  )
}
