import React from 'react'

function List(){
    const arr = [10,20,30]; //for iterating the array elements
    const myElement=(
        <ul>
            <li>One</li>
            <li>Two</li>
            <li>Three</li>
        </ul>
    )
    const val = arr.map((item) => {return(item)})  //Map Method to be used with either arrow fns or call back fns
    return (
        <div>
            {myElement}
            <h1>{val}</h1>
        </div>
    )
}

export default List