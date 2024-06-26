import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./View.css";

function ViewPayroll() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:8005/payroll/all")
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
        .delete("http://localhost:8005/payroll/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/viewpayroll");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (

    <div class="body">
        <div className="container ">
          <center><h1 id="app2" className="text-center cardsHead">
            Payroll
          </h1></center>

          <div className="text-end">
            <Link to="/createpayroll" className="btn btn-primary">
              Add +
            </Link>
          </div>
          <br />
          <table className="tables table-bordered  table-striped w-100 border shadow px-10 pb-10 rounded ">
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
                  <td>{d.pid}</td>
                  <td>{d.basic}</td>
                  <td>{d.hra}</td>
                  <td>{d.da}</td>
                  <td>{d.ta}</td>
                  <td>{d.pf}</td>
                  <td>{d.ctc}</td>

                  <td>
                    <Link
                      to={`/updatepayroll/${d.pid}`}
                      className="btn btn-sm btn-success "
                    >
                      Update
                    </Link>
                    <button
                      onClick={(e) => handleSubmit(d.pid)}
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

export default ViewPayroll;
