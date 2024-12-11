import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

const  DispCard=( {imageUrl, title, description, })=>{
  return (
    
    <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={imageUrl} />
      <Card.Body>
        <Card.Title>{title}</Card.Title>
        
        
        
      </Card.Body>
    </Card>
  );
}
export default DispCard;