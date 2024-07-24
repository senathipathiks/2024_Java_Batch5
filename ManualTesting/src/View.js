import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";

import "./App2.css";


function View() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();
  const [find,setFind] = useState('');
  useEffect(() => { 
    axios
      .get("http://localhost:1000/user/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  let handleSubmit = (uid) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
      
        .delete("http://localhost:1000/user/" + uid)
        .then((res) => {
          alert("record has deleted");
          navigate("/viewuser");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
    
  };

  return (
    <div id="body" >
    <body>
  
      

      <div className="container">
        <h1 id="app2" className="text-center text-bg-warning " role="heading">
          MATRIMONIAL SERVICE - GROOMS AND BRIDES DETAILS
        </h1>
        
          <br></br>
          <br></br>
          <div className="relative">
                <svg xmlns="http://www.w3.org/2000/svg" className="absolute top-0 bottom-0 w-6 h-6 my-auto text-gray-400 left-3" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                    <path strokeLinecap="round" strokeLinejoin="round" strokeWidth={2} d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z" />
                </svg>
                <input
                   
                    type="text"
                    onChange={(e)=>setFind(e.target.value)} 
                    placeholder="SearchName"
                    className="w-60 h-10 py-3 pl-12 pr-4 text-gray-500 border rounded-md outline-none bg-gray-50 focus:bg-white focus:border-indigo-600"
                />
            </div>
         {/* <div>
          <input type="search" onChange={(e)=>setFind(e.target.value)} placeholder="Search Name"></input>
         </div> */}
        <div className="text-end">
          <Link to="/adduser" className="btn btn-primary">
            Add +
          </Link>
        </div>
        <br />
        <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead>
            <tr>
              {/* {columns.map((c, i) => (
                <th key={i}>{c}</th>
              ))}  */}
              <th>USER ID</th>
                <th>User Name</th>
                
                <th>Age</th>
                <th> Address</th>
                <th> Religion</th>
                <th>Profession</th>
                <th>Salary</th>
                <th> Account Type </th>
              <th >Payment Method</th>
              <th >Marital Status</th>
              <th>Match Maker Id</th>
              <th>Action</th>
            </tr>
          </thead>

          <tbody>
            {records.filter((items)=>{

              return find.toLowerCase()===''?items :items.uname.toLowerCase().includes(find)
            })
              
            
            .map((d, i) => (
              <tr key={i}>
                <td>{d.uid}</td>
                <td>{d.uname}</td>
                <td>{d.age}</td>
                <td>{d.addr}</td>
                <td>{d.religion}</td>
                <td>{d.job}</td>
                <td>{d.sal}</td>
                <td>{d.actype}</td>
                <td>{d.payment}</td>
                <td>{d.sts}</td>
                <td>{d.matchmaker.mid}</td>
                <td>
                  <Link
                    to={`/updateuser/${d.uid}`}
                    name={`update${d.uid}`}
                    className="btn btn-sm btn-transparent border border-secondary "
                  >
                    Update
                  </Link>
                  <button
                    onClick={(e) => handleSubmit(d.uid)}
                    className="btn btn-sm ms-1 btn-danger"
                    name={`delete${d.uid}`}
                  >
                    Delete  
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
   
    </body>
    </div>
  );
}

export default View;
