import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";

function Viewshop() {
    const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:2222/shop/all")
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
        .delete("http://localhost:2222/shop/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <div id="add2">
    <div className="container "  >

      <h1 id="app2" className="text-center text-dark bg-light">
       Gift Shop Management System
      </h1>

      <div className="text-end">
        <Link to="/add" className="btn btn-primary">
          Add +
        </Link>
      </div>
      <br />
      <table className="table table-bordered table-dark table-hover  table-striped w-100 border  shadow px-5 pb-5 rounded ">
        <thead class="table-dark">
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
              <td>{d.prname}</td>
             
              <td>{d.available}</td>
              <td>{d.userrating}</td>
              <td>{d.product.price}</td>

              <td>
                <Link
                  to={`/edit/${d.id}`}
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

export default Viewshop
