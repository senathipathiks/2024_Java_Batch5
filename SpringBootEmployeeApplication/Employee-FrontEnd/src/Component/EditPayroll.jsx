import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function EditPayroll() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:1224/payroll/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:1224/payroll", data).then((res) => {
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
            <h1>UPDATE PAYROLL DATA'S</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="pId"
                className="form-control"
                value={data.pId}
                // onChange={(e) => setData({ ...data, Name: e.target.value })}
                readOnly
              />
            </div>

            <div>
              <lable htmlFor="name">HRA :</lable>
              <input
                type="text"
                name="hre"
                className="form-control"
                value={data.hre}
                onChange={(e) => setData({ ...data, hre: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="mobile">TA :</lable>
              <input
                type="text"
                name="ta"
                className="form-control"
                value={data.ta}
                onChange={(e) => setData({ ...data, ta: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="city">BP :</lable>
              <input
                type="text"
                name="bp"
                className="form-control"
                value={data.bp}
                onChange={(e) => setData({ ...data, bp: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="pincode">PF :</lable>
              <input
                type="text"
                name="pf"
                className="form-control"
                value={data.pf}
                onChange={(e) => setData({ ...data, pf: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="pincode">PF :</lable>
              <input
                type="text"
                name="ctc"
                className="form-control"
                value={parseInt(data.hre)+parseInt(data.ta)+parseInt(data.bp)+parseInt(data.pf)}
              onBlur={(e) =>
                setData({ ...data, ctc:e.target.value })
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

export default EditPayroll;
