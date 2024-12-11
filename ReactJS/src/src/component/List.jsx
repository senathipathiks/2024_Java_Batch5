import React from 'react'

function List() {

    const arr=[1,2,3];
    const elems= (
        <ul>
        <li>One</li>
        <li>Two</li>
        <li>Three</li>
      </ul>
      
      )
      const val =arr.map((items)=>{return items});

  return(

    <div>
        <h1>{elems}</h1>
        <h1>{val}</h1>
    </div>
  )
   
   
}

export default List
