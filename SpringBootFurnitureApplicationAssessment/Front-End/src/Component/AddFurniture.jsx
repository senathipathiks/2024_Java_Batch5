import axios from "axios";
import React from "react";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddFurniture() {

  const [payroll, setPayroll] = useState({
      name: '',
      description: '',
      price: '',
      stock: ''
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
        
      axios
        .post("http://localhost:1225/furniture", payroll)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
  };

  return (
    <div id="body">
            <div className="container paddings">
                <div className="p-3 mb-2 bg-primary text-white">
                    <h1 className="text-center text-bg-success">ADD FURNITURE RECORD</h1>
                </div>
    <div className='bod'>
            <div className="wrapper flexCenter paddings innerWidth">
                <div id="add2" className="d-flex w-100 vh-100 justify-content-center align-items-center">
                    <div className="w-50 border bg-light">
        <form onSubmit={handleSubmit} className="formcolor">
          <label><h3 className="text-center">ADD FURNITURE DATA</h3></label>
          <div>
            <label htmlFor="pincode">NAME : </label>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setPayroll({ ...payroll, name: e.target.value })
              }
            />
          </div>
          
          <div>
            <label htmlFor="pincode">description</label>
            <input
              type="text"
              name="description"
              className="form-control"
              onChange={(e) =>
                setPayroll({ ...payroll, description: e.target.value })
              }
            />
          </div>
          <div>
            <label htmlFor="pincode">price</label>
            <input
              type="text"
              name="price"
              className="form-control"
              onChange={(e) =>
                setPayroll({ ...payroll, price: e.target.value })
              }
            />
          </div>
          <div>
            <label htmlFor="pincode">stock</label>
            <input
              type="text"
              name="stock"
              className="form-control"
              onChange={(e) =>
                setPayroll({ ...payroll, stock: e.target.value })
              }
            />
          </div>
          {/* <div>
            <label htmlFor="ctc">CTC :</label>
            <input
              type="number"
              name="ctc"
              className="form-control"
              value={parseInt(payroll.hre)+parseInt(payroll.ta)+parseInt(payroll.bp)+parseInt(payroll.pf)}
              onBlur={(e) =>
                setPayroll({ ...payroll, ctc:e.target.value })
              }
            />
          </div> */}

          <button className="btn btn-info flexCenter button mt-3 ">Submit</button>
        </form>


      </div>
    </div>
    </div>
    </div>
    </div>
    </div>
     );
}

export default AddFurniture;
