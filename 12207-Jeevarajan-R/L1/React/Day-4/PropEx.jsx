import React from 'react'
// import PropTypes from 'prop-types'

function PropEx(props) {
  return (
    <div>
      <h1>Hello {props.name} welcome to {props.city}</h1>
    </div>
  )
}

export function DeStruct(props){
    var {name,city} = props;
    return(
        <div>
         <h1>Hello {name} welcome to {city}</h1>
      </div>
    )
}

export function Child(props){
    let {name,city} = props;
    return(
        <div>
         <h1>My name is {name}, I'm from {city}</h1>
         {props.children}
      </div>
    )
}

// PropEx.propTypes = {

// }

export default PropEx

