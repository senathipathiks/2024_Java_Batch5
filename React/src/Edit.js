import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./Home.css";

function Edit() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:6001/users/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:6001/users/" + id, data).then((res) => {
      alert("User Updated Successfully");
      navigate("/viewu");
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
            <h2 id="align">Update User's Data</h2>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="name"
                className="form-control"
                value={data.id}
                onChange={(e) => setData({ ...data, Name: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="name">Name :</lable>
              <input
                type="text"
                name="name"
                className="form-control"
                value={data.Name}
                onChange={(e) => setData({ ...data, Name: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="mobile">Mobile :</lable>
              <input
                type="number"
                name="mobile"
                className="form-control"
                value={data.Mobile}
                onChange={(e) => setData({ ...data, Mobile: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="city">City :</lable>
              <input
                type="text"
                name="city"
                className="form-control"
                value={data.City}
                onChange={(e) => setData({ ...data, City: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="Flavour">Flavour :</lable>
              <input
                type="text"
                name="Flavour"
                className="form-control"
                value={data.Pincode}
                onChange={(e) => setData({ ...data, Flavour: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="pincode">Pincode :</lable>
              <input
                type="number"
                name="pincode"
                className="form-control"
                value={data.Pincode}
                onChange={(e) => setData({ ...data, Pincode: e.target.value })}
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
