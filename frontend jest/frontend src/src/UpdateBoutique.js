import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function UpdateBoutique() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:4444/boutique/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:4444/boutique", data).then((res) => {
      alert("Boutique Data Updated Successfully !!!");
      navigate("/viewboutique");
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
            <h1>UPDATE BOUTIQUE DATA</h1>

            <div>
              <label htmlFor="boutiqueID">Boutique ID :</label>
              <input
                type="text"
                disabled
                name="boutiqueID"
                role="boutiqueID"
                className="form-control"
                value={data.boutiqueID}
                onChange={(e) => setData({ ...data, boutiqueName: e.target.value })}
              />
            </div>

            <div>
            <label htmlFor="boutiqueName">Boutique Name :</label>
            <input
              type="text"
              name="boutiqueName"
              role="boutiqueName"
              className="form-control"
              value={data.boutiqueName}
              onChange={(e) =>
                setData({ ...data, boutiqueName: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="email">E-Mail :</label>
            <input
              type="text"
              name="email"
              role="email"
              className="form-control"
              value={data.email}
              onChange={(e) =>
                setData({ ...data, email: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="address">Address :</label>
            <input
              type="text"
              name="address"
              role="address"
              className="form-control"
              value={data.address}
              onChange={(e) =>
                setData({ ...data, address: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="description">Description :</label>
            <input
              type="text"
              name="description"
              role="description"
              className="form-control"
              value={data.description}
              onChange={(e) =>
                setData({ ...data, description: e.target.value })
              }
            />
          </div>

            <br />

            <button className="btn btn-info " role="button">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default UpdateBoutique;
