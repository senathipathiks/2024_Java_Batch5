import React, { useEffect, useState }from 'react'
import axios from "axios";
import {useNavigate, useParams} from "react-router-dom";

function Editshop() {
    const { id }= useParams();
    const [data, setData]= useState([]);
    const navigate= useNavigate();
    useEffect(()=>{
        axios
        .get("http://localhost:2222/shop/" + id)
        .then((response)=> setData(response.data))
        .catch((err)=> console.log(err));

    },[]);

    let handleSubmit = (e) => {
        e.preventDefault();
        axios.put("http://localhost:2222/shop" , data).then((res)=>{
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
            <h1>Gift Shop Management System</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="id"
                className="form-control"
                value={data.id}
                //onChange={(e) => setData({ ...data, name: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="prname">Product Name :</lable>
              <input
                type="text"
                name="prname"
                className="form-control"
                value={data.prname}
                onChange={(e) => setData({ ...data, prname: e.target.value })}
              />
            </div>
           
            

            <div>
              <lable htmlFor="available">Available :</lable>
              <input
                type="number"
                name="available"
                className="form-control"
                value={data.available}
                onChange={(e) => setData({ ...data, available: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="userrating">User Rating :</lable>
              <input
                type="number"
                name="userrating"
                className="form-control"
                value={data.userrating}
                onChange={(e) => setData({ ...data, userrating: e.target.value })}
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

export default Editshop
