import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";

function ViewCandidate() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:8080/candidate")
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
        .delete("http://localhost:8080/candidate/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/viewcandidate");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <div id="body">
      <div className="container ">
        <h1 id="app2" className="text-center text-light bg-danger">
          Online Campaign Management System
        </h1>

        <div className="text-end">
          <Link to="/addcandidate" className="btn btn-success text-light">
            Add Candidate +
          </Link>
        </div>
        <br />
        <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead>
            <tr>
              {columns.map((c) => (
                <th>{c}</th>
              ))}
              <th>Action</th>
            </tr>
          </thead>

          <tbody>
            {records.map((d) => (
              <tr>
                <td>{d.id}</td>
                <td>{d.candidateName}</td>
                <td>{d.Age}</td>
                <td>{d.Gender}</td>
                <td>{d.Email}</td>
                <td>{d.partyName}</td>

                <td>
                  <Link
                    to={`/updatecandidate/${d.id}`}
                    className="btn btn-sm btn-success "
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

export default ViewCandidate;
