import React from 'react'
import axios from 'axios'
import { useState } from "react";
import { useNavigate } from "react-router-dom";
function AddS() {
    const [inputData, setInputData] = useState({
        Name: "",
        Mobile: "",
        City: "",
      });
      const naviget = useNavigate();

      let handleSubmit = (e) => {
        e.preventDefault();
        let result = validateValues(inputData);
        // setSubmitting(true);
    
        if (result === true) {
          axios
            .post("http://localhost:5001/stocks", inputData)
            .then((res) => {
              alert("Data added Successfully");
              naviget("/");
              console.log(res.data);
            })
            .catch((err) => console.log(err));
        } else {
          alert("Please Enter the Valid Inputs!!!");
        }
      };
      const validateValues = (inputData) => {
        if (inputData.SName.length === 0) {
          alert("Please enter stock name !!! ");
          return false;
        } else if (inputData.Quan.length ===0) {
          alert(" enter Initial Qunatity provided  !");
          return false;
        } else if (inputData.Sdate.length === 0) {
          alert("Please enter Stocked date!");
          return false;
        } else if (inputData.RQuan.length === 0) {
          alert("Please Enter Remaining Quantity !");
          return false;
        } else {
          return true;
        }
      };
    
  return (
    <div
    id="add2"
    className="d-flex w-100 vh-100 justify-content-center align-items-center "
  >
    <div className="w-50 border bg-light p-5">
      <form onSubmit={handleSubmit}>
        <h2 id="align">Add STOCK's Data</h2>
        <div>
          <lable htmlFor="name">Stock Name</lable>
          <input
            type="text"
            name="name"
            className="form-control"
            placeholder="Enter Name"
            onChange={(e) =>
              setInputData({ ...inputData, SName: e.target.value })
            }
          />
        </div>
        <div>
          <lable htmlFor="Quantity">Quan :</lable>
          <input
            type="number"
            name="number"
            className="form-control"
            placeholder="Enter Initial Quantity "
            onChange={(e) =>
              setInputData({ ...inputData, Quan: e.target.value })
            }
          />
        </div>

        <div>
          <lable htmlFor="Sdate"> Stocked Date</lable>
          <input
            type="date"
            name="date"
            className="form-control"
            placeholder="Enter stocked date"
            onChange={(e) =>
              setInputData({ ...inputData, Sdate: e.target.value })
            }
          />
        </div>

        <div>
          <lable htmlFor="Provider">Provider Name :</lable>
          <input
            type="text"
            name="provider"
            className="form-control"
            placeholder="Enter stock provider"
            onChange={(e) =>
              setInputData({ ...inputData, Provider: e.target.value })
            }
          />
        </div>
        <div>
          <lable htmlFor="qualification"> Remaining stock Quantity</lable>
          <input
            type="number"
            name="number"
            className="form-control"
            placeholder="Enter remianing quantity in Litres/Grams/kgs"
            onChange={(e) =>
              setInputData({ ...inputData, RQuan: e.target.value })
            }
          />
        </div>
        <br />

        <button id="value" className="btn btn-info ">Submit</button>
      </form>

      
    </div>
  </div>
  );
}

export default AddS
