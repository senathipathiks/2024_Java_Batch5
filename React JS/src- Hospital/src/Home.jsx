import React from 'react';
import { Link } from 'react-router-dom';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import 'bootstrap/dist/css/bootstrap.min.css';
export default function Home() {
  return (
    <div>
      <h1 style={{color:"blueviolet", textAlign:"center"}}> welcome to Hospital Mangement System</h1>
      {/* <Link to ="/home">home</Link> */}
    </div>
  )
}
