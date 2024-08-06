import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddBoutique() {
  const [inputData, setInputData] = useState({
    boutiqueName : '',
    email : '',
    address : '',
    description : ''
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:4444/boutique", inputData)
        .then((res) => {
          alert("Boutique Data added Successfully !!!");
          naviget("/viewboutique");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Inputs!!!");
    }
  };


  const validateValues = (inputData) => {
    if (inputData.boutiqueName.length === 0) {
      alert("Please enter boutiqueName !!! ");
      return false;
    } else if (inputData.email.length === 0) {
      alert("Please enter email !!!");
      return false;
    } else if (inputData.address.length === 0) {
      alert("Please enter address !!!");
      return false;
    } else if (inputData.description.length === 0) {
      alert("Please enter description !!!");
      return false;
    } 
      else {
      return true;
    }
  };

  return (
    <div id="body">

    <div
      id="add2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center "
    >

      <div className="w-50 border p-5 rounded" id="addemp"> 
        <form onSubmit={handleSubmit}>
          <h1>ADD BOUTIQUE DATA</h1>
          <div>
            <label htmlFor="boutiqueName">Boutique Name :</label>
            <input
              type="text"
              name="boutiqueName"
              role="boutiquename"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, boutiqueName: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="email">Email :</label>
            <input
              type="text"
              name="email"
              role="boutiqueemail"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, email: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="address">Address :</label>
            <input
              type="text"
              name="address"
              role="address"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, address: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="description">Description :</label>
            <input
              type="text"
              name="description"
              role="description"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, description: e.target.value })
              }
            />
          </div>
          
          <br />

          <button className="btn btn-info " role="button">Submit</button>
        </form>

        
      </div>
    </div>
    </div>
  );
}

export default AddBoutique;
