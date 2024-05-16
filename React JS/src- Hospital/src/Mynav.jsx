import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import 'bootstrap/dist/css/bootstrap.min.css';

function ColorSchemesExample() {
  return (
    <>
      <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="">Hospital Management</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="/home">Home</Nav.Link>
            <Nav.Link href="/view">View </Nav.Link>
            <Nav.Link href="/create">add patient</Nav.Link>
            <Nav.Link href="/update/:id">update Patient</Nav.Link>
            {/* <Nav.Link href="/createD">add doctor</Nav.Link> */}
          </Nav>
        </Container>
      </Navbar>
      <br />
      
    
    </>
  );
}

export default ColorSchemesExample;