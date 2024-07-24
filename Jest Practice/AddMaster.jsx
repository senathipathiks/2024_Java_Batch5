import axios from "axios";
import React, { useState } from "react";
import "./AddMaster.css";

function AddMaster() {
  const [inputData, setInputData] = useState({
    masterID: "",
    name: "",
    specialist: "",
    availability: "",
    city: ""
  });

 

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);

    if (result === true) {
      

      axios
       .post("http://localhost:7727/mast", inputData)
       .then((res) => {
          alert("Data added Successfully");
          window.location.href="/AppRoute";
          console.log(res.data);
        })
       .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Inputs!!!");
    }
  };

  const validateValues = (inputData) => {
    if (inputData.name.length === 0) {
      alert("Please enter  Name!!! ");
      return false;
    } else if (inputData.specialist.length === 0) {
      alert("Please enter specialist!!!");
      return false;
    } else if (inputData.availability.length === 0) {
      alert("Please Enter the availability!!!");
      return false;
    } else if (inputData.city.length === 0) {
      alert("Please Enter the city!!!");
      return false;
    } else {
      return true;
    }
  };

  return (
    <div
      id="add2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center "
      style={{ fontSize: "15px" }}
    >
      <div className="w-50 border  p-5" id="addblur"style={{color:"white"}}>
        <form onSubmit={handleSubmit}>
          <h1 className="fst-italic" title="heading">ADD TRAINERS DATA</h1>
          <div>
            <label htmlFor="name"  className="fst-italic ">name</label>
            <input
              style={{ fontSize: "15px",background:"none" }}
              type="text"
              name="name"
              className="form-control"
              role="master-name"
              onChange={(e) =>
                setInputData({...inputData, name: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="specialist"  className="fst-italic ">specialist :</label>
            <input
              style={{ fontSize: "15px",background:"none" }}
              type="text"
              name="specialist"
              className="form-control"
              role="special"
              onChange={(e) =>
                setInputData({...inputData, specialist: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="availability"  className="fst-italic ">availability :</label>
            <input
              style={{ fontSize: "15px" ,background:"none"}}
              type="text"
              name="availability"
              className="form-control"
              role="available"
              onChange={(e) =>
                setInputData({...inputData, availability: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="city"  className="fst-italic ">city</label>
            <input
              style={{ fontSize: "15px",background:"none" }}
              type="text"
              name="city"
              className="form-control"
              role="cityname"
              onChange={(e) =>
                setInputData({...inputData, city: e.target.value })
              }
            />
          </div>
          
         
          <br />

          <button className="button " name="btnk">Submit</button>
        </form>
      </div>
    </div>
  );
}

export default AddMaster;