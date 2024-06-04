import React from 'react'

function PropsEx(props) {
    const{name,city,location} = props; //destructuring
  return (
    <div>
      <h1>Welcome {name} from the city of {city} and the location is {location} </h1>
    </div>
  )
}

export default PropsEx
