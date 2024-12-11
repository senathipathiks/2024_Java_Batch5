import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import './App3.css';

const  DispCard=( {imageUrl, title, description, })=>{
  return (
    
    <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={imageUrl} id='cards' />
      <Card.Body>
        <Card.Title>{title}</Card.Title>
        
        
        
      </Card.Body>
    </Card>
  );
}
export default DispCard;