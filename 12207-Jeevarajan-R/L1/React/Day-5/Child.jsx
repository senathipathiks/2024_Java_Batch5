import React from 'react'

function Child({name}) {
    console.log("Child Component");
  return (
    <div>
      <h1>{name}</h1>
    </div>
  )
}
export default React.memo(Child);