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
      .get("http://localhost:1000/employee/all")
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
      
        .delete("http://localhost:1000/employee/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <body>
    <div id="body">
      

      <div className="container ">
        <h1 id="app2" className="text-center text-bg-success ">
          Employee Payroll  Management System
        </h1>
         <div>
          <input type="search" onChange={(e)=>setFind(e.target.value)} placeholder="Search Name"></input>
         </div>
        <div className="text-end">
          <Link to="/create" className="btn btn-primary">
            Add +
          </Link>
        </div>
        <br />
        <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead>
            <tr>
              {columns.map((c, i) => (
                <th key={i}>{c}</th>
              ))}
              <th>Action</th>
            </tr>
          </thead>

          <tbody>
            {records.filter((items)=>{
              return find.toLowerCase()===''?items :items.name.toLowerCase().includes(find)
            })
            
            
            .map((d, i) => (
              <tr key={i}>
                <td>{d.id}</td>
                <td>{d.name}</td>
                <td>{d.mobile}</td>
                <td>{d.city}</td>
                <td>{d.dept}</td>
                <td>{d.salary.sal}</td>
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
    </div>
    </body>
  );
}

export default View;
