import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { useEffect } from "react";


function Add() {
  const[columns,setColumns] = useState([]);
  const[records,setRecords] = useState([]);
  const [inputData, setInputData] = useState({
    id:"-1",
    name: "",
    dept: "",
    desig: "",
    city: "",
    payroll:
    {
        id:"",
        hra:"",
        da:"",
        ta:"",
        pf:"",
        ctc:"",
    }
  });
  // useEffect(() => {
  //   axios
  //     .get("http://localhost:12209/payrolltable/all")
  //     .then((response) => {
  //       setColumns(Object.keys(response.data[0]));
  //       setRecords(response.data);
  //     })
  //     .catch((err) => {
  //       console.log(err);
  //     });
  // }, []);

  useEffect(() => {
    axios
      .get("http://localhost:12209/payrolltable/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);
 
  
  // const handleSelectChange = (e) => {
  //   const selectedRecordId = e.target.value;
  //   if (selectedRecordId) {
  //     axios
  //       .get(`http://localhost:12209/payrolltable/${selectedRecordId}`)
  //       .then((response) => {
  //         const selectedPayroll = response.data;
  //         setInputData((prevState) => ({
  //           ...prevState,
  //           payroll: {
  //             hra: selectedPayroll.hra,
  //             da: selectedPayroll.da,
  //             ta: selectedPayroll.ta,
  //             pf: selectedPayroll.pf,
  //             ctc: selectedPayroll.ctc,
  //             ctc:(selectedPayroll.hra+selectedPayroll.da+selectedPayroll.ta+selectedPayroll.pf+selectedPayroll.ctc)
  //           }
  //         }));
  //       })
  //       .catch((err) => {
  //         console.log(err);
  //       });
  //   }
  // };

  const handleSelectChange = async (e) => {
    const payrollId = e.target.value;
    console.log(`Selected Payroll ID: ${payrollId}`);
    try {
      const response = await axios.get("http://localhost:12209/payrolltable/"+payrollId);
      console.log('Payroll data fetched:', response.data);
      setInputData(prevState => ({
        ...prevState,
        payroll: {
          ...prevState.payroll,
          ...response.data,
          id: payrollId
        }
      }));
    } catch (err) {
      console.error("Error fetching payroll data:", err);
    }
  };

  useEffect(() => {
    console.log('Updated inputData:', inputData);
  }, [inputData]);

  const naviget = useNavigate();
  let handleChange = (e) => {
    if (e.target.name === "id") {
        console.log(e.target.value);
        const selectedRecordId = e.target.value;
        axios
            .get(`http://localhost:12209/payrolltable/` + selectedRecordId)
            .then((response) => {
              setInputData((inputData)=>({
                     ...inputData, payroll: response.data }));
 
                })
      };
    }
  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:12209/employee", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/view");
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
      alert("Please enter Employee Name !!! ");
      return false;
    
    } else if (inputData.dept.length === 0) {
      alert("Please enter Your Department  !!!");
      return false;
    } else if (inputData.desig.length === 0) {
      alert("Please Enter the Designation!!!");
      return false;
    } 
    else if (inputData.city.length === 0) {
      alert("Please Enter Your City!!!");
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
      <div className="w-50 border  p-5" style={{color:"white"}} id="add3">
        <form onSubmit={handleSubmit}>
          <h1 className="fst-italic">ADD EMPLOYEE DATA</h1>
          <div>
            <lable htmlFor="name" className="fst-italic">Name</lable>
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
            <lable htmlFor="dept" className="fst-italic">Department :</lable>
            <input
              type="text"
              name="dept"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, dept: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="desig" className="fst-italic">Designation :</lable>
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
            <lable htmlFor="city" className="fst-italic">City</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, city: e.target.value })
              }
            />
          </div>





          <div>
            <lable>Fetch the id :</lable>
            <select onChange={handleSelectChange} className="form-control">
              <option value="">Select a record</option>
              {records.map((record) => (
                <option key={record.id} value={record.id}>
                  {record.id}
                </option>
              ))}
            </select>          </div>





          {/* <div>
          <label htmlFor="id">Payroll Id</label>
         
                  <select
                    class="form-select"
                    required="required"
                    name="id"
                    title="Select ID "
                    onChange={handleChange}
                  >
                    <option name="id" selected="selected">
                      Select One
                    </option>
                    {records.map((items) => (
                      <option value={items} key={items}>
                        {items}
                      </option>
                    ))}
                  </select>
            </div> */}
          
         
          <br />

          <button className="btn btn-info " className="fst-italic">Submit</button>
        </form>

        
      </div>
    </div>
  );
}

export default Add;
