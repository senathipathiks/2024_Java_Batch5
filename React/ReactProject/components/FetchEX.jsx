import React, { useEffect, useState } from 'react'

function FetchEX() {
    const[posts,setPosts]=useState([]);
    const URL="https://jsonplaceholder.typicode.com/posts"
    useEffect(()=>
    {
        fetch(URL)
        .then((res)=>res.json())
        .then((data)=> 
            {
                console.log(data);
                setPosts(data);
            })
            .catch((err)=>
            {
                console.log(err.message);
            });
    },[]);

  return (
    <div>
      <ul>
        {posts.map(x=><li>{x.title}</li>)}
      </ul>
    </div>
  )
}
export default FetchEX;
