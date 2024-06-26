import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";

function ViewFurniture() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    axios
      .get("http://localhost:1225/sales/all")
      .then((response) => {
        setRecords(response.data);
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  useEffect(() => {
    axios
      .get("http://localhost:1225/furniture/all")
      .then((response) => {
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
        <h4 className="text-center">Furniture details</h4>
        <br />
        <table className="table table-hover table-bordered table-striped w-100 border bg-white shadow px-5 pb-5 rounded">
          <thead className="table table-dark">
            <tr>

              
              {columns.map((c, i) => (
                <th key={i} className="text-center">{c}</th>
              ))}
              <th className="text-center">Sale ID</th>
              <th className="text-center">Action</th>
            </tr>
          </thead>
          <tbody>
            {records.map((record, i) => (
              <React.Fragment key={i}>
                {record.furniture.map((furniture, j) => (
                  <tr key={j} className="text-center">
                    <td>{furniture.id}</td>
                    <td>{furniture.name}</td>
                    <td>{furniture.description}</td>
                    <td>{furniture.price}</td>
                    <td>{furniture.stock}</td>
                    <td>{record.saleId}</td>
                    <td className="text-center">
                      <div className="action-button">
                        <Link
                          to={`/editfurniture/${furniture.id}`}
                          className="btn btn-sm btn-success button"
                        >
                          Update
                        </Link>
                        <button
                          onClick={() => handleSubmit(record.id)}
                          className="btn btn-sm ms-1 btn-danger button"
                        >
                          Delete
                        </button>
                      </div>
                    </td>
                  </tr>
                ))}
              </React.Fragment>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default ViewFurniture;