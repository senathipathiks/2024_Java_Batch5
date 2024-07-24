import React from 'react'
import axios from "axios";
import { useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "../Styles.css";
import { useState } from 'react';
import Form from 'react-bootstrap/Form';

function AddRequest() {

    const [inputData, setInputData] = useState({
        id: "-1",
        name: "",
        age: "",
        number: "",
        gender: "",
        blood: "",
        bank: {
            id: "",
            bloodGroup: "",
            status: ""
        }
      });

    
      const naviget = useNavigate();

      const handleChange = (e) => {
        setInputData({ ...inputData, blood: e.target.value })
        axios
          .get("http://localhost:8080/bloodBank/" + e.target.value)
          .then((response) => {
            setInputData((inputData) => ({
              ...inputData,
              bank: response.data
            }));
            console.log(response.data);
          })
          .catch((err) => {
            console.log(err);
          });
    };
    
      let handleSubmit = (e) => {
        e.preventDefault();
        let result = true;
        // setSubmitting(true);
    
        if (result === true) {
          axios
            .post("http://localhost:8080/request", inputData)
            .then((res) => {
                alert("Ticket added Successfully");
              console.log(res.data);
              console.log(inputData);
              naviget(`/viewRequests`);
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
                { label: "Name", name: "name", type: "text" },
                { label: "Age", name: "age", type: "number" },
                { label: "Number", name: "number", type: "number" },
                { label: "Gender", name: "gender", type: "select", options: ["Male", "Female"] },
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
            <div>
                <lable htmlFor="blood">Blood Group :</lable>
                <Form.Select aria-label="Default select example" onChange={handleChange}
                  >
                    <option value="Select Id">Select Id</option>
                    <option value="O+">O+</option>
                    <option value="O-">O-</option>
                    <option value="A+">A+</option>
                    <option value="A-">A-</option>
                    <option value="B+">B+</option>  
                    <option value="B-">B-</option>
                    <option value="AB+">AB+</option>
                    <option value="AB-">AB-</option>
                  </Form.Select>
              </div>
              <br />
            <button className="btn btn-info w-100">Submit</button>
            </form>
        </div>
        </div>
  )
}

export default AddRequest
