import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./Edit.css";

function Edit() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:8005/employee/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:8005/employee", data).then((res) => {
      alert("Employee Updated Successfully");
      navigate("/View");
    });
  };

  return (
    <div class="body">
      <div class="cards">
        
          <form onSubmit={handleSubmit}>
            <h2 id="align">Update Patients's Data</h2>
            <div>
              <lable htmlFor="empid">ID :</lable>
              <input
                type="text"
                disabled
                name="empid"
                className="form-control"
                value={data.empid}
                //onChange={(e) => setData({ ...data, id: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="name">Emp Name :</lable>
              <input
                type="text"
                name="empname"
                className="form-control"
                value={data.empname}
                onChange={(e) => setData({ ...data, empname: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="department">Department :</lable>
              <input
                type="text"
                name="department"
                className="form-control"
                value={data.department}
                onChange={(e) => setData({ ...data, department: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="roll">Roll :</lable>
              <input
                type="text"
                name="roll"
                className="form-control"
                value={data.roll}
                onChange={(e) => setData({ ...data, roll: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="city">City :</lable>
              <input
                type="text"
                name="city"
                className="form-control"
                value={data.city}
                onChange={(e) => setData({ ...data, city: e.target.value })}
              />
            </div>
            <br/>
            <button id="value" className="btn btn-info ">Update</button>
          </form>
        </div>
    </div>
  );
}

export default Edit;
