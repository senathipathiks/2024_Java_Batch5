import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import 'bootstrap/dist/css/bootstrap.min.css';

function ColorSchemesExample() {
  return (
    <>
      <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="">Ration Card Management</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="/home">Home</Nav.Link>
            <Nav.Link href="/View">View </Nav.Link>
            <Nav.Link href="/create">add user</Nav.Link>
            <Nav.Link href="/update/:id">update user</Nav.Link>
            <Nav.Link href="/createS">add stock</Nav.Link>
            <Nav.Link href="/create">update stock</Nav.Link>
            <Nav.Link href="/viewstock">View stock</Nav.Link>
          </Nav>
        </Container>
      </Navbar>
      <br />
      
    
    </>
  );
}

export default ColorSchemesExample;