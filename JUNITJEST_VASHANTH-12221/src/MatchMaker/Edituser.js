import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";


function Edit() {
  const { mid } = useParams();
 
  const [inputData,setInputdata]=useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:1000/match/" + mid)
      .then((response) => setInputdata(response.data))
      
      .catch((err) => console.log(err));
  }, []);

 
  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:1000/match/"+inputData.mid , inputData).then((res) => {
      alert("Updated Successfully");
      navigate("/view");
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
            <h1 data-testid="heading" >UPDATE MATCH MAKER  DATA'S</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                readOnly
                name="name"
                className="form-control"
                value={inputData.mid}
                onChange={(e) =>
                  setInputdata({ ...inputData, mid: e.target.value })
                }
              />
            </div>
            <div>
            <lable htmlFor="uname">User Name</lable>
            <input
              type="text"
              name="uname"
              role="name"
              className="form-control"
              value={inputData.mname}
              onChange={(e) =>
                setInputdata({ ...inputData, mname: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="addr">Address :</lable>
            <input
              type="text"
              name="addr"
              role="addr"
              value={inputData.maddr}
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputData, maddr: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="cmobile">Mobile :</lable>
            <input
              type="number"
              name="cmobile"
              role="mobile"
              value={inputData.mnum}
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputData, mnum: e.target.value })
              }
            />
          </div>

         


    

            <br />

            <button className="btn btn-info " data-testid="submitbutton">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default Edit;
