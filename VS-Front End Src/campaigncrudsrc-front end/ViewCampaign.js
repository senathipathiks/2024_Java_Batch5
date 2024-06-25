import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";

function ViewCampaign() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:7010/campaign/all")
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
        .delete("http://localhost:7010/campaign/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/viewcampaign");
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
          <Link to="/addcampaign" className="btn btn-success text-light">
            Add Campaign +
          </Link>
        </div>
        <br />
        <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead>
            <tr>
              {columns.map((c,i) => (
                <th key={i}>{c}</th>
              ))}
              <th>Action</th>
            </tr>
          </thead>

          <tbody>
            {records.map((d,i) => (
              <tr key={i}>
                <td>{d.id}</td>
                <td>{d.campaignName}</td>
                <td>{d.venueLocation}</td>
                <td>{d.partyName}</td>
                <td>{d.candidateName}</td>
                <td>{d.startTime}</td>
                <td>{d.endTime}</td>
                <td>{d.email}</td>

                <td>
                  <Link
                    to={`/updatecampaign/${d.id}`}
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

export default ViewCampaign;
