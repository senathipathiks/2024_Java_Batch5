import React from 'react'

function PropsEx(props) {
  const{name,city}=props;
  return (
    <div>
      <h1>Welcome{props.name} from the city of {props.city}</h1>
    </div>
  )
}

export default PropsEx
