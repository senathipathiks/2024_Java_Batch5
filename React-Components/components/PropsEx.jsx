import React from 'react'

function PropsEx(props) {
    const {prefname,city}=props;
    // prefname="dhars";// const we cant change,but can change as a var
  return (
    <div>
      {/* <h1>Welcome to relevantz {props.name} city {props.city} </h1> // */}
      <h1>Welcome {prefname} city {city}</h1>
      <h1>{props.children}</h1>
    </div>
  )
}

export default PropsEx
