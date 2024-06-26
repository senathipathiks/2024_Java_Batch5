import axios from "axios";
import React from "react";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddPayroll() {

  const [payroll, setPayroll] = useState({
      hre: '',
      ta: '',
      bp: '',
      pf: '',
      ctc:''
  });

//   const handleChange = (e) => {
//     const { name, value } = e.target;
//     setPayroll((prevState) => ({
//       ...prevState,
//       [name]: value
//     }));
//   };
  

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    //let result = validateValues(employee);
    // setSubmitting(true);

    // if (result === true) {
        console.log("------"+payroll);
      axios
        .post("http://localhost:1224/payroll", payroll)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    // } else {
    //   alert("Please Enter the Valid Inputs!!!");
    // }
  };

  // validation Part for add user for student management system
  // const [errors, setErrors] = useState({});
  // const [submitting, setSubmitting] = useState(false);

//   const validateValues = (employee) => {
//     if (employee.name.length === 0) {
//       alert("Please enter Student Name !!! ");
//       return false;
//     } else if (employee.age <= 18) {
//       alert("Above 18 allowed !!!");
//       return false;
//     } else if (employee.desig.length === 0) {
//       alert("Please enter designation !!!");
//       return false;
//     } else if (employee.dept.length === 0) {
//       alert("Please Enter the Department!!!");
//       return false;
//     } else {
//       return true;
//     }
//   };

  return (
    <div className='bod'>
            <div className="wrapper flexCenter paddings innerWidth">
                <div id="add2" className="d-flex w-100 vh-100 justify-content-center align-items-center">
                    <div className="w-50 border bg-light">
        <form onSubmit={handleSubmit} className="formcolor">
          <label><h3 className="text-center">ADD PAYROLL DATA</h3></label>
          <div>
            <label htmlFor="pincode">payroll.hre :</label>
            <input
              type="number"
              name="hre"
              className="form-control"
              onChange={(e) =>
                setPayroll({ ...payroll, hre: e.target.value })
              }
            />
          </div>
          
          <div>
            <label htmlFor="pincode">payroll.ta :</label>
            <input
              type="number"
              name="ta"
              className="form-control"
              onChange={(e) =>
                setPayroll({ ...payroll, ta: e.target.value })
              }
            />
          </div>
          <div>
            <label htmlFor="pincode">payroll.bp :</label>
            <input
              type="number"
              name="bp"
              className="form-control"
              onChange={(e) =>
                setPayroll({ ...payroll, bp: e.target.value })
              }
            />
          </div>
          <div>
            <label htmlFor="pincode">payroll.pf :</label>
            <input
              type="number"
              name="pf"
              className="form-control"
              onChange={(e) =>
                setPayroll({ ...payroll, pf: e.target.value })
              }
            />
          </div>
          <div>
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
          </div>

          <button className="btn btn-info flexCenter button mt-3 ">Submit</button>
        </form>


      </div>
    </div>
    </div>
    </div>
     );
}

export default AddPayroll;
