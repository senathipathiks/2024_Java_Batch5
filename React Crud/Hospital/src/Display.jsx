import axios from "axios";
import { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";
function Display() {
    const [data, setData] = useState([])
    const { id } = useParams();
    useEffect(() => {
        axios.get('http://localhost:5000/users/' + id)
            .then(res => setData(res.data))
            .catch(err => console.log(err));
    },[ ])
    return (
        <div className="d-flex flex-column justify-content-center align-items-center  vh-100"style={{ backgroundImage: `url('https://www.merchantsfleet.com/wp-content/uploads/2020/09/Merchant-Fleet-Management.jpg')`,backgroundSize: 'cover',
        backgroundPosition: 'center',
        width: '100%'}} >
            <div className="w-75 rounded  " style={{color:"white",paddingTop:"190px"}}>
                <h3>Detail of Hospital</h3>
                <div className="mb-2">
                    <strong>Patient Id:{data.id}</strong>
                </div>
                <div className="mb-2">
                    <strong> Name:{data.Name}</strong>
                </div>
                <div className="mb-2">
                    <strong>Mobile:{data.Mobile}</strong>
                </div>
                <div className="mb-2">
                    <strong>City:{data.City}</strong>
                </div>
                <div className="mb-2">
                    <strong>Disease:{data.Disease}</strong>
                </div>
                <div className="mb-2">
                    <strong>Pincode:{data.Pincode}</strong>
                </div>
                <Link to={`/update/${id}`} className="btn btn-success">Edit</Link>
                <Link to="/" className="btn btn-primary ms-3">Back</Link>
            </div>
        </div>
    );

}
export default Display;