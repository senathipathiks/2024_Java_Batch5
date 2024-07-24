import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import Navbar2 from "../Navbar2";

function RestAdd() {
  const [inputData, setInputData] = useState({
    name: "",
    ratings: "",
    phnum: "",
  });

  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (validateValues(inputData)) {
      try {
        await axios.post("http://localhost:1244/restaurant", inputData);
        alert("Data added successfully");
        navigate("/Restaurant");
      } catch (err) {
        console.error("Error adding restaurant data:", err);
      }
    } else {
      alert("Please enter valid inputs!");
    }
  };

  const validateValues = (inputData) => {
    if (inputData.name.length === 0) {
      alert("Please enter valid Name !!! ");
      return false;
    } else if (inputData.ratings.length === 0) {
      alert("Please enter valid Ratings !!!");
      return false;
    } else if (inputData.phnum.length === 0) {
      alert("Please Enter the Valid Phone Number !!!");
      return false;
    } else {
      return true;
    }
  };

  return (
    <>
      <Navbar2/>
      <div
        id="add"
        className="d-flex w-100 vh-100 justify-content-center align-items-center"
        style={{ backdropFilter: 'blur(5px)', backgroundColor: '#f9f9f9' }}
      >
        <div className="w-50 border bg-dark p-5" style={{ animation: 'fadeIn 0.5s', border: '4px solid black', borderRadius: '30px' }}>
          <form onSubmit={handleSubmit}>
            <h1 style={{ marginBottom: '20px', color: '#fff' }}>ADD Restaurant DATA</h1>

            <div className="mb-3">
            <label htmlFor="name"  className="form-label" style={{ marginRight: '40px', color: '#fff' }}>
              Name:
            </label>
            <input
              type="text"
              name="name"
              className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              onChange={(e) => setInputData({ ...inputData, name: e.target.value })}
              required
            />
          </div>

          <div className="mb-3">
            <label htmlFor="ratings" className="form-label" style={{ marginRight: '30px', color: '#fff' }}>
              Ratings:
            </label>
            <input
              type="number"
              name="ratings"
             className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              onChange={(e) => setInputData({ ...inputData, ratings: e.target.value })}
              required
            />
          </div>

          <div className="mb-6">
            <label htmlFor="phnum" className="form-label" style={{ color: '#fff' }}>
              Phone Number:
            </label>
            <input
              type="text"
              name="phnum"
              className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              onChange={(e) => setInputData({ ...inputData, phnum: e.target.value })}
              required
            />
          </div>

         

            <button type="submit"  className="w-full bg-indigo-500 text-white p-3 rounded-md font-semibold hover:bg-indigo-600 transition duration-300" style={{ fontSize: '16px', padding: '10px 20px' }}>
              Submit
            </button>

            
          </form>
        </div>
      </div>
    </>
  );
}

export default RestAdd;


