import React, { useEffect, useState }from 'react'
import axios from "axios";
import {useNavigate, useParams} from "react-router-dom";

function Editproduct() {

    const { id }= useParams();
    const [data, setData]= useState([]);
    const navigate= useNavigate();
    useEffect(()=>{
        axios
        .get("http://localhost:2222/producttable/" + id)
        .then((response)=> setData(response.data))
        .catch((err)=> console.log(err));

    },[]);

    let handleSubmit = (e) => {
        e.preventDefault();
        axios.put("http://localhost:2222/producttable" , data).then((res)=>{
            alert("User updated successfully");
            navigate("/");
        });
    };
  return (
    <div>
      <div
        id="add2"
        className="d-flex w-100 vh-100 justify-content-center align-items-center "
      >
        <div className="w-50 border  p-5" style={{color:"white"}} id="add3">
          <form onSubmit={handleSubmit}>
            <h1>PRODUCT DETAILS</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="number"
                disabled
                name="id"
                className="form-control"
                value={data.id}
                //onChange={(e) => setData({ ...data, name: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="pname">Product Name :</lable>
              <input
                type="text"
                name="pname"
                className="form-control"
                value={data.pname}
                onChange={(e) => setData({ ...data, pname: e.target.value })}
              />
            </div>
           
            

            <div>
              <lable htmlFor="category">Category Of The Product :</lable>
              <input
                type="text"
                name="category"
                className="form-control"
                value={data.category}
                onChange={(e) => setData({ ...data, category: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="price">Price Of The Product :</lable>
              <input
                type="number"
                name="price"
                className="form-control"
                value={data.price}
                onChange={(e) => setData({ ...data, price: e.target.value })}
              />
            </div>
            
            <div>
              <lable htmlFor="deliverydate">Delivery Date OF The Product :</lable>
              <input
                type="number"
                name="deliverydate"
                className="form-control"
                value={data.deliverydate}
                onChange={(e) => setData({ ...data, deliverydate: e.target.value })}
              />
            </div>
            <div>
            <lable htmlFor="sellername">Seller Name :</lable>
            <input
              type="text"
              name="sellername"
              className="form-control"
            //   value={parseInt(data.hra)+parseInt(data.da)+parseInt(data.ta)+parseInt(data.pf)}
              onBlur={(e) =>
                setData({ ...data, sellername:e.target.value})
              }
            />
          </div>
            
            <br />

            <button className="btn btn-info " className="fst-italic">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default Editproduct
