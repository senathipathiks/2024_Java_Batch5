import React, { useEffect, useState } from 'react'

function FetchEx() {
    const[posts,setPosts]=useState([]);
    const URL='https://jsonplaceholder.typicode.com/posts'

    useEffect(()=>{
        fetch(URL)
           .then((res)=>res.json())
           .then((data)=> {
              console.log(data);
              setPosts(data);
    })

           .catch((err)=>{
            console.log(err.message);
           })
    })
  return (
    <ul>
      {posts.map(x=><li>{x.id}</li>)}
    </ul>
  )
}

export default FetchEx
