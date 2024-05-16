import React, { useEffect, useState } from 'react';
import axios from 'axios';

function Axious() {
    const [posts, setPosts] = useState([]);
    const URL = 'https://jsonplaceholder.typicode.com/posts'

    useEffect (() =>{
        axios
        .get(URL)
        .then((response) => {
            setPosts(response.data);
        })
        .catch((err) =>{
            console.log(err.message);
        });
    },[]);
  return (
    <div>
        <ul>
            {posts.map(x=><li>{x.title}</li>)}
        </ul>
      
    </div>
  );
}

export default Axious;
