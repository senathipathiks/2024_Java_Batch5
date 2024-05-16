import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import * as ReactDOM from "react-dom/client";
import "./App2.css";


function Viewstocks() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:5000/stocks/")
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
        .delete("http://localhost:5000/stocks/" + id)
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
      <br/>
      <div class="container">
        
        <h1 id="headingMain" className="text-center text-bg-primary ">
          Ration card Management System
        </h1>

        <div className="text-end">
          <Link to="/create" className="btn btn-dark">
            Add data +
          </Link>
        </div>
        <br />
        <table className="table table-hover table- w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead>
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
                <td>{d.id}</td>
                <td>{d.SName}</td>
                <td>{d.Quan}</td>
                <td>{d.Sdate}</td>
                <td>{d.Provider}</td>
                <td>{d.RQuan}</td>
                <td>
                  <Link
                    to={`/update/${d.id}`}
                    className="btn btn-sm btn-primary "
                  >
                    Update
                  </Link>
                  <button
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
  );
}

export default Viewstocks;
