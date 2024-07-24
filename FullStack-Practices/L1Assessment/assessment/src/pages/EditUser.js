import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import Navbar from "../components/Navbar";

function EditUser() {
  const { id } = useParams();
  const [inputData, setInputData] = useState({});

  const navigate = useNavigate();

  useEffect(() => {
    axios
      .get(`http://localhost:4444/user/${id}`)
      .then((response) => setInputData(response.data))
      .catch((err) => console.log(err));
  }, [id]); // Add 'id' to dependency array



  const handleSubmit = (e) => {
    e.preventDefault();

    console.log(inputData)
    
    axios
      .put(`http://localhost:4444/user/${id}`, inputData) // Assuming endpoint supports PUT/POST for update
      .then((res) => {
        alert("Data Updated Successfully");
        navigate("/"); // Navigate to home page
        console.log(res.data);
      })
      .catch((err) => console.log(err));
  };

  return (
    <div>
      <Navbar />

      <div
        id="edit2"
        className="d-flex w-100 vh-100 justify-content-center align-items-center"
        style={{
          backdropFilter: "blur(5px)",
          backgroundColor: "#f9f9f9",
          padding: "20px",
        }}
      >
        <div
          className="w-50 border bg-dark p-5 mt-5"
          style={{
            animation: "fadeIn 0.5s",
            border: "4px solid black",
            borderRadius: "30px",
          }}
        >
          <form onSubmit={handleSubmit}>
            <h1
              style={{
                marginBottom: "20px",
                color: "#fff",
                fontFamily: "Arial, sans-serif",
              }}
            >
              UPDATE USER DATA
            </h1>
            <div className="mb-3">
              <label htmlFor="id"> User ID:</label>
              <input
                type="number"
                disabled
                name="id"
                className="form-control"
                value={inputData.id || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, id: e.target.value })
                }
              />
            </div>
            <div className="mb-3">
              <label htmlFor="name" className="form-label">
                Name
              </label>
              <input
                type="text"
                name="name"
                className="form-control"
                value={inputData.name || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, name: e.target.value })
                }
                required
              />
            </div>
            <div className="mb-3">
              <label htmlFor="emailid" className="form-label">
                Email ID
              </label>
              <input
                type="email"
                name="emailid"
                className="form-control"
                value={inputData.emailid || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, emailid: e.target.value })
                }
                required
              />
            </div>
            <div className="mb-3">
              <label htmlFor="address" className="form-label">
                Address
              </label>
              <input
                type="text"
                name="address"
                className="form-control"
                value={inputData.address || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, address: e.target.value })
                }
                required
              />
            </div>
            <div className="mb-3">
              <label htmlFor="phoneNumber" className="form-label">
                Phone Number
              </label>
              <input
                type="tel"
                name="phoneNumber"
                className="form-control"
                value={inputData.phoneNumber || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, phoneNumber: e.target.value })
                }
                required
              />
            </div>
            <div className="mb-3">
              <label htmlFor="bill" className="form-label">
                Bill
              </label>
              <input
                type="number"
                name="bill"
                readOnly
                className="form-control"
                value={inputData.bill || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, bill: e.target.value })
                }
                required
              />
            </div>

            <button
              className="btn btn-info"
              style={{ fontSize: "16px", padding: "10px 20px" }}
            >
              Update User
            </button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default EditUser;
