import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";
import Navbar from "../components/Navbar";

function Edit() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:1111/employee/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:1111/employee", data).then((res) => {
      alert("Employee Details Updated Successfully");
      navigate("/");
    });
  };

  return (
    <div>
      <Navbar />
      
    <div
      id="edit2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center"
      style={{ backdropFilter: 'blur(5px)', backgroundColor: '#f9f9f9', padding: '20px' }}
    >
      <div className="w-50 border bg-light p-5" style={{ animation: 'fadeIn 0.5s',  border: '4px solid black', borderRadius: '30px' }}>
        <form onSubmit={handleSubmit}>
          <h1 style={{ marginBottom: '20px', color: '#333', fontFamily: 'Arial, sans-serif' }}>
            UPDATE EMPLOYEES DATA
          </h1>
          <div className="mb-3">
            <label htmlFor="id">ID:</label>
            <input
              type="number"
              disabled
              name="id"
              className="form-control"
              value={data.id}
              onChange={(e) => setData({ ...data, id: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="name">Name:</label>
            <input
              type="text"
              name="name"
              className="form-control"
              value={data.name}
              onChange={(e) => setData({ ...data, name: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="department">Department:</label>
            <input
              type="text"
              name="department"
              className="form-control"
              value={data.department}
              onChange={(e) => setData({ ...data, department: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="designation">Designation:</label>
            <input
              type="text"
              name="designation"
              className="form-control"
              value={data.designation}
              onChange={(e) => setData({ ...data, designation: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="salary">Salary:</label>
            <input
              type="number"
              name="salary"
              className="form-control"
              value={data.salary}
              onChange={(e) => setData({ ...data, salary: e.target.value })}
            />
          </div>
          <button className="btn btn-info" style={{ fontSize: '16px', padding: '10px 20px' }}>
            Update
          </button>
        </form>
      </div>
    </div>
  

    </div>
  );
}

export default Edit;
