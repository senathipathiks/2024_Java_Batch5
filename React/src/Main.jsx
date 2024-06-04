import React from 'react'
import "./Login.css"
import img from './images/cake.jpg';

function Main() {
  return (
    <>
    
    <div className='head'>
    <center><h1 className='display-1'>Welcome  to</h1></center>
      <center><h1>Cake Bee</h1></center>
    </div>
    <center><div><img src={img} id='homeimg' className='img-responsive d-flex justify-content-center' alt="" /></div></center>
<div>
    You are visiting the no.1 cake shop in the city.
    <br />
    location : 47/64,Rangan street,
    <br />
    chennai 28.
    <br />
    Pin : 237 378
    <br />
</div>
</>
  )
}

export default Main
