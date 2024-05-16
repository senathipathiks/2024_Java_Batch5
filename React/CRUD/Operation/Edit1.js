import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function Edit1() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:5002/users/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:5002/users/" + id, data).then((res) => {
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
            <h1>UPDATE ADVERTISEMENT</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="name"
                className="form-control"
                value={data.id}
                onChange={(e) => setData({ ...data, Category: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="name">Category :</lable>
              <input
                type="text"
                name="name"
                className="form-control"
                value={data.Category}
                onChange={(e) => setData({ ...data, Category: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="mobile">Cost :</lable>
              <input
                type="number"
                name="mobile"
                className="form-control"
                value={data.Cost}
                onChange={(e) => setData({ ...data, Cost: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="city">Author :</lable>
              <input
                type="text"
                name="city"
                className="form-control"
                value={data.Author}
                onChange={(e) => setData({ ...data, Author: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="pincode">Valid :</lable>
              <input
                type="number"
                name="pincode"
                className="form-control"
                value={data.Valid}
                onChange={(e) => setData({ ...data, Valid: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="pincode">Link :</lable>
              <input
                type="text"
                name="pincode"
                className="form-control"
                value={data.Link}
                onChange={(e) => setData({ ...data, Link: e.target.value })}
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

export default Edit1;
