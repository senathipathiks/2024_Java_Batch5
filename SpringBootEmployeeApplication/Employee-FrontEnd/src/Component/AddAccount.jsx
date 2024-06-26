import axios from "axios";
import React from "react";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddAccount() {

  const [account, setAccount] = useState({
      accountno:'',
      balance:''
  });

  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:1224/employee/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    //let result = validateValues(employee);
    // setSubmitting(true);

    // if (result === true) {
        console.log(account);
      axios
        .post("http://localhost:1224/account", account)
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
    <div
      id="add2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center "
    >
      <div className="w-50 border bg-light p-5">
        <form onSubmit={handleSubmit}>
          <h3 className="text-center">ADD ACCOUNT DATA</h3>
          <div>
            <lable htmlFor="pincode">AccountNo : </lable>
            <input
              type="number"
              name="accountno"
              className="form-control"
              onChange={(e) =>
                setAccount({ ...account, accountno: e.target.value })
              }
            />
          </div>
          
          <div>
            <lable htmlFor="pincode">Balance :</lable>
            <input
              type="number"
              name="balance"
              className="form-control"
              onChange={(e) =>
                setAccount({ ...account, balance: e.target.value })
              }
            />
          </div>
          <div>
            <label>Select Employee Record:</label>
            <select className="form-control" name="id">
              <option value="" name="id" selected="selected">Select a record</option>
              {records.map((record) => (
                <option key={record.id} value={record.id}>
                  {record.id}
                </option>
              ))}
            </select>
          </div>

          <button className="btn btn-info flexCenter button mt-3 ">Submit</button>
        </form>


      </div>
    </div>
  );
}

export default AddAccount;
