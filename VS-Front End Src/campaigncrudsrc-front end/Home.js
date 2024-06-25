import { Container, Nav, Navbar, NavDropdown } from 'react-bootstrap';
import { Link } from 'react-router-dom';
import "./App2.css";

import React from 'react'

function Home() {
  return (
    <div>
      <Navbar expand="lg" className="bg-body-tertiary bg-danger">
            <Container>
                <Navbar.Brand href="#home" className='text-light'>Online Campaign Management System</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        <NavDropdown className='bg-warning'  title="Options" id="basic-nav-dropdown" >
                            <NavDropdown.Item href="action/3.1"><Link to="/viewcampaign"><button className='bg-danger text-light'>Campaign Details</button></Link></NavDropdown.Item>
                            <NavDropdown.Divider />
                            <NavDropdown.Item href="action/3.2"><Link to="/viewcandidate"><button className='bg-danger text-light'>Candidate Details</button></Link></NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    </div>
  )
}

export default Home
