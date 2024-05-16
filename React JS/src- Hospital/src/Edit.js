import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function Edit() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:5000/users/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:5000/users/" + id, data).then((res) => {
      alert("User Updated Successfully");
      navigate("/");
    });
  };

  return (
    <div>
      <div
        id="edit2"
        className="d-flex w-100 vh-100 justify-content-center align-items-center "
      >
        <div className="w-50 border bg-light p-5">
          <form onSubmit={handleSubmit}>
            <h1>UPDATE PATIENT's DATA</h1>
            <div>
              <lable htmlFor="id">Patient's ID :</lable>
              <input
                type="text"
                disabled
                name="name"
                className="form-control"
                value={data.id}
                onChange={(e) => setData({ ...data, PName: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="name">Patient Name :</lable>
              <input
                type="text"
                name="name"
                className="form-control"
                value={data.PName}
                onChange={(e) => setData({ ...data, PName: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="mobile">Patient's Contact  :</lable>
              <input
                type="number"
                name="mobile"
                className="form-control"
                value={data.PMobile}
                onChange={(e) => setData({ ...data, PMobile: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="city">Disease Diagnosed :</lable>
              <input
                type="text"
                name="city"
                className="form-control"
                value={data.Disease}
                onChange={(e) => setData({ ...data, Disease: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="pincode">Consultant :</lable>
              <input
                type="text"
                name="pincode"
                className="form-control"
                value={data.Consultant}
                onChange={(e) => setData({ ...data, Consultant: e.target.value })}
              />
            </div>
            <br />

            <div>
              <lable htmlFor="Age">Age:</lable>
              <input
                type="number"
                name="age"
                className="form-control"
                value={data.Age}
                onChange={(e) => setData({ ...data,Age: e.target.value })}
              />
            </div>
            <br />

            <button className="btn btn-info ">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default Edit;
