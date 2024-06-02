import React from 'react'

function List() {
    const arr=[10,20,30];
    const myElement =(
        <ul>
            <li>one</li>
            <li>two</li>
            <li>three</li>
        </ul>
    )
    const val = Math.min(...arr);
  return (
    <div>
      <h1>{val}</h1>
      <h1>{myElement}</h1>
    </div>
  )
}

export default List
