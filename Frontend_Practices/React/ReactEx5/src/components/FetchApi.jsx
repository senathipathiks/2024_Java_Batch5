// import React, { useEffect, useState } from 'react'

// function FetchApi() {

//     const [posts,setPosts] = useState([]);
//     const URL = 'https://jsonplaceholder.typicode.com/posts';

//     useEffect(()=>{
//         fetch(URL)
//         .then((res)=>res.json())
//         .then((data)=>{
//             console.log(data);
//             setPosts(data);
//         })
//         .catch((err)=>{
//             console.log(err.message);
//         });
//     }, []);
//   return (
//     <div>
//         <ul>{posts.map(x=><li>{x.title}</li>)}</ul>
//         <ul>{posts.map(y=><li>{y.body}</li>)}</ul>

//     </div>
//   )
// }

// export default FetchApi;

import React,{ useState} from 'react'

function FetchApi() {

    const [posts,setPosts] = useState([]);
    // const URL = 'https://dog.ceo/api/breeds/image/random';

async function generate(){
        fetch('https://dog.ceo/api/breeds/image/random')
        .then((res)=>res.json())
        .then((data)=>{
            console.log(data);
            setPosts(data.message);
        })
        .catch((err)=>{
            console.log(err.message);
        });
    }

  return (
    <div>
       {/* <ul>{posts.map(img=><img src={img.thumbnailUrl} alt="" />)}</ul> */}
       <img src={posts} alt=""  height="400px" width="500px" />
       <button onClick={generate}>Click to generate Dogs</button>

    </div>
  )
}

export default FetchApi;

