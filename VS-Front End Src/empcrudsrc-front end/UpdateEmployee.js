import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function UpdateEmployee() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:2456/employee/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:2456/employee", data).then((res) => {
      alert("User Updated Successfully");
      navigate("/viewemployee");
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
            <h1>UPDATE EMPLOYEE DATA</h1>

            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="id"
                className="form-control"
                value={data.id}
                onChange={(e) => setData({ ...data, name: e.target.value })}
              />
            </div>

            <div>
            <lable htmlFor="name">Name :</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              value={data.name}
              onChange={(e) =>
                setData({ ...data, name: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="age">Age :</lable>
            <input
              type="text"
              name="age"
              className="form-control"
              value={data.age}
              onChange={(e) =>
                setData({ ...data, age: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="desig">Designation :</lable>
            <input
              type="text"
              name="desig"
              className="form-control"
              value={data.desig}
              onChange={(e) =>
                setData({ ...data, desig: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="dept">Department :</lable>
            <input
              type="text"
              name="dept"
              className="form-control"
              value={data.dept}
              onChange={(e) =>
                setData({ ...data, dept: e.target.value })
              }
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

export default UpdateEmployee;
