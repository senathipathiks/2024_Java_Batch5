import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import Navbar1 from "../components/Navbar1";

function AddUser() {
  const [inputData, setInputData] = useState({
    name: "",
    emailid: "",
    address: "",
    phoneNumber: "",
    donation:"",
    status: ""
  });

  const navigete = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    
    axios
      .post("http://localhost:1010/user", inputData)
      .then((res) => {
        alert("Data Added Successfully");
        navigete("/usermain"); 
        console.log(res.data);
      })
      .catch((err) => {
        console.log(err);
        alert("Failed to add data. Please try again.");
      });
  };

  return (
    <>
      <Navbar1 />
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
            <h1 style={{ marginBottom: "20px", color: "#fff" }} role="heading">
              DONATE
            </h1>
            <div className="mb-3">
              <label htmlFor="basicSalary" className="form-label" role="unamelabel" style={{ marginBottom: "20px", color: "#fff" }}>
                Name
              </label>
              <input
                type="text"
                name="name"
                className="form-control"
                role="uname"
                value={inputData.name}
                onChange={(e) =>
                  setInputData({ ...inputData, name: e.target.value })
                }
                required
              />
            </div>
            <div className="mb-3" style={{ marginBottom: "20px", color: "#fff" }}>
              <label htmlFor="hra" className="form-label" role="emaillabel">
                Email ID
              </label>
              <input
                type="email"
                name="emailid"
                className="form-control"
                role="email"
                value={inputData.emailid}
                onChange={(e) =>
                  setInputData({ ...inputData, emailid: e.target.value })
                }
                required
              />
            </div>
            <div className="mb-3" style={{ marginBottom: "20px", color: "#fff" }}>
              <label htmlFor="ta" className="form-label" role="addresslabel">
                Address
              </label>
              <input
                type="text"
                name="address"
                className="form-control"
                role="address"
                value={inputData.address}
                onChange={(e) =>
                  setInputData({ ...inputData, address: e.target.value })
                }
                required
              />
            </div>
            <div className="mb-3" style={{ marginBottom: "20px", color: "#fff" }}>
              <label htmlFor="ma" className="form-label" role="phnlabel">
                Phone Number
              </label>
              <input
                type="tel"
                name="phoneNumber"
                className="form-control"
                role="phn"
                value={inputData.phoneNumber}
                onChange={(e) =>
                  setInputData({ ...inputData, phoneNumber: e.target.value })
                }
                required
              />
            </div>

            <div className="mb-3" style={{ marginBottom: "20px", color: "#fff" }}>
              <label htmlFor="ma" className="form-label" role="donationlabel">
                Donation
              </label>
              <input
                type="text"
                name="donation"
                className="form-control"
                role="donation"
                value={inputData.donation}
                onChange={(e) =>
                  setInputData({ ...inputData, donation: e.target.value })
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
