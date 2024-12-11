import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function Edit() {
  const { id } = useParams();
  // const [data, setData] = useState([]);
  // const [datas, setDatas] = useState([]);
  // const [pid, setPid] = useState([]);
  const [inputData,setInputdata]=useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:1000/payroll/" + id)
      .then((response) => setInputdata(response.data))
      .catch((err) => console.log(err));
  }, []);

  // useEffect(() => {
  //   axios
  //     .get("http://localhost:1000/employee/all")
  //     .then((response) => setDatas(response.data))
  //     .catch((err) => console.log(err));
  // }, []);
  
  
//   const handleChange = (e) => {
//     setPid(e.target.value);
//     axios
//       .get("http://localhost:1000/payroll/" + e.target.value)
//       .then((response) => {
//         setData((inputData) => ({
//           ...inputData,
//           salary: response.data
//         }));
//         console.log(response.data);
//       })
//       .catch((err) => {
//         console.log(err);
//       });
// };

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:1000/payroll" , inputData).then((res) => {
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
                readOnly
                name="name"
                className="form-control"
                value={inputData.pid}
                onChange={(e) =>
                  setInputdata({ ...inputData, pid: e.target.value })
                }
              />
            </div>
            <div>
            <lable htmlFor="BasicPay">BasicPay</lable>
            <input
              type="number"
              name="bp"
              value={inputData.bp}
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputData, bp: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="da">DA :</lable>
            <input
              type="number"
              name="da"
              className="form-control"
              value={inputData.da}
              onChange={(e) =>
                setInputdata({ ...inputData, da: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="ta">Ta :</lable>
            <input
              type="number"
              name="ta"
              className="form-control"
              value={inputData.ta}
              onChange={(e) =>
                setInputdata({ ...inputData, ta: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="hr">HRA :</lable>
            <input
              type="number"
              name="hr"
              className="form-control"
              value={inputData.hr}
              onChange={(e) =>
                setInputdata({ ...inputData, hr: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="sal">Salary :</lable>
            <input
              type="number"
              name="sal"
              className="form-control"
              value={parseInt(inputData.bp)+parseInt(inputData.hr)+parseInt(inputData.da)+parseInt(inputData.ta)}
              onBlur={(e) =>
                setInputdata({ ...inputData, sal: e.target.value })
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

export default Edit;
