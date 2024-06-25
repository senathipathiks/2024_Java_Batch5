import { Container, DropdownDivider, Nav, Navbar, NavDropdown } from 'react-bootstrap';
import { Link } from 'react-router-dom';
import "./App2.css";

import React from 'react'

function Home() {
  return (
    <div>
      <Navbar expand="lg" id="home" className="bg-body-tertiary">
            <Container>
                <Navbar.Brand href="#home" className='text-light'>Employee Management System</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        <NavDropdown  title="Employee" id="basic-nav-dropdown" >
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/viewemployee"><button id="homebutton">Employee Details</button></Link></NavDropdown.Item>
                            <DropdownDivider/>
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/addemployee"><button id="homebutton">Add Employee</button></Link></NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                    <Nav  id="nav2">
                        <NavDropdown  title="Payroll" id="basic-nav-dropdown" >
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/viewpayroll"><button id="homebutton">Payroll Details</button></Link></NavDropdown.Item>
                            <DropdownDivider/>
                            <NavDropdown.Item href="action/3.1" id="homeback"><Link to="/addpayroll"><button id="homebutton">Add Payroll</button></Link></NavDropdown.Item>
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
        
        <center><h4 style={{fontSize:"25px",fontStyle:"italic",textDecoration:"none"}}>This is Employee Management System</h4>        </center>
        <center><p style={{fontSize:"25px",fontStyle:"italic",textDecoration:"none"}} >Manage your payroll here</p></center>
        <center><button onClick id="button"><Nav.Link href="/viewemployee" style={{fontSize:"20px",textDecoration:"none",fontStyle:"italic",color:"white"}}  >Get Started</Nav.Link></button></center>
        </div>
    </div>

    
  )
}

export default Home
