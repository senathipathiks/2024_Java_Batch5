import React, { useEffect, useState }from 'react'
import axios from "axios";
import {useNavigate, useParams} from "react-router-dom";

function Edit() {
    const { id }= useParams();
    const [data, setData]= useState([]);
    const navigate= useNavigate();
    useEffect(()=>{
        axios
        .get("http://localhost:12209/employee/" + id)
        .then((response)=> setData(response.data))
        .catch((err)=> console.log(err));

    },[]);

    let handleSubmit = (e) => {
        e.preventDefault();
        axios.put("http://localhost:12209/employee" , data).then((res)=>{
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
              <lable htmlFor="dept">Department :</lable>
              <input
                type="text"
                name="dept"
                className="form-control"
                value={data.dept}
                onChange={(e) => setData({ ...data, dept: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="desig">Designation :</lable>
              <input
                type="text"
                name="desig"
                className="form-control"
                value={data.desig}
                onChange={(e) => setData({ ...data, desig: e.target.value })}
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
            
            <br />

            <button className="btn btn-info ">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default Edit
