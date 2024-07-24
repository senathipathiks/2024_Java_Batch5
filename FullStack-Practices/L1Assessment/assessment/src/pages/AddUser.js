import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import Navbar from "../components/Navbar";

function AddUser() {
  const [inputData, setInputData] = useState({
    name: "",
    emailid: "",
    address: "",
    phoneNumber: "",
    bill:""
  });

  const naviget = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    
    axios
      .post("http://localhost:4444/user", inputData)
      .then((res) => {
        alert("Data added Successfully");
        naviget("/"); // Navigate to home page
        console.log(res.data);
      })
      .catch((err) => {
        console.error("Error adding data:", err);
        alert("Failed to add data. Please try again.");
      });
  };

  return (
    <>
      <Navbar />
      <div
        id="add2"
        className="d-flex w-100 vh-100 justify-content-center align-items-center"
        style={{ backdropFilter: "blur(5px)", backgroundColor: "#f9f9f9" }}
      >
        <div
          className="w-50 border bg-dark p-5"
          style={{
            animation: "fadeIn 0.5s",
            border: "4px solid black",
            borderRadius: "30px"
          }}
        >
          <form onSubmit={handleSubmit}>
            <h1 style={{ marginBottom: "20px", color: "#fff" }}>
              ADD USER DATA
            </h1>
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

            <button
              type="submit"
              className="btn btn-info"
              style={{ fontSize: "16px", padding: "10px 20px" }}
            >
              Submit
            </button>
          </form>
        </div>
      </div>
    </>
  );
}

export default AddUser;
