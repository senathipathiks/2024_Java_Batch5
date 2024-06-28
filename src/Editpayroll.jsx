import React, { useEffect, useState }from 'react'
import axios from "axios";
import {useNavigate, useParams} from "react-router-dom";

function Edit() {
    const { id }= useParams();
    const [data, setData]= useState([]);
    const navigate= useNavigate();
    useEffect(()=>{
        axios
        .get("http://localhost:12209/payrolltable/" + id)
        .then((response)=> setData(response.data))
        .catch((err)=> console.log(err));

    },[]);

    let handleSubmit = (e) => {
        e.preventDefault();
        axios.put("http://localhost:12209/payrolltable" , data).then((res)=>{
            alert("User updated successfully");
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
            <h1>PAYROLL DETAILS</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="number"
                disabled
                name="id"
                className="form-control"
                value={data.id}
                //onChange={(e) => setData({ ...data, name: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="hra">House Rent Allowance :</lable>
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
              <lable htmlFor="ta">Travel Allowance :</lable>
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
            <lable htmlFor="ctc">CTC :</lable>
            <input
              type="number"
              name="ctc"
              className="form-control"
              value={parseInt(data.hra)+parseInt(data.da)+parseInt(data.ta)+parseInt(data.pf)}
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

export default Edit
