import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function UpdatePets() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:3333/pets/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:3333/pets", data).then((res) => {
      alert("User Updated Successfully");
      navigate("/viewpets");
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
            <h1>UPDATE PETS DATA</h1>

            <div>
              <lable htmlFor="ppid">Pets ID :</lable>
              <input
                type="text"
                disabled
                name="ppid"
                className="form-control"
                value={data.ppid}
                onChange={(e) => setData({ ...data, ppname: e.target.value })}
              />
            </div>

            <div>
            <lable htmlFor="ppname">Pet Product Name :</lable>
            <input
              type="text"
              name="ppname"
              className="form-control"
              value={data.ppname}
              onChange={(e) =>
                setData({ ...data, ppname: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pptype">Pet Product Type :</lable>
            <input
              type="text"
              name="pptype"
              className="form-control"
              value={data.pptype}
              onChange={(e) =>
                setData({ ...data, pptype: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pgender">Pet Gender :</lable>
            <input
              type="text"
              name="pgender"
              className="form-control"
              value={data.pgender}
              onChange={(e) =>
                setData({ ...data, pgender: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pbreed">Pet Breed :</lable>
            <input
              type="text"
              name="pbreed"
              className="form-control"
              value={data.pbreed}
              onChange={(e) =>
                setData({ ...data, pbreed: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="page">Pet Age :</lable>
            <input
              type="text"
              name="page"
              className="form-control"
              value={data.page}
              onChange={(e) =>
                setData({ ...data, page: e.target.value })
              }
            />
          </div>
          
          <div>
            <lable htmlFor="pstockLeft">Pet Stock Left :</lable>
            <input
              type="text"
              name="pstockLeft"
              className="form-control"
              value={data.pstockLeft}
              onChange={(e) =>
                setData({ ...data, pstockLeft: e.target.value })
              }
            />
          </div>
          
          <div>
            <lable htmlFor="price">Price :</lable>
            <input
              type="text"
              name="price"
              className="form-control"
              value={data.price}
              onChange={(e) =>
                setData({ ...data, price: e.target.value })
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

export default UpdatePets;
