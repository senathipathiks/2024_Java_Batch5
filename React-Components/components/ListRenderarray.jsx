import React from 'react'

function ListRenderarray() {
    const arr=[10,20,30,40];
    const myElement=arr.map((items)=>{return (items*2)})
  return (
    <div>
      <h3>Array Elements</h3>{myElement+" "}
    </div>
  )
}

export default ListRenderarray
