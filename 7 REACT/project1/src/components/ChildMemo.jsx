import React from 'react'

function ChildMemo({name}) {
    console.log("Child Component");
  return (
    <div>
      <h1>{name}</h1>
    </div>
  )
}

export default React.memo(ChildMemo)
