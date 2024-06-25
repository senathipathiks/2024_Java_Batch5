import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function UpdatePayroll() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:2456/payroll/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:2456/payroll", data).then((res) => {
      alert("User Updated Successfully");
      navigate("/viewpayroll");
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
            <h1>UPDATE PAYROLL DATA</h1>

            <div>
              <lable htmlFor="pid">Payroll ID :</lable>
              <input
                type="text"
                disabled
                name="pid"
                className="form-control"
                value={data.pid}
                onChange={(e) => setData({ ...data, hre: e.target.value })}
              />
            </div>

            <div>
            <lable htmlFor="hre">HRE :</lable>
            <input
              type="text"
              name="hre"
              className="form-control"
              value={data.hre}
              onChange={(e) =>
                setData({ ...data, hre: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="ta">TA :</lable>
            <input
              type="text"
              name="ta"
              className="form-control"
              value={data.ta}
              onChange={(e) =>
                setData({ ...data, ta: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="bp">BP :</lable>
            <input
              type="text"
              name="bp"
              className="form-control"
              value={data.bp}
              onChange={(e) =>
                setData({ ...data, bp: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pf">PF :</lable>
            <input
              type="text"
              name="pf"
              className="form-control"
              value={data.pf}
              onChange={(e) =>
                setData({ ...data, pf: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="ctc">CTC :</lable>
            <input
              type="text"
              name="ctc"
              className="form-control"
              value={parseInt(data.hre)+parseInt(data.ta)+parseInt(data.bp)-parseInt(data.pf)}
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

export default UpdatePayroll;
