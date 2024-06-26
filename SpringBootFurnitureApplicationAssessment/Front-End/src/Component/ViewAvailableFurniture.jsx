import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";

function ViewAvailableFurniture() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();


  useEffect(() => {
    axios
      .get("http://localhost:1225/furniture/all")
      .then((response) => {
        setRecords(response.data);
        setColumns(Object.keys(response.data[0]));
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
        .delete("http://localhost:1225/sales/" + id)
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
        <div className="p-3 mb-2 bg-primary text-white">
          <h1 id="app2" className="text-center text-bg-success">
          Online Furniture Store
          </h1>
        </div>
        <h4 className="text-center">Available Furniture details</h4>
        <br />
        <table className="table table-hover table-bordered table-striped w-100 border bg-white shadow px-5 pb-5 rounded">
          <thead className="table table-dark">
            <tr>              
              {columns.map((c, i) => (
                <th key={i} className="text-center">{c}</th>
              ))}
            </tr>
          </thead>
          <tbody>
            {records.map((d, i) => (
              <tr key={i} className="text-center">
                <td>{d.id}</td>
                <td>{d.name}</td>
                <td>{d.description}</td>
                <td>{d.price}</td>
                <td>{d.stock}</td>
                <td className="text-center">
                  <div className="action-button">
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

export default ViewAvailableFurniture;