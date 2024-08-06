import { Container, DropdownDivider, Nav, Navbar, NavDropdown } from 'react-bootstrap';
import { Link } from 'react-router-dom';
import "./App2.css";

import React from 'react'

function Home() {
  return (
    <div>
      <Navbar expand="lg" id="home" className="bg-body-tertiary">
            <Container>
                <Navbar.Brand href="#home" className='text-light' style={{fontSize:"25px", fontFamily:"verdana",fontWeight:"bold",fontStyle:"italic"}}>Online Boutique</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        <NavDropdown  title="Products" id="basic-nav-dropdown" >
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/viewproducts"><button id="homebutton">Product Details</button></Link></NavDropdown.Item>
                            <DropdownDivider/>
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/addproduct"><button id="homebutton">Add Products</button></Link></NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                    <Nav  id="nav2">
                        <NavDropdown  title="Boutique" id="basic-nav-dropdown" >
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/viewboutique"><button id="homebutton">Boutique Details</button></Link></NavDropdown.Item>
                            <DropdownDivider/>
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/addboutique"><button id="homebutton">Add Boutique</button></Link></NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                    <Nav id="nav3">
                    <form className="d-flex" >
                        <input className="form-control" type="search" placeholder="Search" aria-label="Search" id="search" style={{fontSize:"15px",textDecoration:"none"}} />
                        <button className="btn" id="button2" type="submit" style={{fontSize:"20px",textDecoration:"none"}}>Search</button>
                    </form>
                    </Nav>
                    <Nav id="nav4">
                    <form className="d-flex" >
                        <Link to='/login'><button className="btn" id="button2" type="submit" style={{fontSize:"20px",textDecoration:"none"}}>Log Out</button></Link>
                    </form>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
        <div class="text-block">
        
        <center><h4 style={{fontSize:"25px",fontStyle:"italic",textDecoration:"none"}}>This is Online Boutique</h4>        </center>
        <center><p style={{fontSize:"25px",fontStyle:"italic",textDecoration:"none"}} >Manage your boutique products here</p></center>
        <center><button onClick id="button"><Nav.Link href="/viewproducts" style={{fontSize:"20px",textDecoration:"none",fontStyle:"italic",color:"white"}}  >Get Started</Nav.Link></button></center>
        </div>
    </div>

    
  )
}

export default Home
