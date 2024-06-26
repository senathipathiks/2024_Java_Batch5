import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./Edit.css";

function Edit() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:8005/payroll/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:8005/payroll", data).then((res) => {
      alert("payroll Updated Successfully");
      navigate("/viewpayroll");
    });
  };

  return (
    <div class="body">
      <div class="cards">
       
          <form onSubmit={handleSubmit}>
            <h2 id="align">Update payroll's Data</h2>
            <div>
  <lable htmlFor="pid">ID :</lable>
              <input
                type="text"
                disabled
                name="pid"
                className="form-control"
                value={data.pid}
                //onChange={(e) => setData({ ...data, id: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="basic">Basic pay :</lable>
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
              <lable htmlFor="ctc">CTC   :</lable>
              <input
                type="number"
                name="ctc"
                className="form-control"
                value={parseInt(data.basic)+parseInt(data.hra)+parseInt(data.da)+parseInt(data.ta)+parseInt(data.pf)}
                onBlur={(e) => setData({ ...data, ctc: e.target.value })}
              />
            </div><br />
            <button id="value" className="btn btn-info ">Update</button>
          </form>
        </div>
    </div>
  );
}

export default Edit;
