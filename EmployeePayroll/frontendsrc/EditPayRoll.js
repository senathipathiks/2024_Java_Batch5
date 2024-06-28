import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./Home.css";

function EditAdmin() {
  const { payrollid } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:8787/payroll/" + payrollid)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:8787/payroll", data).then((res) => {
      alert("Payroll Updated Successfully");
      navigate("/ViewPayroll");
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
            <h2 id="align">Update Payroll's Data</h2>
            <div>
              <lable htmlFor="payrollid">ID :</lable>
              <input
                type="number"
                disabled
                name="payrollid"
                className="form-control"
                value={data.payrollid}
                readOnly
                // onChange={(e) => setData({ ...data, payrollid: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="basic">BASIC :</lable>
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
              <lable htmlFor="ta">TA :</lable>
              <input
                type="number"
                name="ta"
                className="form-control"
                value={data.ta}
                onChange={(e) => setData({ ...data, ta: e.target.value })}
              />
            </div>

            
            <br />

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
                onBlur={(e) => setData({ ...data, ctc: e.target.value })}
              />
            </div>

            

            <button id="value" className="btn btn-info ">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default EditAdmin;
