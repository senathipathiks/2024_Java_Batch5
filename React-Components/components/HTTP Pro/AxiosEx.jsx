import React, { useEffect, useState } from 'react'
import axios from 'axios';

function AxiosEx() {
    const[posts,setPosts]=useState([]);
    const URL ='https://jsonplaceholder.typicode.com/posts';
    useEffect(()=>{
        axios.get(URL)
             .then((response)=>{
                setPosts(response.data);
             })

             .catch((err) => {
                console.log(err);
             })
    })
  return (
    <ul>
     <li>
     {posts.map(x=>
     <li>
        <strong>User id:</strong>{x.userId}
        <br />
        <strong>Title:</strong>{x.title}
        <br />
        <strong>Body:</strong>{x.body}
        <br />
        <strong>Id:</strong>{x.id}
        <br />
        </li>)}
     </li>
    </ul>
   
  )
}

export default AxiosEx
