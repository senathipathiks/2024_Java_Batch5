import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function UpdatePetShop() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:3333/petShop/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:3333/petShop", data).then((res) => {
      alert("User Updated Successfully");
      navigate("/viewpetshop");
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
            <h1>UPDATE PETSHOP DATA</h1>

            <div>
              <lable htmlFor="psid">Pet Shop ID :</lable>
              <input
                type="text"
                disabled
                name="psid"
                className="form-control"
                value={data.psid}
                onChange={(e) => setData({ ...data, psname: e.target.value })}
              />
            </div>

            <div>
            <lable htmlFor="psname">Pet Shop Name :</lable>
            <input
              type="text"
              name="psname"
              className="form-control"
              value={data.psname}
              onChange={(e) =>
                setData({ ...data, psname: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="psaddress">Address :</lable>
            <input
              type="text"
              name="psaddress"
              className="form-control"
              value={data.psaddress}
              onChange={(e) =>
                setData({ ...data, psaddress: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="psemail">Email :</lable>
            <input
              type="text"
              name="psemail"
              className="form-control"
              value={data.psemail}
              onChange={(e) =>
                setData({ ...data, psemail: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="psdesc">Description :</lable>
            <input
              type="text"
              name="psdesc"
              className="form-control"
              value={data.psdesc}
              onChange={(e) =>
                setData({ ...data, psdesc: e.target.value })
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

export default UpdatePetShop;
