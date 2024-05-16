import React, { useEffect, useState } from 'react';

function Fetcheg2() {
    const [user, setUser] = useState([]);
    const URL = 'https://jsonplaceholder.typicode.com/users'

    useEffect( (e) => {
        fetch(URL)
        .then((response)=>response.json())
        .then((data) => {
            console.log(data);
            setUser(data);
        })
        .catch((err)=>{
            console.log(err.message);
        })
    })

  return (
    <div>
      <ul>
        {user.map(x => <li>{x.id}</li>)}
      </ul>
    </div>
  );
}

export default Fetcheg2;
