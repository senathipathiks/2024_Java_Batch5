import React from 'react'
import axios from "axios"; 
import { useState} from 'react';
import {useEffect} from 'react';
import { useNavigate } from 'react-router-dom';

function Add() {
   const[inputdata, setInputdata] = useState(
    {
      
      uname: "",
      actype: "",
      payment: "",
      age: "",
      job: "",
      sal: "",
      addr: "",
      religion: "",
      sts: "",
      matchmaker: {
          mid: "",
          mname: "",
          mnum: "",
          maddr: ""
      }
  }
   );
   const [id, setId] = useState([]);
   const [data,setData] = useState([]);
   const naviget = useNavigate();

   useEffect(() => {
    axios
      .get("http://localhost:1000/match/all")
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);
  
  const handleChange = (e) => {
    setId(e.target.value);
    axios
      .get("http://localhost:1000/match/" + e.target.value)
      
      .then((response) => {
        setInputdata((inputData) => ({
          ...inputData,
          matchmaker: response.data
        }));
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
};

   
  let handleSubmit=async (e)=>{
    e.preventDefault();
    let result =validateValues(inputdata);
    
    

    // const ans = parseInt(inputdata.price) * parseInt(inputdata.nos);
    //  await axios.put(`http://localhost:1000/customer/${inputdata.cid}`, { bill: ans })

    // setInputdata((inputdata) => ({
    //   ...inputdata,
    //   customer: {
    //     bill: ans
    //   }
    // }));
    // console.log(inputdata);
    
    // axios
    // .get("http://localhost:1000/customer/"+inputdata.cid)
    // .then((response) => {
    //   setInputdata((inputData) => ({
    //     ...inputData,
    //     customer:response.data,
    //   }))});

    if(result === true){
     axios 
     .post("http://localhost:1000/user", inputdata)
     .then((res) => {
       alert("Data added Successfully");
       naviget("/landing");
       console.log(res.data);
     })
     .catch((err) => console.log(err));
    }else  {
        alert("Please Enter the Valid Inputs!!!");
      }
      

        

  }
  const validateValues = (inputdata) => {
    if (inputdata.uname.length === 0) {
      alert("Please enter Name !!! ");
      return false;
    } else if (inputdata.age< 18) {
      alert("Minimum Age is 18 !!!");
      return false;
    } else if (inputdata.addr.length === 0) {
      alert("Please enter City Name !!!");
      return false;
    } else {
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
          <h1 data-testid="heading">ADD USER DETAILS</h1>
          <div>
            <lable htmlFor="uname"> Name</lable>
            <input
              type="text"
              name="uname"
              role='name'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, uname: e.target.value })
              }
            />

          </div>
          <div>
            <lable htmlFor="actype">Account Type :</lable>
            <input
              type="text"
              name="actype"
              role='type'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, actype: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="addr">Address/City  :</lable>
            <input
              type="text"
              name="addr"
              role='city'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, addr: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="age">Age :</lable>
            <input
              type="number"
              name="age"
              role='age'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, age: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="sal">Salary :</lable>
            <input
              type="number"
              name="sal"
              role='sal'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, sal: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="job">Profession :</lable>
            <input
              type="text"
              name="job"
              role='job'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, job: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="payment">Payment :</lable>
            <input
              type="text"
              name="payment"
              role='pay'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, payment: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="religion">Religion :</lable>
            <input
              type="text"
              name="religion"
              role='religion'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, religion: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="sts">Marital Status :</lable>
            <input
              type="text"
              name="sts"
              role='sts'
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, sts: e.target.value })
              }
            />
          </div>
           
          <div>
        <label htmlFor="selectId">MatchMaker:</label>
        <select id="selectId" onChange={handleChange}>
          <option value="" data-testid="opt">Select an ID</option>
          {data.map((item) => (
            <option key={item.id} value={item.id} >
              {item.mid} 
            </option>
          ))}
        </select>
        
      </div>






          
          <br />

          <button className="btn btn-info " role='submitbutton'>Submit</button>
        </form>

        
      </div>
    </div>
  )
}

export default Add
