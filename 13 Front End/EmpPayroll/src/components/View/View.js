import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./View.css";

function View() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    axios
      .get("http://localhost:8005/employee/all")
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
        .delete("http://localhost:8005/employee/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/View");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  // let displayHandle = (id) =>{
  //   const conf = window.confirm("Do you want to view the data");
  //   if(conf){
  //     axios
  //     .display("http://localhost:5000/users/" + id)
  //     .then((res)=> {
  //       alert("Display the items");
  //       navigate("/describe");
  //       window.location.reload();
  //     })
  //     .catch((err) => console.log(err));
  //   }
  // }

  return (
    <div class="body">
      <div class="container">
        <center><h1 className="text-center cardsHead">
          Employee's Management System
        </h1></center>
        <div className="text-end">
          <Link to="/create" className="btn btn-primary">
            Add +
          </Link>
          
        </div>
        <br />
          <table className=" tables table-bordered  table-striped border shadow px-10 pb-10 rounded ">
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
                  <td>{d.empid}</td>
                  <td>{d.empname}</td>
                  <td>{d.department}</td>
                  <td>{d.roll}</td>
                  <td>{d.city}</td>
                  <td>{d.payroll.ctc}</td>

                  <td>
                    <Link
                      to={`/update/${d.empid}`}
                      className="btn btn-sm btn-success "
                    >
                      Update
                    </Link>
                    <button
                      onClick={(e) => handleSubmit(d.empid)}
                      className="btn btn-sm ms-1 btn-danger"
                    >
                      Delete
                    </button>
                    {/* <Link
                  to={`/describe/${d.id}`}
                  className="btn btn-sm btn-warning"
                  >Display</Link> */}
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
