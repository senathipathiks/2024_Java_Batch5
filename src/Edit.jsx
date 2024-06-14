import React, { useEffect, useState }from 'react'
import axios from "axios";
import {useNavigate, useParams} from "react-router-dom";

function Edit() {
    const { id }= useParams();
    const [data, setData]= useState([]);
    const navigate= useNavigate();
    useEffect(()=>{
        axios
        .get("http://localhost:2222/student/" + id)
        .then((response)=> setData(response.data))
        .catch((err)=> console.log(err));

    },[]);

    let handleSubmit = (e) => {
        e.preventDefault();
        axios.put("http://localhost:2222/student" , data).then((res)=>{
            alert("User updated successfully");
            navigate("/");
        });
    };

  return (
    <div>
      <div
        id="edit2"
        className="d-flex w-100 vh-100 justify-content-center align-items-center "
      >
        <div className="w-50 border bg-light p-5">
          <form onSubmit={handleSubmit}>
            <h1>Employee Management System</h1>
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
              <lable htmlFor="name">Name :</lable>
              <input
                type="text"
                name="name"
                className="form-control"
                value={data.name}
                onChange={(e) => setData({ ...data, name: e.target.value })}
              />
            </div>
           
            

            <div>
              <lable htmlFor="city">City :</lable>
              <input
                type="text"
                name="city"
                className="form-control"
                value={data.city}
                onChange={(e) => setData({ ...data, city: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="email">Email :</lable>
              <input
                type="text"
                name="email"
                className="form-control"
                value={data.email}
                onChange={(e) => setData({ ...data, email: e.target.value })}
              />
            </div>
            
            <div>
              <lable htmlFor="age">Age :</lable>
              <input
                type="number"
                name="age"
                className="form-control"
                value={data.age}
                onChange={(e) => setData({ ...data, age: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="role">Role :</lable>
              <input
                type="text"
                name="role"
                className="form-control"
                value={data.role}
                onChange={(e) => setData({ ...data, role: e.target.value })}
              />
            </div>
            <br />

            <button className="btn btn-info ">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default Edit
