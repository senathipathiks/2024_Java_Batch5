import Container from "react-bootstrap/Container";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import {  useNavigate } from "react-router-dom";
import Approuter from "./Approuter";
import Cards from "./Cards";
import { Link } from "react-router-dom";
import "./App2.css";
import Banner from "./Banner";
import Feature from "./Feature";
import { Margin } from "@mui/icons-material";

function ColorSchemesExample() {
  return (
    <body>
      <Navbar
        bg="dark"
        data-bs-theme="dark"
        id="nav"
        className="container-fluid"
      >
        <Container>
          <Navbar.Brand href="/">
            <h2>EMS</h2>
          </Navbar.Brand>
          <Nav className="me-auto" id="navbar">
            {/* <Nav.Link href="#home">Home</Nav.Link> */}
            <Link to="/view" className="nav">
              Display 
            </Link>
            {/* <Nav.Link href='/create' >Add user</Nav.Link> */}
            <Link to="/create" className="nav">
              Add User
            </Link>
            {/* <Nav.Link href="View.js">Delete User</Nav.Link> */}
            <Link to="/update/:id" className="nav">
              Edit Userprofile
            </Link>
            <Link to="/search" className="nav">
              Search{" "}
            </Link>
            <span id="Box">
              <Link to="/payroll" className="" id="Box1">
                Payroll{" "}
              </Link>
              {/* <Link to="/signin" className="" id="Box2">
                Login{" "}
              </Link> */}
               {/* <Link href="/signin" className="" id="Box2">
                Login{" "}
              </Link> */}
            </span>
          </Nav>
        </Container>
      </Navbar>
      <br />
      {/* <Navbar bg="primary" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="#home">Navbar</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="#home">Home</Nav.Link>
            <Nav.Link href="#features">Features</Nav.Link>
            <Nav.Link href="#pricing">Pricing</Nav.Link>
          </Nav>
        </Container>
      </Navbar>

      <br />
      <Navbar bg="light" data-bs-theme="light">
        <Container>
          <Navbar.Brand href="#home">Navbar</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="#home">Home</Nav.Link>
            <Nav.Link href="#features">Features</Nav.Link>
            <Nav.Link href="#pricing">Pricing</Nav.Link>
          </Nav>
        </Container>
      </Navbar> */}
          
    </body>
  );
}

export default ColorSchemesExample;

// import React from "react";

export function CardComp() {
  return (
    <body>
     <div><Banner/></div> 
     <div id="feature"><Feature/></div>
      {/* <div className="container">
        <div className="row">
          <div className="col-lg-3 col-md-6 col-sm-12 mt-4">
            <Cards />
          </div>
          <div className="col-lg-3 col-md-6 col-sm-12 mt-4">
            <Cards />
          </div>
          <div className="col-lg-3 col-md-6 col-sm-12 mt-4">
            <Cards />
          </div>
          <div className="col-lg-3 col-md-6 col-sm-12 mt-4">
            <Cards />
          </div>
        </div>
        <div className="row">
        <div className="col-lg-3 col-md-6 col-sm-12 mt-4">
            <Cards />
          </div>
          <div className="col-lg-3 col-md-6 col-sm-12 mt-4">
            <Cards />
          </div>
          <div className="col-lg-3 col-md-6 col-sm-12 mt-4">
            <Cards />
          </div>
          <div className="col-lg-3 col-md-6 col-sm-12 mt-4">
            <Cards />
          </div>
        </div>
       
      </div> */}
    </body>
  );
}
