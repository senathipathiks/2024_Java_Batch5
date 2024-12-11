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
      .get("http://localhost:1000/bill/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  let handleSubmit = (id) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
      
        .delete("http://localhost:1000/bill/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
    
  };

  return (
    <div >
    <body id="body1">
  
      

      <div className="container">
        <h1 id="app2" className="text-center text-bg-info ">
          Electricity Billing Payment System
        </h1>
        
          <br></br>
          <br></br>
          <div className="relative">
                {/* <svg xmlns="http://www.w3.org/2000/svg" className="absolute top-0 bottom-0 w-6 h-6 my-auto text-gray-400 left-3" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                    <path strokeLinecap="round" strokeLinejoin="round" strokeWidth={2} d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z" />
                </svg> */}
                <input
                   
                    type="text"
                    onChange={(e)=>setFind(e.target.value)} 
                    placeholder="SearchName"
                    className="w-60 h-10 py-3 pl-12 pr-4 text-gray-500 border rounded-md outline-none bg-gray-50 focus:bg-white focus:border-indigo-600"
                />
            </div>
       
        <div className="text-end">
          <Link to="/create" className="btn btn-primary">
            Add +
          </Link>
        </div>
        <br />
        <table className="table table-bordered  table-striped w-100 border bg-dark shadow px-5 pb-5 rounded ">
          <thead>
            <tr>
              {/* {columns.map((c, i) => (
                <th key={i}>{c}</th>
              ))} */} 
              <th>Bill ID</th>
                <th>EB Type</th>
                
                <th>Contact detail</th>
                <th> Branch</th>
                <th> Due-Date</th>
                <th>Consumed Units</th>
                <th>Price Per Unit</th>
                <th>Bill Amount</th>
                <th>Customer ID</th>
              <th >Customer Name</th>
              <th>Action</th>
            </tr>
          </thead>

          <tbody>
            {records.filter((items)=>{

              return find.toLowerCase()===''?items :items.customer.uname.toLowerCase().includes(find)
            })
              
            
            .map((d, i) => (
              <tr key={i}>
                <td>{d.id}</td>
                <td>{d.type}</td>
                <td>{d.mobile}</td>
                <td>{d.city}</td>
                <td>{d.date}</td>
                <td>{d.nos}</td>
                <td>{d.price}</td>
                <td>{d.bill}</td>
                <td>{d.customer.cid}</td>
                <td>{d.customer.uname}</td>
                <td>
                  <Link
                     id="butt1"
                    to={`/update/${d.id}`}
                    className="btn btn-sm btn-transparent border border-secondary "
                  >
                    Update
                  </Link>
                  <button
                  id="butt2"
                    onClick={(e) => handleSubmit(d.id)}
                    className="btn btn-sm ms-1 btn-danger"
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
