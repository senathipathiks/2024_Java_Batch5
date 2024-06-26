import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";



function View() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:1224/employee/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  let handleSubmit = (id) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
        .delete("http://localhost:1224/employee/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <div id="body">
      
      <div className="container paddings">
        <div class="p-3 mb-2 bg-primary text-white">
        <h1 id="app2" className="text-center text-bg-success " >
          Employee Management System
        </h1>
        </div>  
        <h4 className="text-center">Employee details</h4>
        {/* <div className="text-end">
          <Link to="/create" className="btn btn-primary">
            Add +
          </Link>
          
          <Link to="/viewpayrolls" className="btn btn-primary">
            View Payroll +
          </Link>
        </div> */}
        <br />
        <table className="table table-hover table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead className="table table-dark">
            <tr>
              {columns.map((c, i) => (
                <th key={i} className="text-center">{c}</th>
              ))}
              <th className="text-center">Action</th>
            </tr>
          </thead>

          <tbody >
            {records.map((d, i) => (
              <tr key={i} className="text-center">
                <td>{d.id}</td>
                <td>{d.name}</td>
                <td>{d.age}</td>
                <td>{d.desig}</td>
                <td>{d.dept}</td>
                <td> {d.payroll.ctc}</td>
                
                
                <td className="text-center">
                  <div className="action-button">
                  <Link
                    to={`/update/${d.id}`}
                    className="btn btn-sm btn-success button "
                  >
                    Update
                  </Link>
                  <button
                    onClick={(e) => handleSubmit(d.id)}
                    className="btn btn-sm ms-1 btn-danger button"
                  >
                    Delete
                  </button>
                  </div>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default View;
