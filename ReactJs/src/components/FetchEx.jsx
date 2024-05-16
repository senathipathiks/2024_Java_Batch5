import React, { useEffect, useState } from 'react';

function FetchEx() {
    const [posts,setPosts] = useState([]); //array formate
    const URL = 'https://jsonplaceholder.typicode.com/posts' //fetch url by using temporary server
    
    useEffect( () => {
        fetch(URL)
            .then((res) => res.json()) //it is in noraml format convert into json format
            .then((data) => {
                console.log(data);
                setPosts(data); //update the posts
            })
            .catch((err) =>{
                console.log(err.message);
            })
    },[]);


  return (

        <ul>
            {posts.map(x => <li>{x.title}</li>)}
        </ul>
      

  )
}

export default FetchEx;
