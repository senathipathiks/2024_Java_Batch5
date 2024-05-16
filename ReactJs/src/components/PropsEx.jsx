import React from 'react';

function PropsEx(props) {
    const{name,city,state} = props; //props destructuring
    // name=" velan"; in above change const as a var
  return (
    <div>
      {/* <h1>Welconme to Relevantz{ props.name} from City of {props.city} </h1> */}

      <h1>Welcome to Relevantz{ name} from City of {city} and state of {state} </h1>
      <h1>{props.children}</h1>
    </div>
  );
}

export default PropsEx;
