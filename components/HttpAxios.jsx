import React from 'react'
import { useEffect } from 'react'
import { useState } from 'react'
import axios from 'axios';

function HttpAxios() {
    const [posts, setPosts] = useState([]);
    const URL = 'https://jsonplaceholder.typicode.com/posts'

    useEffect(() => {
        axios   .get(URL)
            .then((response) => {
                setPosts(response.data);
            })
            .catch((err) => {
                console.log(err);
            });

    }, []);
  return (
       <ul>
            {posts.map(x => <li>{x.title}</li>)}
        </ul>
  )
}

export default HttpAxios
