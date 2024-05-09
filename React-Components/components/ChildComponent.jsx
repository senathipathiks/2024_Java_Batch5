//Memo
import React from 'react'

function ChildComponent({name}) {
    console.log("Child Component");
  return (
    <div>
      <h1>{name}</h1>
    </div>
  )
}

export default React.memo(ChildComponent)
