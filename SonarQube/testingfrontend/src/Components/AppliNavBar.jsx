import React from 'react'
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';

export default function AppliNavBar() {
  return (
    <>
      <Navbar bg="dark" data-bs-theme="dark" className='static'>
        <Container>
          <Navbar.Brand href="/" className='text-danger'>Blood Bank Management System</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="/viewRequests" className='text-light'>Blood Request</Nav.Link>
            <Nav.Link href="/viewBloods" className='text-light'>Blood Bank</Nav.Link>
          </Nav>
          <Navbar.Toggle />
        <Navbar.Collapse className="justify-content-end">
          <Navbar.Text>
            Signed in as: <a style={{textDecoration: "none"}} href="#login">Mark Otto</a>
          </Navbar.Text>
        </Navbar.Collapse>
        </Container>
      </Navbar>
    </>
  )
}