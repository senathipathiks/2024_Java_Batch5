import React from 'react'
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { useEffect } from "react";
import axios from "axios";


function Addshop() {
    const[columns,setColumns] = useState([]);
  const[records,setRecords] = useState([]);
  const [inputData, setInputData] = useState({
    id:"-1",
    prname: "",
    available: "",
    userrating: "",
    product:
    {
        id:"",
        pname:"",
        category:"",
        price:"",
        deliverydate:"",
        sellername:"",
    }
  });

  useEffect(() => {
    axios
      .get("http://localhost:2222/producttable/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);


  const handleSelectChange = async (e) => {
    const productId = e.target.value;
    console.log(`Selected Product ID: ${productId}`);
    try {
      const response = await axios.get("http://localhost:2222/producttable/"+productId);
      console.log('Product data fetched:', response.data);
      setInputData(prevState => ({
        ...prevState,
        product: {
          ...prevState.product,
          ...response.data,
          id: productId
        }
      }));
    } catch (err) {
      console.error("Error fetching product data:", err);
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
            .get(`http://localhost:2222/producttable/` + selectedRecordId)
            .then((response) => {
              setInputData((inputData)=>({
                     ...inputData, product: response.data }));
 
                })
      };
    }
  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:2222/shop", inputData)
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

  const validateValues = (inputData) => {
    if (inputData.prname.length === 0) {
      alert("Please enter Product Name !!! ");
      return false;
    
    } else if (inputData.available.length === 0) {
      alert("Please enter Your Available stocks  !!!");
      return false;
    } else if (inputData.userrating.length === 0) {
      alert("Please Enter the UserRating!!!");
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
          <h1 className="fst-italic">ADD SHOP DETAILS</h1>
          <div>
            <lable htmlFor="prname" className="fst-italic">Product Name</lable>
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
            <lable htmlFor="available" className="fst-italic">Available Stocks  :</lable>
            <input
              type="number"
              name="available"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, available: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="userrating" className="fst-italic">User Rating for 10:</lable>
            <input
              type="number"
              name="userrating"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, userrating: e.target.value })
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
            </select>         
             </div>

             <br />

            <button className="btn btn-info " className="fst-italic">Submit</button>
            </form>
    </div>
    </div>
  )
}

export default Addshop
