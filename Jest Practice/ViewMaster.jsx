

import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import "./ViewMaster.css";

function ViewMaster() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  

  useEffect(() => {
    axios
      .get("http://localhost:7727/mast/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  return (
    <body>
    <div id="body">
      <div className="cont">
        <h1 id="app2" className="text-center text-dark bg-secondary" title="ViewPageMaster">
         Gym Center System
        </h1>

        <div className="text-end">
          <Link to="/AddMaster" className="btn btn-warning" style={{ fontSize: "15px" }}>
            Add +
          </Link>
        </div>
        <br />
        <div className="table-container">
          <table className="table table-striped table-dark table-hover">
            <thead>
              <tr>
                {columns.map((c, i) => (
                  <th key={i}>{c}</th>
                ))}
                <th>Action</th>
              </tr>
            </thead>

            <tbody role="datamaster">
              {records.map((d, i) => (
                <tr key={i}>
                  <td role="mastersID">{d.masterID}</td>
                  <td role="mastersName">{d.name}</td>
                  <td role="mastersSpeciality">{d.specialist}</td>
                  <td role="mastersAvailability">{d.availability}</td>
                  <td role="masters-City">{d.city}</td>

                  <td>
                    <Link
                      to={`/EditMaster/${d.masterID}`}
                      className="btn btn-sm btn-success"
                      style={{ fontSize: "15px" }}
                    >
                      Update
                    </Link>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    </div>
    </body>
  );
}

export default ViewMaster;