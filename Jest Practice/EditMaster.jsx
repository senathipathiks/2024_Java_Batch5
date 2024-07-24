

import React, { useEffect, useState } from 'react';
import axios from "axios";
import { useNavigate, useParams } from "react-router-dom";
import './EditMaster.css';

function EditJob() {
  const { id } = useParams();
  const [data, setData] = useState([]);
 

  useEffect(() => {
    axios
     .get("http://localhost:7727/mast/" + id)
     .then((response) => setData(response.data))
     .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:7727/mast", data).then((res) => {
      alert("User updated successfully");
      window.location.href="/ViewMaster";
    });
  };

  return (
    <div className="edit-job-container">
      <div className="edit-job-form">
        <h1 title='headingMaster'>Gym Center System</h1>
        <form onSubmit={handleSubmit}>
          <div className="form-group">
            <label htmlFor="masterID">ID :</label>
            <input
              type="number"
              disabled
              name="masterID"
              className="form-control"
              role='masterId'
              value={data.masterID}
            />
          </div>

          <div className="form-group">
            <label htmlFor="name">name :</label>
            <input
              type="text"
              name="name"
              className="form-control"
              value={data.name}
              role='Mastername'
              onChange={(e) => setData({...data, name: e.target.value })}
            />
          </div>

          <div className="form-group">
            <label htmlFor="specialist">specialist:</label>
            <input
              type="text"
              name="specialist"
              className="form-control"
              value={data.specialist}
              role="speciality"
              onChange={(e) => setData({...data, specialist: e.target.value })}
            />
          </div>

          <div className="form-group">
            <label htmlFor="availability">availability :</label>
            <input
              type="text"
              name="availability"
              className="form-control"
              value={data.availability}
              role='availability'
              onChange={(e) => setData({...data, availability: e.target.value })}
            />
          </div>

          <div className="form-group">
            <label htmlFor="city">city :</label>
            <input
              type="text"
              name="city"
              className="form-control"
              value={data.city}
             role="mastercity"
              onChange={(e) => setData({...data, city: e.target.value })}
            />
          </div>

          <button className="btn btn-success" name='updated'>Update</button>
        </form>
      </div>
    </div>
  );
}

export default EditJob;
