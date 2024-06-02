import React from 'react'

function Props(prop) {
    const{name,city}=prop;

  return (
    <div>
      <h1>Welcome to JSX Props Mr.{prop.name}, from the city of {prop.city}. </h1>
      <h1>Welcome to JSX Props Mr.{name}, from the city of {city}. </h1>
      {prop.children}
    </div>
  )
}

export default Props

