import axios from "axios";
import React, { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function Search() {
    // const { id } = useParams();
    const [data, setData] = useState([]);
    const navigate = useNavigate();
    const [columns, setColumns] = useState([]);
    const [id, setFind] =useState('');
  
    let handleSubmit = (e) =>{
      e.preventDefault();
    }
  
  
    let handleSearch = (id) => {
         
        // const conf = window.confirm("Do you want to delete");
        // if (conf) {
          console.log(id);
          axios
          
            .get("http://localhost:5000/Owners" + id)
            .then((response) => {
              // setColumns(Object.keys(response.data[0]));
             // setRecords(response.data);
              setData(response.data);
            })
            .catch((err) => {
              console.log(err);
            });
        }
    



    return (
      <div>
        
        <div
          id="edit2"
          className="d-flex w-100 vh-100 justify-content-center align-items-center "
        >
          <div className="w-50 border bg-light p-5">
            <form onSubmit={handleSubmit}>
              <h1>FIND STUDENTS DATA'S</h1>
              <div>
                <lable htmlFor="id">ID :</lable>
                <input
                  type="search"
                  // name="name"
                  className="form-control"
                onBlur={(e)=>{setFind(e.target.value)}}
                />
                
              </div>
  
             
              <br />
  
              <button className="btn btn-info "
              onClick={(e) => handleSearch(id)}
              >Find</button>
            <br/>
            <br/>
          <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead>
            <tr>
            <th>Name</th>
            <th>Mobile</th>
            <th>ID</th>
            <th>City</th>
            <th>Pincode</th>
            </tr>
          </thead>

          <tbody>
            
              <tr key={data.id}>
                

                <td>{data.Name}</td>
                <td>{data.Mobile}</td>
                <td>{data.id}</td>
                <td>{data.City}</td>
                <td>{data.Pincode}</td>

              
              </tr>
            
          </tbody>
        </table>






{/* 
              <p>{data.Name}</p>
              <p>{data.Mobile}</p>
              <p>{data.City}</p> */}
            </form>
            
          </div>
        </div>
      </div>
    );
  }
  
  
  

export default Search;
