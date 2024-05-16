import React,{Component} from 'react'

function List() {
    const myELement=(
        <ul>
            <li>One</li>
            <li>Two</li>
            <li>Three</li>
        </ul>
    )
  return (
    <div>
      {myELement}
    </div>
  )
}

export default List
