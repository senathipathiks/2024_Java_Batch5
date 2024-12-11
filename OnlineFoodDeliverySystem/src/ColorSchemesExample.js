import Container from "react-bootstrap/Container";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import {  useNavigate } from "react-router-dom";
import Approuter from "./Approuter";
import Cards from "./Cards";
import { Link } from "react-router-dom";
import "./App2.css";

import { Margin } from "@mui/icons-material";
import Home from "./Home";

function ColorSchemesExample() {
  return (
    <body>
      <Navbar
        bg="warning"
        data-bs-theme="dark"
        id="nav"
        className="container-fluid"
      >
        <Container>
        
          <Navbar.Brand id="logo" href="/">
            <h2> <img url='logo.png'></img> </h2>
          </Navbar.Brand>
          <Nav className="me-auto" id="navbar">
            {/* <Nav.Link href="#home">Home</Nav.Link> */}
            <Link to="/view" className="nav">
              Orders 
            </Link>
            {/* <Nav.Link href='/create' >Add user</Nav.Link> */}
           
            {/* <Nav.Link href="View.js">Delete User</Nav.Link> */}
            <Link  to= "/Menus" className="nav">
             Menu Listings
            </Link>
            <span id="Box">
              <Link to="/payroll" className="" id="Box1">
                Our Customers{" "}
              </Link>

             
              {/* <Link to="/signin" className="" id="Box2">
                Login{" "}
              </Link> */}
               {/* <Link href="/signin" className="" id="Box2">
                Login{" "}
              </Link> */}
            </span>
            <Link to="/login" className="nav">
              Login
            </Link>
            <Link to="/signup" className="nav">
              SignUp{" "}
            </Link>
          </Nav>
        </Container>
      </Navbar>
      <br />

         
    </body>
  );
}

export default ColorSchemesExample;



