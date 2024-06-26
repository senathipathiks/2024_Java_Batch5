import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";

import { Container, Nav, Navbar, NavDropdown } from 'react-bootstrap';
const ViewPayrolls = () => {
    const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:1224/payroll/all")
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
        .delete("http://localhost:1224/payroll/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };
  return (
    <div>
        <div className="container paddings">
        <div class="p-3 mb-2 bg-primary text-white">
        <h1 id="app2" className="text-center text-bg-success " >
          Employee Management System
        </h1>
       
        </div>  
        {/* <div className="text-end">
          {/* <Link to="/addpayroll" className="btn btn-primary">
            Add Payroll +
          </Link> 
          </div> */}
        <h4 className="text-center">Payroll details</h4>
       <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead>
            <tr>
              {columns.map((c, i) => (
                <th key={i} className="text-center">{c}</th>
              ))}
              <th className="text-center">Action</th>
            </tr>
          </thead>
          <tbody>
            {records.map((d, i) => (
              <tr key={i} className="text-center">
                <td>{d.pId}</td>
                <td>{d.hre}</td>
                <td>{d.ta}</td>
                <td>{d.pf}</td>
                <td>{d.bp}</td>
                <td>{d.ctc}</td>
                <td className="text-center">
                  <div className="action-button">
                  <Link
                    to={`/Editpayroll/${d.pId}`}
                    className="btn btn-sm btn-success button"
                  >
                    Update
                  </Link>
                  <button
                    onClick={(e) => handleSubmit(d.pId)}
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
  )
}

export default ViewPayrolls
