// import { Component } from "react";
import React, {Component}from 'react'

export default function List1() {
    function List() {
        const arr=[10,20,30];
        const myELement=(
            <ul>
                <li>One</li>
                <li>Two</li>
                <li>Three</li>
            </ul>
        )
        const val=arr.map((item)=>{return(item * 2)})
      return (
        <div>
          {myELement}
          <h1>{val+""}</h1>
        </div>
      )
    }
}
