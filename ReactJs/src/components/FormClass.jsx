import React, { useState } from 'react';

function FormClass() {
    const [lastName,setLastname] = useState("");

    const formHandler = (e)=>{
        setLastname(e.target.value)
    }

    const submitHandler = (e) =>{
        e.preventDefault();
        console.log(lastName)
    }

  return (
    <div>
        <form onSubmit={submitHandler}>
            <p>Enter your Last name :{lastName}</p>
            <input type="text" onBlur={formHandler} name="lastName" />
            <input type="submit" />
        </form>
      
    </div>
  );
}

export default FormClass;
