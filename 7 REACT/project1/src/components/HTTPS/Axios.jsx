import axios from 'axios';
import React, { useEffect } from 'react'

function Axios() {
    const [posts, setPost] = React.useState([]);
    const URL = 'https://jsonplaceholder.typicode.com/posts'

    useEffect(() => {
        axios.get(URL)
        .then((response) => {
            console.log(response.data);
            setPost(response.data);
        })
        .catch((err)=>{
            console.log(err.massage);
        })
    }, []);

  return (
    <div>
        <ul>
        {posts.map(x => <li>{x.title}</li>)}
      </ul>
    </div>
  )
}

export default Axios
