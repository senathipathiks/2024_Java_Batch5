import React from 'react'
import "./Login.css"
// import img from './images/payroll.jpg';
function Main() {
  return (
    <>
    
    {/* <div className='head'>
    <center><h1 className='display-1'>
      Employee PayRoll System</h1></center>
    </div> */}
    {/* <center><div><img src={img} id='homeimg' className='img-responsive d-flex justify-content-center' alt="" /></div></center> */}

    <div class="text-block">
    <h4 style={{fontSize:"20px",textDecoration:"none",color:"wheat"}}>This is Employee PayRoll System</h4>
    <p style={{fontSize:"20px",textDecoration:"none", color:"gray"}}>Manage your payroll here</p>
    <a href="/viewEmployee" style={{textDecoration:"none",color:"white"}}><button  style={{fontSize:"20px",textDecoration:"none"}} > Get Started</button></a>
  

  </div>

</>
  )
}

export default Main
