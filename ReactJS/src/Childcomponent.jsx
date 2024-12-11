import React from 'react'

function Childcomponent({name}) {
    console.log("Child component")
  return (
    <div>
      <h2>{name}</h2>
    </div>
  )
}

export default React.memo(Childcomponent)
