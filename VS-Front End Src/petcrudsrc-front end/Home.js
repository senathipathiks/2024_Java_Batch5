import { Container, DropdownDivider, Nav, Navbar, NavDropdown } from 'react-bootstrap';
import { Link } from 'react-router-dom';
import "./App2.css";

import React from 'react'

function Home() {
  return (
    <div>
      <Navbar expand="lg" id="home" className="bg-body-tertiary">
            <Container>
                <Navbar.Brand href="#home" className='text-light' style={{fontSize:"25px", fontFamily:"verdana",fontWeight:"bold",fontStyle:"italic"}}>Online Pet Shop</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        <NavDropdown  title="PetShop" id="basic-nav-dropdown" >
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/viewpetshop"><button id="homebutton">Pet Shop Details</button></Link></NavDropdown.Item>
                            <DropdownDivider/>
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/addpetshop"><button id="homebutton">Add Pet Shop</button></Link></NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                    <Nav  id="nav2">
                        <NavDropdown  title="Pets" id="basic-nav-dropdown" >
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/viewpets"><button id="homebutton">Pets Details</button></Link></NavDropdown.Item>
                            <DropdownDivider/>
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/addpets"><button id="homebutton">Add Pets</button></Link></NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                    <Nav id="nav3">
                    <form className="d-flex" >
                        <input className="form-control" type="search" placeholder="Search" aria-label="Search" id="search" style={{fontSize:"15px",textDecoration:"none"}} />
                        <button className="btn" id="button2" type="submit" style={{fontSize:"20px",textDecoration:"none"}}>Search</button>
                    </form>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
        <div class="text-block">
        
        <center><h4 style={{fontSize:"25px",fontStyle:"italic",textDecoration:"none"}}>This is Online Pet Shop</h4>        </center>
        <center><p style={{fontSize:"25px",fontStyle:"italic",textDecoration:"none"}} >Manage your pets/products here</p></center>
        <center><button onClick id="button"><Nav.Link href="/viewpetshop" style={{fontSize:"20px",textDecoration:"none",fontStyle:"italic",color:"white"}}  >Get Started</Nav.Link></button></center>
        </div>
    </div>

    
  )
}

export default Home
