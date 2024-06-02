import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./Home.css";

function EditCom() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:3000/company/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:3000/company/" + id, data).then((res) => {
      alert("Company Updated Successfully");
      navigate("/ViewCompany");
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
            <h2 id="align">Update Software License Data</h2>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="name"
                className="form-control"
                value={data.id}
                onChange={(e) => setData({ ...data, id: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="name">Name :</lable>
              <input
                type="text"
                name="name"
                className="form-control"
                value={data.cName}
                onChange={(e) => setData({ ...data, cName: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="mobile">Link :</lable>
              <input
                type="text"
                name="link"
                className="form-control"
                value={data.cLink}
                onChange={(e) => setData({ ...data, cLink: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="city">Code :</lable>
              <input
                type="number"
                name="code"
                className="form-control"
                value={data.cCode}
                onChange={(e) => setData({ ...data, cCode: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="pincode">PhoneNo :</lable>
              <input
                type="number"
                name="phoneNo"
                className="form-control"
                value={data.phoneNo}
                onChange={(e) => setData({ ...data, phoneNo: e.target.value })}
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

export default EditCom;
