import axios from "axios";
import React from "react";
import { useEffect,useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddEmployee() {
  const [records, setRecords] = useState([]);
  const[data,setData]=useState([])
  const [inputData, setInputData] = useState({
    name: "",
    desig: "",
    payroll:
    {
    pid:"",
    basic: "",
    hra: "",
    da: "",
    pf: "",
    ctc: ""
  }
});

useEffect(() => {
    loadData();
  }, []);

  const loadData = async () => {
    await axios.get("http://localhost:1250/payroll/pidList")
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
        // axios.get("http://localhost:1250/payroll/"+e.target.value)
        // .then((res)=>{
        //     console.log(res.data);
        //     setInputData({ ...inputData, payroll: res.data });
        //     // setInputData({ ...inputData, payroll: { da: res.data.da } });
        //     // setInputData({ ...inputData, payroll: { basic: res.data.basic } });
        //     setData(res.data);
        //     return res.data;
        // })
        // .catch((err) => console.error(err));
    }; 
  }

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:1250/employee", inputData)
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

  // validation Part for add user for student management system
  // const [errors, setErrors] = useState({});
  // const [submitting, setSubmitting] = useState(false);

  const validateValues = (inputData) => {
    if (inputData.name.length === 0) {
      alert("Enter Valid Details ");
      return false;
    } else if (inputData.desig.length==0) {
        alert("Enter Valid Details ");
      return false;
    } 
    else {
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
          <h1>ADD EMPLOYEE DATA</h1>
          <div>
            <lable htmlFor="name">Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, name: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="desig">Designation :</lable>
            <input
              type="text"
              name="desig"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, desig: e.target.value })
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

          <button className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
  );
}

export default AddEmployee;
