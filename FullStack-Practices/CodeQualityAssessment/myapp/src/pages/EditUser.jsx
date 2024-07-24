import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import Navbar1 from "../components/Navbar1";

function EditUser() {
  const { id } = useParams();
  const [inputData, setInputData] = useState({});
  const navigate = useNavigate();

  useEffect(() => {
    const fetchUserData = async () => {
      try {
        const response = await axios.get(`http://localhost:1010/user/${id}`);
        setInputData(response.data);
      } catch (err) {
        console.log(err);
      }
      
    };

    fetchUserData(); // Call the async function inside useEffect
  }, [id]);

  const handleSubmit = async (e) => {
    e.preventDefault();

    const result = validateValues(inputData);

    try {
      if(result === true){
      await axios.put(`http://localhost:1010/user/${id}`, inputData);
      alert("Data Updated Successfully");
      navigate("/usermain");
    }
    else{
      alert("Failed to update data");
    }
       // Navigate to home page after successful update
    } catch (err) {
      console.error(err);
    }
  };

  const validateValues = (inputData) => {
    if (inputData.name.length === 0) {
      alert("Please enter Valid Name!!!");
      return false;
    } else if (inputData.emailid.length === 0) {
      alert("Please enter Valid Email!!!");
      return false;
    }
    else if (inputData.address.length === 0) {
      alert("Please enter Valid Address!!!");
      return false;
    }else if (inputData.phoneNumber.length === 0) {
      alert("Please enter Valid Phone Number!!!");
      return false;
    }else if (inputData.donation.length === 0) {
      alert("Please Enter the Valid Donation Details!!!");
      return false;
    }else {
     return true;
    }
  };

  return (
    <div>
      <Navbar1 />

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
              role="heading"
            >
              UPDATE USER DATA
            </h1>
            <div className="mb-3">
              <label htmlFor="id" role="useridlabel">
                User ID:
              </label>
              <input
                type="number"
                disabled
                name="id"
                role="userid"
                className="form-control"
                value={inputData.id || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, id: e.target.value })
                }
              />
            </div>
            <div className="mb-3">
              <label htmlFor="name" className="form-label" role="namelabel">
                Name
              </label>
              <input
                type="text"
                name="name"
                role="name"
                className="form-control"
                value={inputData.name || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, name: e.target.value })
                }
                
              />
            </div>
            <div className="mb-3">
              <label
                htmlFor="emailid"
                className="form-label"
                role="emaillabel"
              >
                Email ID
              </label>
              <input
                type="email"
                name="emailid"
                role="email"
                className="form-control"
                value={inputData.emailid || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, emailid: e.target.value })
                }
                
              />
            </div>
            <div className="mb-3">
              <label
                htmlFor="address"
                className="form-label"
                role="addresslabel"
              >
                Address
              </label>
              <input
                type="text"
                name="address"
                className="form-control"
                role="address"
                value={inputData.address || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, address: e.target.value })
                }
                
              />
            </div>
            <div className="mb-3">
              <label
                htmlFor="phoneNumber"
                className="form-label"
                role="phnlabel"
              >
                Phone Number
              </label>
              <input
                type="tel"
                name="phoneNumber"
                role="phn"
                className="form-control"
                value={inputData.phoneNumber || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, phoneNumber: e.target.value })
                }
                
              />
            </div>

            <div className="mb-3">
              <label
                htmlFor="donation"
                className="form-label"
                role="donationlabel"
              >
                Donation
              </label>
              <input
                type="text"
                name="donation"
                className="form-control"
                role="donation"
                value={inputData.donation || ""}
                onChange={(e) =>
                  setInputData({ ...inputData, donation: e.target.value })
                }
                
              />
            </div>

            <button
              type="submit"
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
