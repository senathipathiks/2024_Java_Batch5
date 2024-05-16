import React from 'react';
import { Link } from 'react-router-dom';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import 'bootstrap/dist/css/bootstrap.min.css';
export default function Home() {
  return (
    <div align="center">
      <table id ="t1" border={"2px"}>
      <h1 style={{color:"black", textAlign:"center"}}> welcome to Ration Card Mangement System</h1>
      {/* <Link to ="/home">home</Link> */}
      </table>
    </div>
  )
}
