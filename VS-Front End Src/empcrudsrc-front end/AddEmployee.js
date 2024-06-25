import axios from "axios";
import React from "react";
import { useState } from "react";
import { useEffect} from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddEmployee() {
  const [records, setRecords] = useState([]);
 
  
 
  const [inputData, setInputData] = useState({
    id:"-1",
    name: "",
    age: "",
    desig: "",
    dept: "",
    payroll:
    {
      pid:"",
      hre: "",
      ta: "",
      bp: "",
      pf: "",
      ctc: ""
    }
  });

  useEffect(() => {
    loadData();
  }, []);

  const loadData = async () => {
    await axios.get("http://localhost:2456/payroll/idlist")
      .then((res) => {
        console.log(res.data);
        setRecords(res.data);
        return res.data;
      })
      .catch((err) => console.error(err));
  };
 
  let handleChange = (e) => {
    if (e.target.name === "pid") {
        console.log(e.target.value);
        setInputData({ ...inputData, payroll: { pid: e.target.value } });
        axios.get("http://localhost:2456/payroll/"+e.target.value)
        .then((res)=>{
            console.log(res.data);
            setInputData({ ...inputData, payroll: res.data });
            // setInputData({ ...inputData, payroll: { da: res.data.da } });
            // setInputData({ ...inputData, payroll: { basic: res.data.basic } });
            // setData(res.data);
            return res.data;
        })
        .catch((err) => console.error(err));
    }; 
  }

  
  const naviget = useNavigate();
 
  let handleSubmit = (e) => {
    e.preventDefault();
    // let result = validateValues(inputData);
    // setSubmitting(true);
 
    // if (result === true) {
      axios
        .post("http://localhost:2456/employee", inputData)
        .then((res) => {
          console.log(inputData);
          alert("Data added Successfully");
          naviget("/viewemployee");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
  //   } else {
  //     alert("Please Enter the Valid Inputs!!!");
  //   }
  };


  // const validateValues = (inputData) => {
  //   if (inputData.name.length === 0) {
  //     alert("Please enter Employee Name !!! ");
  //     return false;
  //   } else if (inputData.age.length === 0) {
  //     alert("Please enter Age !!!");
  //     return false;
  //   } else if (inputData.desig.length === 0) {
  //     alert("Please enter Designation !!!");
  //     return false;
  //   } else if (inputData.dept.length === 0) {
  //     alert("Please enter Department !!!");
  //     return false;
  //   } 
  //     else {
  //     return true;
  //   }
  // };

  return (
    <div id="body">

    <div
      id="add2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center "
    >
      <div className="w-50 border p-5 rounded" id="addemp">
        <form onSubmit={handleSubmit}>
          <h1>ADD EMPLOYEE DATA</h1>
          <div>
            <lable htmlFor="name">Name :</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, name: e.target.value})
              }
            />
          </div>

          <div>
            <lable htmlFor="age">Age :</lable>
            <input
              type="text"
              name="age"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, age: e.target.value})
              }
            />
          </div>

          <div>
            <lable htmlFor="desig">Designation :</lable>
            <input
              type="text"
              name="desig"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, desig: e.target.value})
              }
            />
          </div>

          <div>
            <lable htmlFor="dept">Department :</lable>
            <input
              type="text"
              name="dept"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, dept: e.target.value})
              }
            />
          </div>
    
          <div>
          <label htmlFor="pid">Payroll Id</label>
          
                  <select
                    class="form-select"
                    required="required"
                    name="pid"
                    title="Select ID "
                    onChange={handleChange}
                  >
                    <option name="pid" selected="selected">
                      Select ID
                    </option>
                    {records.map((items) => (
                      <option value={items} key={items}>
                        {items}
                      </option>
                    ))}
                  </select>
            </div>

          <br />
          
          <button className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
    </div>
  );
}


export default AddEmployee;
