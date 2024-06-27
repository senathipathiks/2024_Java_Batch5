import React from 'react'
import axios from "axios"; 
import { useState} from 'react';
import {useEffect} from 'react';
import { useNavigate } from 'react-router-dom';

function Add() {
   const[inputdata, setInputdata] = useState({
    id: -1,
    name: "",
    city: "",
    mobile: "",
    item: "",
    nos: "",
    price: "",
    customer:  {
        cid:"" ,
        uname: "",
        addr: "",
        cmobile: "",
        pt: "",
        bill: ""
    }
   });
   const [id, setId] = useState([]);
   const [data,setData] = useState([]);
   const naviget = useNavigate();

   useEffect(() => {
    axios
      .get("http://localhost:1000/customer/all")
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);
  
  const handleChange = (e) => {
    setId(e.target.value);
    axios
      .get("http://localhost:1000/customer/" + e.target.value)
      
      .then((response) => {
        setInputdata((inputData) => ({
          ...inputData,
          customer: response.data
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
     .post("http://localhost:1000/order", inputdata)
     .then((res) => {
       alert("Data added Successfully");
       naviget("/");
       console.log(res.data);
     })
     .catch((err) => console.log(err));
    }else  {
        alert("Please Enter the Valid Inputs!!!");
      }
      

        

  }
  const validateValues = (inputdata) => {
    if (inputdata.name.length === 0) {
      alert("Please enter Food/Restaurant Name !!! ");
      return false;
    } else if (inputdata.mobile.length < 5) {
      alert("Mobile Num should be Max 12 Numbers Only !!!");
      return false;
    } else if (inputdata.city.length === 0) {
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
          <h1>ADD ORDER DETAILS</h1>
          <div>
            <lable htmlFor="name">Restaurant Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, name: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="Mobile">Mobile :</lable>
            <input
              type="number"
              name="mobile"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, mobile: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">Address/City Branch :</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, city: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="desg">Food Item :</lable>
            <input
              type="text"
              name="desg"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, item: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="nos">Item Quantity :</lable>
            <input
              type="number"
              name="nos"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, nos: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="price">Item Price :</lable>
            <input
              type="number"
              name="price"
              className="form-control"
              onChange={(e) =>
                setInputdata({ ...inputdata, price: e.target.value })
              }
            />
          </div>


           
          <div>
        <label htmlFor="selectId">Ordered by  Customer ID:</label>
        <select id="selectId" onChange={handleChange}>
          <option value="" >Select an ID</option>
          {data.map((item) => (
            <option key={item.id} value={item.id}>
              {item.cid} 
            </option>
          ))}
        </select>
        
      </div>






          
          <br />

          <button className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
  )
}

export default Add
