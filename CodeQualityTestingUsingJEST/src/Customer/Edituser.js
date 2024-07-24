import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function Edit() {
  const { cid } = useParams();
  // const [data, setData] = useState([]);
  // const [datas, setDatas] = useState([]);
  // const [pid, setPid] = useState([]);
  const [inputData,setInputdata]=useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:1000/customer/" + cid)
      .then((response) => setInputdata(response.data))
      
      .catch((err) => console.log(err));
  }, []);

 

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:1000/customer" , inputData).then((res) => {
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
            <h1>UPDATE CUSTOMER DATA'S</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                readOnly
                name="name"
                className="form-control"
                value={inputData.cid}
                onChange={(e) =>
                  setInputdata({ ...inputData, cid: e.target.value })
                }
              />
            </div>
            <div>
            <lable htmlFor="uname">User Name</lable>
            <input
              type="text"
              name="uname"
              className="form-control"
              value={inputData.uname}
              onChange={(e) =>
                setInputdata({ ...inputData, uname: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="addr">Address :</lable>
            <input
              type="text"
              name="addr"
              value={inputData.addr}
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputData, addr: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="cmobile">Mobile :</lable>
            <input
              type="number"
              name="cmobile"
              value={inputData.cmobile}
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputData, cmobile: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pt">Payment Type :</lable>
            <input
              type="Text"
              name="pt"
              value={inputData.pt}
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputData, pt: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="bill">Bill Status :</lable>
            <input 
              type="text"
              name="bill"
              value={inputData.billSts}
              className="form-control"
              // value={parseInt(inputdata.bp)+parseInt(inputdata.hr)+parseInt(inputdata.da)+parseInt(inputdata.ta)}
              onChange={(e) =>
                setInputdata({ ...inputData, billSts: e.target.value })
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
