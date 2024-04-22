import React from "react";
import View from "./View";
import Add from "./Add";
import Edit from "./Edit"
import Home from "./Home"
import Button from 'react-bootstrap/Button';
import Container from 'react-bootstrap/Container';
import Form from 'react-bootstrap/Form';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import logo from './logo.png';
import './Home.css';
import Login from './Login'
import {BrowserRouter as Router,Route,Routes } from 'react-router-dom';
import Register from "./Register";

import Addu from "./Addu";
import Editu from "./Editu";
import View2 from "./View2";


function AppRouter() {

  return (

    <>
<Navbar expand="lg" className="navbar-fixed bg-body-tertiary">
      <Container fluid>
        <Navbar.Brand href="/"><img src={logo} id='logo' alt="" />&nbsp;American Warehouse</Navbar.Brand>
        <Navbar.Toggle aria-controls="navbarScroll" />
        <Navbar.Collapse id="navbarScroll">
          <Nav
            className="me-auto my-2 my-lg-0"
            style={{ maxHeight: '100px' }}
            navbarScroll
          > 
            

            <Nav.Link href="#">Contact Us</Nav.Link>
            <Nav.Link href="#">About Us</Nav.Link>
            {/* <NavDropdown title="More" id="navbarScrollingDropdown">
              <NavDropdown.Item href="/">About Us</NavDropdown.Item>
              <NavDropdown.Item href="/">
                Contact Us
              </NavDropdown.Item>
              <NavDropdown.Divider />

            </NavDropdown> */}
          </Nav>
          <Form className="d-flex">
            <Form.Control
              type="search"
              placeholder="Search"
              className="me-2"
              aria-label="Search"
            />
            <Button variant="btn btn-danger">Search</Button>
          </Form>
        </Navbar.Collapse>
      </Container>
    </Navbar>


    <Router>
      <Routes>
        <Route path="/" element={<Home />} />

        <Route path="/admin" element={<View />}></Route>
        <Route path="/create" element={<Add />} />
        <Route path="/update/:id" element={<Edit/>} />
      
        <Route path="/user" element={<View2/>}></Route>
        <Route path="/add" element={<Addu />}/>
        <Route path="/Uupdate/:id" element={<Editu/>} />

        <Route path="/login" element={<Login />}></Route>
        <Route path="/register" element={<Register/>}></Route>
      </Routes>
    </Router>
    </>
  );
}

export default AppRouter;
