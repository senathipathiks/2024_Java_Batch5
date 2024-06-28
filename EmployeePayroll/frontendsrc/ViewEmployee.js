import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";
import "./Login.css";

function View() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:8787/employee/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  let handleSubmit = (empid) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
        .delete("http://localhost:8787/employee/" + empid)
        .then((res) => {
          alert("record has deleted");
          navigate("/viewEmployee");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <div id="body">
      <div className="container ">
        <h1 id="app2" className="text-center text-info ">
          Employee PayRoll Management System
        </h1>

        <div className="text-end">
          <Link to="/add" className="btn btn-warning">
            Add +
          </Link>
        </div>
        <br />
        <table className="table table-bordered  table-info table-hover table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead class = "table-dark">
            <tr>
              {columns.map((c, i) => (
                <th key={i}>{c}</th>
              ))}
              <th>Action</th>
            </tr>
          </thead>

          <tbody>
            {records.map((d, i) => (
              <tr key={i}>
                <td>{d.empid}</td>
                <td>{d.empname}</td>
                <td>{d.empdesignation}</td>
                <td>{d.empcity}</td>
                <td>{d.emprole}</td>
                <td>{d.payroll.ctc}</td>
                {/* <td>{d.Pincode}</td> */}
                

                <td>
                  <Link
                    to={`/updateEmployee/${d.empid}`}
                    className="btn btn-sm btn-primary "
                  >
                    Update
                  </Link>
                  <button
                    onClick={(e) => handleSubmit(d.empid)}
                    className="btn btn-sm ms-1 btn-info"
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
  );
}

export default View;
