import React from "react";

// import { useEffect } from "react";
import { useState } from "react";

function Photo() {
  const [posts, setPosts] = useState([]);
//   const URL = "https://api.thecatapi.com/v1/images/search?limit=10";
  async function random() {
    fetch('https://dog.ceo/api/breeds/image/random')
      .then((response) => response.json())
      .then((data) => {
        console.log(data);
        setPosts(data.message);
      })
      .catch((err) => {
        console.log(err.message);
      });
  }

  return (

    <div>
      <img src={posts} alt="" width="400px" height="400px"/>
      <button onClick={random}>Click</button>
    </div>
    
  )
}

export default Photo;
