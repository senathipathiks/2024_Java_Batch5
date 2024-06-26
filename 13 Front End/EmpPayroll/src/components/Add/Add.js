import axios from "axios";
import React from "react";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Add.css";

function Add() {
  const [records, setRecords] = useState([]);
  const [data, setData] = useState([])
  const [inputData, setInputData] = useState({
    empname: "",
    department: "",
    roll: "",
    city: "",
    payroll:
    {
      pid: "",
      basic: "",
      hra: "",
      da: "",
      ta: "",
      pf: "",
      ctc: ""
    }

  });
  useEffect(() => {
    loadData();
  }, []);

  const loadData = async () => {
    await axios.get("http://localhost:8005/payroll/getpayrollid")
      .then((res) => {
        console.log(res.data);
        setRecords(res.data);
        return res.data;
      })
      .catch((err) => console.error(err));
  };


  const naviget = useNavigate();

  let handleChange = (e) => {
    if (e.target.name === "pid") {
      console.log(e.target.value);
      const selectedRecordId = e.target.value;
      axios
        .get(`http://localhost:8005/payroll/` + selectedRecordId)
        .then((response) => {
          setInputData((inputData) => ({
            ...inputData, payroll: response.data
          }));

        })
    };
  }

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);



    if (result === true) {
      axios
        .post("http://localhost:8005/employee", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/View");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Inputs!!!");
    }
  };

  // validation Part for add user for student management system
  // const [errors, setErrors] = useState({});
  // const [submitting, setSubmitting] = useState(false);

  const validateValues = (inputData) => {
    if (inputData.empname.length === 0) {
      alert("Please enter Employee Name !!! ");
      return false;
    } else if (inputData.department.length === 0) {
      alert("Please enter department Name !!! ");
      return false;
    } else if (inputData.city.length === 0) {
      alert("Please enter City Name !!!");
      return false;
    } else if (inputData.roll.length === 0) {
      alert("Please Enter the Valid roll!!!");
      return false;
    } else {
      return true;
    }
  };

  return (
    <div class="body">      
        <div class="cards">
        <form onSubmit={handleSubmit} >
          <h2 id="align">Add Employee's Data</h2>
          <div>
            <lable htmlFor="empname">Name</lable>
            <input
              type="text"
              name="empname"
              className="form-control"
              placeholder="Enter Name"
              onChange={(e) =>
                setInputData({ ...inputData, empname: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="department">Department :</lable>
            <input
              type="text"
              name="department"
              className="form-control"
              placeholder="Enter department"
              onChange={(e) =>
                setInputData({ ...inputData, department: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="roll">Roll :</lable>
            <input
              type="text"
              name="roll"
              className="form-control"
              placeholder="Enter roll"
              onChange={(e) =>
                setInputData({ ...inputData, roll: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">City :</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              placeholder="Enter City"
              onChange={(e) =>
                setInputData({ ...inputData, city: e.target.value })
              }
            />
          </div>


          <br />
          <div>
            <label htmlFor="pid">Payroll Id :</label>

            <select
              class="form-select select"
              required="required"
              name="pid"
              title="Select ID "
              onChange={handleChange}
            >
              <option name="pid" selected="selected">
                Select One
              </option>
              {records.map((items) => (
                <option value={items} key={items}>
                  {items}
                </option>
              ))}
            </select>
          </div>
          <br />
          <center><button className="btn btn-primary">Submit</button></center>
        </form>
      </div>
    </div>
  );
}

export default Add;