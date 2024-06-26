import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";


const ViewSales = () => {
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
    <div>
      <div className="container paddings">
        <div class="p-3 mb-2 bg-primary text-white">
          <h1 id="app2" className="text-center text-bg-success " >
            Online Furniture Store
          </h1>

        </div>
        <h4 className="text-center">Sales details</h4>
        <table className="table table-hover table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead className="table table-dark">
            <tr>
              <th className="text-center">Sale ID</th>
              <th className="text-center">SaleDate</th>
              <th className="text-center">QuantitySold</th>
              <th className="text-center">Action</th>
            </tr>
          </thead>
          <tbody>
            {records.map((d, i) => (
              <tr key={i} className="text-center">
                <td>{d.saleId}</td>
                <td>{d.saleDate}</td>
                <td>{d.quantitySold}</td>
                <td className="text-center">
                  <div className="action-button">
                    <Link
                      to={`/editsale/${d.saleId}`}
                      className="btn btn-sm btn-success button"
                    >
                      Update
                    </Link>
                    <button
                      onClick={(e) => handleSubmit(d.saleId)}
                      className="btn btn-sm ms-1 btn-danger button"
                    >
                      Delete
                    </button>
                  </div>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default ViewSales
