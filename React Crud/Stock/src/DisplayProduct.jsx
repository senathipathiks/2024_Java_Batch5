import axios from "axios";
import { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";
function DisplayProduct() {
    const [data, setData] = useState([])
    const { id } = useParams();
    useEffect(() => {
        axios.get('http://localhost:6001/products/' + id)
            .then(res => setData(res.data))
            .catch(err => console.log(err));
    },[ ])
    return (
        <div className="d-flex flex-column justify-content-center align-items-center  vh-100"style={{ backgroundImage: `url('display.jpg')`,backgroundSize: 'cover',
        backgroundPosition: 'center',
        width: '100%'}} >
            <div className="w-75 rounded  " style={{color:"white",paddingTop:"190px"}}>
                <h3>Detail of Product</h3>
                <div className="mb-2">
                    <strong>Product Id:{data.id}</strong>
                </div>
                <div className="mb-2">
                    <strong> Name:{data.Name}</strong>
                </div>
                <div className="mb-2">
                    <strong>Price:{data.Price}</strong>
                </div>
                <div className="mb-2">
                    <strong>Discount:{data.Discount}</strong>
                </div>
               
                <Link to={`/updateproduct/${id}`} className="btn btn-success">Edit</Link>
                <Link to="/viewproduct" className="btn btn-primary ms-3">Back</Link>
            </div>
        </div>
    );

}
export default DisplayProduct;