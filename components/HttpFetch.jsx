import React from 'react'
import { useEffect } from 'react'
import { useState } from 'react'

function HttpFetch() {
    const [posts, setPosts] = useState([]);
    const URL = 'https://jsonplaceholder.typicode.com/posts'

    useEffect(() => {
        fetch(URL)
            .then((res) => res.json())
            .then((data) => {
                console.log(data);
                setPosts(data);
            })
            .catch((err) => {
                console.log(err.message);
            });

    }, []);
    return (

        <ul>
            {posts.map(x => <li>{x.title}</li>)}
        </ul>

    )
}

export default HttpFetch
