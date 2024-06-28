import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./Home.css";

function Edit() {
  const { empid } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:8787/employee/" + empid)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:8787/employee" , data).then((res) => {
      alert("Employee Updated Successfully");
      navigate("/viewEmployee");
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
            <h2 empid="align">Update Employee's Data</h2>
            <div>
              <lable htmlFor="empid">ID :</lable>
              <input
                type="number"
                disabled
                name="empid"
                className="form-control"
                value={data.empid}
                onChange={(e) => setData({ ...data, empid: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="empname">Name :</lable>
              <input
                type="text"
                name="empname"
                className="form-control"
                value={data.empname}
                onChange={(e) => setData({ ...data, empname: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="empdesignation">Designation :</lable>
              <input
                type="text"
                name="empdesignation"
                className="form-control"
                value={data.empdesignation}
                onChange={(e) => setData({ ...data, empdesignation: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="empcity">City :</lable>
              <input
                type="text"
                name="empcity"
                className="form-control"
                value={data.empcity}
                onChange={(e) => setData({ ...data, empcity: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="emprole">Role :</lable>
              <input
                type="text"
                name="emprole"
                className="form-control"
                value={data.emprole}
                onChange={(e) => setData({ ...data, emprole: e.target.value })}
              />
            </div>

            <br />

            <button id="value" className="btn btn-info ">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default Edit;
