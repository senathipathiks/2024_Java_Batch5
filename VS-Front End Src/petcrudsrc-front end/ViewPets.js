import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";

function ViewPets() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:3333/pets/all")
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
        .delete("http://localhost:3333/pets/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/viewpets");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <div id="body">
      <div className="container ">
        <h1 id="app2" className="text-center">
          Online Pet Shop
        </h1>

        <div className="text-end">
          <Link to="/addpets" className="btn btn-success text-light" id="viewlink">
            Add Pets +
          </Link>
        
          <Link to="/addpetshop" className="btn btn-success text-light" id="viewlink">
            Add Pet Shop +
          </Link>

          <Link to="/viewpetshop" className="btn btn-success text-light" id="viewlink">
            View Pet Shop +
          </Link>
        </div>
        <table className="table table-bordered  table-striped w-100 border  rounded " id="addemp">
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
                <td>{d.ppid}</td>
                <td>{d.ppname}</td>
                <td>{d.pptype}</td>
                <td>{d.pgender}</td>
                <td>{d.pbreed}</td>
                <td>{d.page}</td>
                <td>{d.pstockLeft}</td>
                <td>{d.price}</td>
                

                <td>
                  <Link
                    to={`/updatepets/${d.ppid}`}
                    className="btn btn-sm btn-success "
                  >
                    Update
                  </Link>
                  <button
                    onClick={(e) => handleSubmit(d.ppid)}
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

export default ViewPets;
