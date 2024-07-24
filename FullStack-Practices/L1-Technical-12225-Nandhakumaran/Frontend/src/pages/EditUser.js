import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";
import Navbar from "../components/Navbar";

function EditUser() {
  const { id } = useParams();
  const [selectedId, setSelectedId] = useState('');
  const [inputData, setInputData] = useState([]);
  const naviget = useNavigate();
  

  useEffect(() => {
    axios
      .get("http://localhost:4444/user/"+id)
      .then((response) => setInputData(response.data))
      .catch((err) => console.log(err));
  }, []);


  const handleSubmit = (e) => {
    e.preventDefault();
    // const result = validateValues(inputData);

    // if (result) {
      console.log(inputData);
      
      axios
        .post("http://localhost:4444/user", inputData)
        .then((res) => {
          alert("Data Updated Successfully");
          naviget("/"); // Navigate to home page
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    // } else {
    //   alert("Please Enter Valid Inputs!!!");
    // }
  };

//   const validateValues = (inputData) => {
//     if (inputData.name.length === 0) {
//       alert("Please enter Employee Name !!! ");
//       return false;
//     } else if (inputData.department.length === 0) {
//       alert("Please enter Employee Department !!!");
//       return false;
//     } else if (inputData.designation.length === 0) {
//       alert("Please enter Employee Designation !!!");
//       return false;
//     } else {
//       return true;
//     }
//   };


  return (
    <div>
      <Navbar />
      
    <div
      id="edit2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center"
      style={{ backdropFilter: 'blur(5px)', backgroundColor: '#f9f9f9', padding: '20px' }}
    >
      <div className="w-50 border bg-dark p-5 mt-5" style={{ animation: 'fadeIn 0.5s',  border: '4px solid black', borderRadius: '30px' }}>
        <form onSubmit={handleSubmit}>
          <h1 style={{ marginBottom: '20px', color: '#fff', fontFamily: 'Arial, sans-serif' }}>
            UPDATE USER DATA
          </h1>
          <div className="mb-3">
            <label htmlFor="id"> Order ID:</label>
            <input
              type="number"
              disabled
              name="id"
              className="form-control"
              value={inputData.id}
              onChange={(e) => setInputData({ ...inputData, id: e.target.value })}
            />
          </div>
          <div className="mb-3">
              <label htmlFor="basicSalary" className="form-label">
                Name
              </label>
              <input
                type="text"
                name="name"
                className="form-control"
                value={inputData.name}
                onChange={(e) =>
                  setInputData({ ...inputData, name: e.target.value })
                }
                required
              />
            </div>
            <div className="mb-3">
              <label htmlFor="hra" className="form-label">
                Email ID
              </label>
              <input
                type="email"
                name="emailid"
                className="form-control"
                value={inputData.emailid}
                onChange={(e) =>
                  setInputData({ ...inputData, emailid: e.target.value })
                }
                required
              />
            </div>
            <div className="mb-3">
              <label htmlFor="ta" className="form-label">
                Address
              </label>
              <input
                type="text"
                name="address"
                className="form-control"
                value={inputData.address}
                onChange={(e) =>
                  setInputData({ ...inputData, address: e.target.value })
                }
                required
              />
            </div>
            <div className="mb-3">
              <label htmlFor="ma" className="form-label">
                Phone Number
              </label>
              <input
                type="tel"
                name="phoneNumber"
                className="form-control"
                value={inputData.phoneNumber}
                onChange={(e) =>
                  setInputData({ ...inputData, phoneNumber: e.target.value })
                }
                required
              />
            </div>
         
          <button className="btn btn-info" style={{ fontSize: '16px', padding: '10px 20px' }}>
            Update
          </button>
        </form>
      </div>
    </div>
  

    </div>
  );
}

export default EditUser;
