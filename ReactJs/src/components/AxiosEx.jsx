import React, { useEffect, useState } from 'react';
import axios from 'axios';
function AxiosEx() {
    const [users,setUsers] = useState([]);
    const URL = 'https://jsonplaceholder.typicode.com/users'

    useEffect( () => {
        axios
        .get(URL)
        .then((response) => {
            console.log(response.data);
            setUsers(response.data);
        })
        .catch((err) => {
            console.log(err.message)
        })
    },[])


  return (
    <div>
        {users.map(x => <li>{x.username}</li>)}
      
    </div>
  );
}

export default AxiosEx;
