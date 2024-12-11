import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

const  DispCard=( {imageUrl, title, description,btn })=>{
  return (
    
    <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={imageUrl} />
      <Card.Body>
        <Card.Title>{title}</Card.Title>
        <Card.Text>
          {description}
        </Card.Text>
        
        <Button variant="primary">{btn}</Button>
      </Card.Body>
    </Card>
  );
}
export default DispCard;