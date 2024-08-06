import React, { useEffect, useState } from "react";
import axios from "axios";
import "./App2.css";
import { Link, useNavigate, RouterContext } from "react-router-dom";

function ViewProducts() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:4444/products/all")
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
        .delete("http://localhost:4444/products/" + id)
        .then((res) => {
          navigate("/viewproducts");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <div id="body">
      <div className="container ">
        <h1 id="app2" className="text-center">
          Online Boutique
        </h1>

        <div className="text-end">
          <Link to="/addproduct" className="btn btn-success text-light" id="viewlink" role="addproduct">
            Add Product +
          </Link>
          
          <Link to="/viewboutique" className="btn btn-success text-light" id="viewlink" role="viewboutique">
            View Boutiques +
          </Link>
        </div>
        <br />
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
                <td>{d.productID}</td>
                <td>{d.productName}</td>
                <td>{d.productType}</td>
                <td>{d.stockLeft}</td>
                <td>{d.price}</td>
                <td>{d.boutique.boutiqueID}</td>
                <td>
                  <Link
                    to={`/updateproduct/${d.productID}`}
                    className="btn btn-sm btn-success "
                    role="updaterecord"
                  >
                    Update
                  </Link>
                  <button
                    onClick={(e) => handleSubmit(d.productID)}
                    className="btn btn-sm ms-1 btn-danger"
                    role="deleterecord"
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

export default ViewProducts;
