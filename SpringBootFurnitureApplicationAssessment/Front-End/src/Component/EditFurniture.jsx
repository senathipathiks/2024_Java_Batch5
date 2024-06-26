import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function EditFurniture() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:1225/furniture/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:1225/furniture", data).then((res) => {
      alert("User Updated Successfully");
      navigate("/");
    });
  };

  return (
    <div id="body">
      <div className="container paddings">
        <div className="p-3 mb-2 bg-primary text-white">
          <h1 className="text-center text-bg-success">UPDATE FURNITURE RECORD</h1>
        </div>
        <div className='bod'>
          <div className="wrapper flexCenter paddings innerWidth">
            <div id="add2" className="d-flex w-100 vh-100 justify-content-center align-items-center">
              <div className="w-50 border bg-light">
                <form onSubmit={handleSubmit} className="formcolor">
                  <label><h1>UPDATE FURNITURE DATA'S</h1></label>
                  <div>
                    <label htmlFor="id">ID :</label>
                    <input
                      type="text"
                      name="id"
                      className="form-control"
                      value={data.id}
                      // onChange={(e) => setData({ ...data, Name: e.target.value })}
                      readonly
                    />
                  </div>

                  <div>
                    <label htmlFor="name">Name :</label>
                    <input
                      type="text"
                      name="name"
                      className="form-control"
                      value={data.name}
                      onChange={(e) => setData({ ...data, name: e.target.value })}
                    />
                  </div>
                  <div>
                    <label htmlFor="mobile">Description :</label>
                    <input
                      type="text"
                      name="description"
                      className="form-control"
                      value={data.description}
                      onChange={(e) => setData({ ...data, description: e.target.value })}
                    />
                  </div>

                  <div>
                    <label htmlFor="city">Price :</label>
                    <input
                      type="text"
                      name="price"
                      className="form-control"
                      value={data.price}
                      onChange={(e) => setData({ ...data, price: e.target.value })}
                    />
                  </div>

                  <div>
                    <label htmlFor="pincode">Stock :</label>
                    <input
                      type="text"
                      name="stock"
                      className="form-control"
                      value={data.stock}
                      onChange={(e) => setData({ ...data, stock: e.target.value })}
                    />
                  </div>
                  <br />

                  <button className="btn btn-info button">Update</button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

  );
}

export default EditFurniture;
