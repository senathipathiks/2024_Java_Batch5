import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./ViewUser.css";
 
function ViewUser() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();
 
  useEffect(() => {
    axios
.get("http://localhost:7727/mem/all")
      .then((response) => {
        if (response.data.length > 0) {

          setColumns(Object.keys(response.data[0]));
          setRecords(response.data);
        }
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);
 
  const handleSubmit = (id) => {
    const conf = window.confirm("Do you want to delete?");
    if (conf) {
      axios
.delete(`http://localhost:7727/mem/${id}`)
        .then((res) => {
          alert("Record has been deleted");
          setRecords(records.filter(record => record.userID !== id));
        })
        .catch((err) => console.log(err));
    }
  };
  
  return (
    <body>
    <div id="body">
      <div className="cont">
        <h1 id="app2" className="text-center text-dark bg-secondary" title="ViewPageMember">
          Gym Center
        </h1>
        <div className="text-end">
          <Link to="/AddUser" className="btn btn-warning" style={{ fontSize: "15px" }}>
            Add +
          </Link>
        </div>
        <br />
        <table className="table table-bordered  table-dark table-hover table-striped w-100 border shadow px-5 pb-5 rounded" style={{ fontSize: "15px" }}>
          <thead>
            <tr>
              {columns.map((c, i) => (
                <th key={i}>{c === "masters" ? "specialist" : c}</th>
              ))}
              <th>Action</th>
            </tr>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
          </thead>
          <tbody role="data">
            {records.map((d, i) => (
              <tr key={i}>
                {columns.map((col, index) => (
                  <td key={index}>
                    {col === "masters"
                      ? (d[col]?.specialist || "N/A")
                      : (typeof d[col] === "object" ? JSON.stringify(d[col]) : d[col])
                    }
                  </td>
                  
                ))}
                <td>
                  <Link to={`/EditUser/${d.userID}`} className="btn btn-sm btn-success rounded-pill" style={{ fontSize: "15px" }}>
                    Update
                  </Link>
                  <button  onClick={() => handleSubmit(d.userID)} className="btn btn-sm ms-1 btn-danger rounded-pill" style={{ fontSize: "15px" }} id="del">
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
 
export default ViewUser;                                              