import React, { useEffect, useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import './App.css'
import axios from "axios";

function App() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    const fetchRecords = async () => {
      try {
        const response = await axios.get("http://localhost:1244/restaurant/all");
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      } catch (err) {
        console.error("Error fetching payroll records:", err);
      }
    };
    fetchRecords();
  }, []);



  let handleSubmit = (id) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
        .delete("http://localhost:1244/restaurant/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/Restaurant");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <div id="body">
      <div className="container ">
        <h1 id="app2"style={{
            backgroundImage: `url('https://pearlsol.com/img/breadcrumb/hd%20blog%20pic.jpg')`,
            backgroundSize: 'cover'}} className="text-center text-bg-success ">
          Restaurant Management System
        </h1>

        <div className="text-end">
          <Link to="/RestAdd" className="btn btn-primary">
            Add +
          </Link>
        </div>
        <br />
        <table style={ {borderRadius: "10px"}} className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
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
                <td>{d.restaurant_id}</td>
                <td>{d.name}</td>
                <td>{d.ratings}</td>
                <td>{d.phnum}</td>

                <td>
                  <Link
                    to={`/RestEdit/${d.id}`}
                    className="btn btn-sm btn-success"
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

export default App;

