import React from 'react'
import Carousel from 'react-bootstrap/Carousel';
import { Link } from "react-router-dom";
import "../Styles.css";

function Home() {
  return (
    <div className='bodycenter'>
      <center><h1 className='text-dark'>Welcome to Nalan</h1>
      <br />
      <Carousel data-bs-theme="dark" className='h-50'>
      <Carousel.Item className='text-center' interval={2000}>
          <h5 className='titlecolor'>Blood Request</h5>
          <p className='descolor'>You can request for blood based.</p>
          <br />
      </Carousel.Item>
      <Carousel.Item className='text-center' interval={2000}>
          <h5 className='titlecolor'>Blood Bank</h5>
          <p className='descolor'>All type of bloods are stored and Managed.</p>
          <br />
      </Carousel.Item>
      </Carousel>
  
      <div className='d-flex justify-content-around'>
      <Link to="/viewRequests" className="btn btn-primary text-end">Blood Request</Link>
      <Link to="/viewBloods" className="btn btn-primary text-end">Blood Bank</Link>
      </div>
      </center>
    </div>
  )
}

export default Home
