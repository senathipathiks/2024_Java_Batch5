import React from 'react'
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from 'axios';

function Addproduct() {

    const [inputData, setInputData] = useState({
   
        prname:"",
        category:"",
        price:"",
        deliverydate:"",
        sellername:""
    
  });
 
//   const[total,setTotal]=useState(0);
//   function calculatetotal()
//   {
//     setTotal(inputData.hra+inputData.da+inputData.ta+inputData.pf);
//   }
  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:2222/producttable", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/viewproduct");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Inputs!!!");
    }
  };

 

  const validateValues = (inputData) => {
    if (inputData.prname.length === 0) {
      alert("Please enter Product Name !!! ");
      return false;
    
    } else if (inputData.category.length === 0) {
      alert("Please enter the Product category !!!");
      return false;
    } else if (inputData.price.length === 0) {
      alert("Please Enter the Total price!!!");
      return false;
    } 
    else if (inputData.deliverydate.length === 0) {
        alert("Please Enter the Delivery date!!!");
        return false;
      } 
      else if (inputData.sellername.length === 0) {
        alert("Please Enter the Seller name!!!");
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
          <h1 className="fst-italic" >ADD PRODUCT'S DETAILS</h1>
          <div>
            <lable htmlFor="prname" className="fst-italic">Product Name :</lable>
            <input
              type="text"
              name="prname"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, prname: e.target.value })
              }
            />
          </div>
          

          <div>
            <lable htmlFor="category" className="fst-italic">Category Of The Product :</lable>
            <input
              type="text"
              name="category"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, category: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="price" className="fst-italic">Price Of The Product :</lable>
            <input
              type="number"
              name="price"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, price: e.target.value })
              }
            />
          </div>
          
          <div>
            <lable htmlFor="deliverydate" className="fst-italic">Delivery Date Of The Product:</lable>
            <input
              type="number"
              name="deliverydate"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, deliverydate: e.target.value })
              }
            />
          </div>
      

          <div>
            <lable htmlFor="sellername" className="fst-italic">Seller Name :</lable>
            <input
              type="text"
              name="sellername"
              className="form-control"
            //   value={parseInt(inputData.hra)+parseInt(inputData.da)+parseInt(inputData.ta)+parseInt(inputData.pf)}
              onBlur={(e) =>
                setInputData({ ...inputData, sellername:e.target.value })
              }
            />
          </div>
         
          <br />

          <button className="btn btn-info " className="fst-italic">Submit</button>
        </form>

        
      </div>
    </div>
  );

    <div>
      
    </div>
  
}

export default Addproduct
