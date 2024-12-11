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
      .get("http://localhost:1000/payroll/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  let handleSubmit = (pid) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
      
        .delete("http://localhost:1000/payroll/" +pid)
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
          Payroll Management System
        </h1>
         <div>
          <input type="search" onChange={(e)=>setFind(e.target.value)} placeholder="Search Name"></input>
         </div>
        <div className="text-end">
          <Link to="/insertpay" className="btn btn-primary">
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
                <td>{d.pid}</td>
                <td>{d.bp}</td>
                <td>{d.da}</td>
                <td>{d.hr}</td>
                <td>{d.ta}</td>
                <td>{d.sal}</td>
                <td>
                  <Link
                     id="butt1"
                    to={`/payupdate/${d.pid}`}
                    className="btn btn-sm btn-transparent border border-secondary "
                  >
                    Update
                  </Link>
                  <button
                  id="butt2"
                    onClick={(e) => handleSubmit(d.pid)}
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
