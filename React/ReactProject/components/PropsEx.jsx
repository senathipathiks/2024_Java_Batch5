import React from 'react'

// export default function PropsEx(props) {
//   return (
//     <div>
//       <h1>WElcome {props.name} from the city {props.city}</h1>
//     </div>
//   )
// }
export default function PropsEx(props) {
    const{name,city,ID}=props;
  return (
    <div>
      <h1>WElcome {name} from the city {city} with ID of {ID}</h1>
      {props.children}
    </div>
  )
}