import { dark, light } from '@mui/material/styles/createPalette';
import React from 'react'
import { useEffect } from 'react';
import { useState } from 'react';


function Fetch() {
 const [posts ,setPosts] =useState([]);
 const URL = 'https://jsonplaceholder.typicode.com/photos'

 useEffect(()=>{
    fetch(URL)
     .then((res)=>res.json())
     .then((data)=>{console.log(data);
    setPosts(data);
    })
    .catch((err)=>{
        console.log(err.message);
    });
 },[])







  return (
    <div>
      <ul>
        {posts.map(x=> <img src={x.url} alt="" width={"100%"} height={"70%"}  />)}
      </ul>
    </div>
  )
}

export default Fetch
