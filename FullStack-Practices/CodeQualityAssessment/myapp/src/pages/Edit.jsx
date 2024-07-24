import axios from "axios";
import React, { useState, useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import Navbar2 from "../components/Navbar2";

function Edit() {
  const { id } = useParams();
  const navigate = useNavigate();

  const [inputData, setInputData] = useState({
    requestId: "",
    user: {
      id: "",
      name: "",
      emailid: "",
      address: "",
      phoneNumber: "",
      donation: "",
      status: ""
    }
  });

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get(`http://localhost:1010/request/${id}`);
        const { requestId, user } = response.data;
        setInputData({
          requestId,
          user: {
            id: user.id,
            name: user.name,
            emailid: user.emailid,
            address: user.address,
            phoneNumber: user.phoneNumber,
            donation: user.donation,
            status: user.status
          }
        });
      } catch (err) {
        console.error(err);
        alert("Failed to fetch data");
      }
    };

    fetchData();
  }, [id]);

  const handleChange = (event) => {
    const { name, value } = event.target;
    if (name === "status") {
      setInputData({
        ...inputData,
        user: {
          ...inputData.user,
          [name]: value
        }
      });
    } else {
      setInputData({
        ...inputData,
        user: {
          ...inputData.user,
          [name]: value
        }
      });
    }
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.put(`http://localhost:1010/request/${id}`, inputData);
      alert("Data Updated Successfully");
      navigate("/main");
    } catch (err) {
      console.error(err);
      alert("Failed to update data");
    }
  };

  return (
    <>
      <Navbar2 />
      <div
        id="edit"
        className="d-flex w-100 vh-100 justify-content-center align-items-center"
        style={{ backdropFilter: 'blur(5px)', backgroundColor: '#f9f9f9' }}
      >
        <div className="w-50 border bg-dark p-5" style={{ animation: 'fadeIn 0.5s', border: '4px solid black', borderRadius: '30px' }}>
          <form onSubmit={handleSubmit}>
            <h1 style={{ marginBottom: '20px', color: '#fff', fontFamily: 'Arial, sans-serif' }} role="heading">
              UPDATE STATUS
            </h1>

            <div className="mb-3">
              <label htmlFor="requestId" role="requestlabel"> Request ID:</label>
              <input
                type="number"
                disabled
                name="requestId"
                className="form-control"
                role="request"
                value={inputData.requestId}
                onChange={(e) => setInputData({ ...inputData, requestId: e.target.value })}
              />
            </div>

            <div className="mb-3">
              <label htmlFor="userId" role="useridlabel"> User ID:</label>
              <input
                id="userId"
                name="id"
                className="form-control"
                role="userid"
                value={inputData.user.id}
                disabled
              />
            </div>

            <div className="mb-3">
              <label htmlFor="name" className="form-label" role="namelabel">
                Name
              </label>
              <input
                type="text"
                name="name"
                className="form-control"
                role="name"
                value={inputData.user.name}
                onChange={handleChange}
                disabled
              />
            </div>

            <div className="mb-3">
              <label htmlFor="emailid" className="form-label" role="emaillabel">
                Email ID
              </label>
              <input
                type="email"
                name="emailid"
                className="form-control"
                role="email"
                value={inputData.user.emailid}
                onChange={handleChange}
                disabled
              />
            </div>

            <div className="mb-3">
              <label htmlFor="address" className="form-label" role="addresslabel">
                Address
              </label>
              <input
                type="text"
                name="address"
                className="form-control"
                role="address"
                value={inputData.user.address}
                onChange={handleChange}
                disabled
              />
            </div>

            <div className="mb-3">
              <label htmlFor="phoneNumber" className="form-label" role="phnlabel">
                Phone Number
              </label>
              <input
                type="tel"
                name="phoneNumber"
                className="form-control"
                role="phn"
                value={inputData.user.phoneNumber}
                onChange={handleChange}
                disabled
              />
            </div>

            <div className="mb-3">
              <label htmlFor="donation" className="form-label" role="donationlabel">
                Donation
              </label>
              <input
                type="text"
                name="donation"
                className="form-control"
                role="donation"
                value={inputData.user.donation}
                onChange={handleChange}
                disabled
              />
            </div>

            <div className="mb-3">
              <label htmlFor="status" className="form-label" role="statuslabel">
                Status
              </label>
              <input
                id="status"
                name="status"
                className="form-control"
                role="status"
                value={inputData.user.status}
                onChange={handleChange}
                required
              />
            </div>

            <button type="submit" className="btn btn-info" style={{ fontSize: '16px', padding: '10px 20px' }}>
              Update Status
            </button>
          </form>
        </div>
      </div>
    </>
  );
}

export default Edit;
