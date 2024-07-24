import React from 'react'
import axios from "axios";
import { useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "../Styles.css";
import { useState } from 'react';
import Form from 'react-bootstrap/Form';

function AddBlood() {

    const [inputData, setInputData] = useState({
            bloodGroup: "",
            status: ""
      });

    const naviget = useNavigate();
    
      let handleSubmit = (e) => {
        e.preventDefault();
        let result = true;
        // setSubmitting(true);
    
        if (result === true) {
          axios
            .post("http://localhost:8080/bloodBank", inputData)
            .then((res) => {
                alert("Ticket added Successfully");
              console.log(res.data);
              console.log(inputData);
              naviget(`/viewBloods`);
            })
            .catch((err) => console.log(err));
        } else {
          alert("Please Enter the Valid Inputs!!!");
        }
      };

  return (
    <div
        id="add2"
        className="d-flex w-100 vh-100 justify-content-center align-items-center"
        >
        <div className="card w-50 p-5">
            <form onSubmit={handleSubmit}>
            <h1 className="text-center mb-4">Add Blood Request</h1>

            {[
                { label: "Blood Group", name: "bloodGroup", type: "select", options: ["O+", "O-", "A+", "A-","B+", "B-","AB+", "AB-"] },
                { label: "Status", name: "status", type: "select", options: ["Available", "Not Available"] },
            ].map(({ label, name, type, options }) => (
                <div className="mb-3" key={name}>
                <label htmlFor={name} className="form-label">
                    {label}:
                </label>
                {type === "select" ? (
                    <select
                    name={name}
                    className="form-select"
                    onChange={(e) =>
                        setInputData({ ...inputData, [name]: e.target.value })
                    }
                    >
                    <option value="">{label}</option>
                    {options.map((option) => (
                        <option key={option} value={option}>
                        {option}
                        </option>
                    ))}
                    </select>
                ) : (
                    <input
                    type={type}
                    name={name}
                    className="form-control"
                    onChange={(e) =>
                        setInputData({ ...inputData, [name]: e.target.value })
                    }
                    />
                )}
                </div>
            ))}
            <button className="btn btn-info w-100">Submit</button>
            </form>
        </div>
        </div>
  )
}

export default AddBlood
