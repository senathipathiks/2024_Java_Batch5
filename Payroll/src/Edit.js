import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function Edit() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const [datas, setDatas] = useState([]);
  const [pid, setPid] = useState([]);
  const [inputData,setInputdata]=useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:1000/employee/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  useEffect(() => {
    axios
      .get("http://localhost:1000/payroll/all")
      .then((response) => setDatas(response.data))
      .catch((err) => console.log(err));
  }, []);
  
  
  const handleChange = (e) => {
    setPid(e.target.value);
    axios
      .get("http://localhost:1000/payroll/" + e.target.value)
      .then((response) => {
        setData((data) => ({
          ...data,
          salary: response.data
        }));
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
};

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:1000/employee" , data).then((res) => {
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
            <h1>UPDATE EMPLOYEE DATA'S</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="name"
                className="form-control"
                value={data.id}
              />
            </div>

            <div>
              <lable htmlFor="name">Name :</lable>
              <input
                type="text"
                name="name"
                className="form-control"
                value={data.name}
                onChange={(e) => setData({ ...data, name: e.target.value })}
              />
            </div>
            <div>
              <lable htmlFor="mobile">Mobile :</lable>
              <input
                type="number"
                name="mobile"
                className="form-control"
                value={data.mobile}
                onChange={(e) => setData({ ...data, mobile: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="city">City :</lable>
              <input
                type="text"
                name="city"
                className="form-control"
                value={data.city}
                onChange={(e) => setData({ ...data, city: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="desg">Designation :</lable>
              <input
                type="text"
                name="desg"
                className="form-control"
                value={data.dept}
                onChange={(e) => setData({ ...data, dept: e.target.value })}
              />
            </div>

            <div>
        <label htmlFor="selectId">Select an Payroll ID:</label>
        <select id="selectId" onChange={handleChange}>
          <option value="" >Select an ID</option>
          {datas.map((item) => (
            <option key={item.pid} value={item.pid}>
              {item.pid} 
            </option>
          ))}
        </select>
        
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
