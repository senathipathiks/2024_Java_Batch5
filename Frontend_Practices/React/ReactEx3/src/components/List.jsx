import React from 'react'

function List() {

    const arr=[100,200,300];
    const myElement=(
        <ul>
            <li>One</li>
            <li>Two</li>
            <li>Three</li>
        </ul>
    )

    const val=arr.map((item)=>{return(item)})
  return (
    <div>
      
      {myElement}
      <h1>{val}</h1>
    </div>
  )
}

export default List
