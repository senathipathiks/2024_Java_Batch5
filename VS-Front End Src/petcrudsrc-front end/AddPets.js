import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddPets() {
  const [inputData, setInputData] = useState({
    ppname : '',
    pptype : '',
    pgender : '',
    page : '',
    pstockLeft : '',
    price : '',

  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:3333/pets", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/viewpets");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Inputs!!!");
    }
  };


  const validateValues = (inputData) => {
    if (inputData.ppname.length === 0) {
      alert("Please enter ppname !!! ");
      return false;
    } else if (inputData.pptype.length === 0) {
      alert("Please enter pptype !!!");
      return false;
    } else if (inputData.pgender.length === 0) {
      alert("Please enter pgender !!!");
      return false;
    } else if (inputData.pbreed.length === 0) {
      alert("Please enter pbreed !!!");
      return false;
    } 
    else if (inputData.page.length === 0) {
      alert("Please enter page !!!");
      return false;
    } 
    else if (inputData.pstockLeft.length === 0) {
      alert("Please enter pstockLeft !!!");
      return false;
    }
    else if (inputData.price.length === 0) {
      alert("Please enter price !!!");
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
          <h1>ADD PETS DATA</h1>
          <div>
            <lable htmlFor="ppname">Pet Prod Name :</lable>
            <input
              type="text"
              name="ppname"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, ppname: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pptype">Pet Prod Type :</lable>
            <input
              type="text"
              name="pptype"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, pptype: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pgender">Pet Gender :</lable>
            <input
              type="text"
              name="pgender"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, pgender: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pbreed">Pet Breed :</lable>
            <input
              type="text"
              name="pbreed"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, pbreed: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="page">Pet Age :</lable>
 
            <input
              type="text"
              name="page"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, page: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pstockLeft">Pet Stock Left :</lable>
 
            <input
              type="text"
              name="pstockLeft"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, pstockLeft: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="price">Price :</lable>
 
            <input
              type="text"
              name="price"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, price: e.target.value })
              }
            />
          </div>

          
          <br />


          <button className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
    </div>
  );
}

export default AddPets;
