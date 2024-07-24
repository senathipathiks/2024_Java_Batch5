import React, { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import "./AddMaster.css";

function AddUser() {
  const [inputData, setInputData] = useState({
    username: "",
    city: "",
    email: "",
    age:""
  });
  const [payrolls, setPayrolls] = useState([]);
  const [selectedPayrollId, setSelectedPayrollId] = useState("");

 

  useEffect(() => {
    axios
      .get("http://localhost:7727/mast/all")
      .then((response) => {
        setPayrolls(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  const handleSubmit = (e) => {
    e.preventDefault();

    if (validateValues(inputData)) {
      axios
        .post(`http://localhost:7727/mem?pId=${selectedPayrollId}`, inputData)
        .then((response) => {

          console.log(selectedPayrollId);

          alert("Data added successfully!");

          setInputData({
            username: "",
            city: "",
            email: "",
            age:""
          });
          setSelectedPayrollId('');

          window.location.href="/ViewUser";
        })
        .catch((err) => {
          console.log(err);
        });
    } else {
      alert("Please Enter Valid Inputs!!!");
    }
  };

  const validateValues = (data) => {
    if (!data.username || !data.city || !data.email || !data.age) {
      return false;
    }
    return true;
  };
  return (
    <div id="add2" className="d-flex w-100 vh-100 justify-content-center align-items-center" style={{ fontSize: "15px" }}>
      <div className="w-50 border  border-dark  p-5" id="addblur" style={{color:"white"}}>
        <form onSubmit={handleSubmit}>
          <h1 className="fst-italic" title="headingUser">ADD USER DATA</h1>
          <div>
            <label htmlFor="username" className="fst-italic "> Name</label>
            <input
              style={{ fontSize: "15px",background:"none" }}
              type="text"
              name="username"
              className="form-control fst-italic "
              value={inputData.username}
              role="member-name"
              onChange={(e) => setInputData({ ...inputData, username: e.target.value })}
            />
          </div>
          <div>
            <label htmlFor="city" className="fst-italic">city :</label>
            <input
              style={{ fontSize: "15px",background:"none" }}
              type="text"
              name="city"
              className="form-control fst-italic"
              value={inputData.city}
              role="city"
              onChange={(e) => setInputData({ ...inputData, city: e.target.value })}
            />
          </div>
          <div>
            <label htmlFor="email" className="fst-italic">email :</label>
            <input
              style={{ fontSize: "15px",background:"none" }}
              type="email"
              name="email"
              className="form-control fst-italic"
              value={inputData.email}
              role="email"
              onChange={(e) => setInputData({ ...inputData, email: e.target.value })}
            />
          </div>
          
         
          <div>
            <label htmlFor="age" className="fst-italic">age</label>
            <input
              style={{ fontSize: "15px" ,background:"none"}}
              type="number"
              name="Age"
              className="form-control fst-italic"
              value={inputData.age}
              role="age"
              onChange={(e) => setInputData({ ...inputData, age : e.target.value })}
            />
          </div>
          <div>
            <label className="fst-italic">Select Speciality Record:</label>
            <select
            style={{ fontSize: "15px" ,background:"none"}}
              onChange={(e) => setSelectedPayrollId(e.target.value)}
              className="form-control fst-italic"
              value={selectedPayrollId}
            >
              <option value="">Select a record</option>
              {payrolls.map((record) => (
                <option key={record.masterID} value={record.masterID}>
                  {record.specialist} 
                </option>
              ))}
            </select>
          </div>
          <br />
          <button className="button" type="submit" name="btnm">Submit</button>
        </form>
      </div>
    </div>
  );



}

export default AddUser;