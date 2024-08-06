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
      .get("http://localhost:2222/meetroom/all")
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
        .delete("http://localhost:2222/meetroom/" + id)
        .then((res) => {
          navigate("/viewmeetroom");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <div id="body">
      <div className="container ">
        <h1 id="app2" className="text-center ">
          Meeting Room Booking System
        </h1>

        <div className="text-end">
          <Link to="/addmeetroom" className="btn btn-success text-light">
            Add Meeting Room +
          </Link>
        </div>
        <br />
        <table className="table table-bordered  table-striped w-100 border  rounded " id="addemp">
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
                <td>{d.bookingID}</td>
                <td>{d.roomNo}</td>
                <td>{d.teamName}</td>
                <td>{d.startTime}</td>
                <td>{d.endTime}</td>
                <td>
                  <Link
                    to={`/update/${d.bookingID}`}
                    className="btn btn-sm btn-success "
                  >
                    Update
                  </Link>
                  <button
                    onClick={(e) => handleSubmit(d.bookingID)}
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

export default View;
