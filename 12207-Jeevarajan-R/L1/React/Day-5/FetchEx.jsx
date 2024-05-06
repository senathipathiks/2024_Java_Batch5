import React, { useEffect, useState } from 'react'

export default function FetchEx() {
    const [post, setPost] = useState([]);
    const [Img, setImg] = useState([]);
    const URL = 'https://jsonplaceholder.typicode.com/posts';

    const imgURL = 'https://jsonplaceholder.typicode.com/photos';

    useEffect(()=>{
        fetch(imgURL)
        .then((resu) => resu.json())
        .then((dat) =>{
            console.log(dat);
            setImg(dat);
        }).catch((err)=>{
            console.log(err.message);
        });
    }, [])

    useEffect(()=>{
        fetch(URL)
        .then((res) => res.json())
        .then((data) =>{
            console.log(data);
            setPost(data);
        }).catch((err)=>{
            console.log(err.message);
        });
    }, [])
  return (
    <div>
        {Img.map(i => <img src={i.url} alt={i.title}/>)} <br/>

        <ol>
            {post.map(x => <li>{x.title}</li>)}
        </ol>      
    </div>
  )
}
