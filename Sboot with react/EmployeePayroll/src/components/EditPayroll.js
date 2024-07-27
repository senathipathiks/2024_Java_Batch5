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
      .get("http://localhost:1250/payroll/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:1250/payroll", data).then((res) => {
      alert("Student Updated Successfully");
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
              <lable htmlFor="pid">PID :</lable>
              <input
                type="number"
                disabled
                name="pid"
                className="form-control"
                value={data.pid}
                readOnly
                //onChange={(e) => setData({ ...data, Name: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="basic">Basic :</lable>
              <input
                type="number"
                name="basic"
                className="form-control"
                value={data.basic}
                onChange={(e) => setData({ ...data, basic: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="hra">HRA :</lable>
              <input
                type="number"
                name="hra"
                className="form-control"
                value={data.hra}
                onChange={(e) => setData({ ...data, hra: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="da">DA :</lable>
              <input
                type="number"
                name="da"
                className="form-control"
                value={data.da}
                onChange={(e) => setData({ ...data, da: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="pf">PF :</lable>
              <input
                type="number"
                name="pf"
                className="form-control"
                value={data.pf}
                onChange={(e) => setData({ ...data, pf: e.target.value })}
              />
            </div>
            <div>
            <lable htmlFor="ctc">CTC :</lable>
            <input
              type="number"
              name="ctc"
              className="form-control"
              value={parseInt(data.basic)+parseInt(data.hra)+parseInt(data.da)+parseInt(data.pf)}
              onBlur={(e) =>
                setData({ ...data, ctc:e.target.value})
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
