import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, Link } from "react-router-dom";
import Navbar2 from "../Navbar2";

function FoodAdd() {
  const [records, setRecords] = useState([]);
  const [inputData, setInputData] = useState({
    "fid": "-1",
    "foodName": "",
    "price": "",
    "quantity": "",
    "totalAmount": "",
    "restaurant": {
        "restaurantId": "",
        "name": "",
        "ratings": "",
        "phnum": ""
    }
  });

  const handleSelectChange = async (e) => {
    const rId = e.target.value;
    console.log(`Selected Restaurant ID: ${rId}`); 
    try {
      const response = await axios.get("http://localhost:1244/restaurant/"+rId);
      console.log('Restaurant data fetched:', response.data); 
      setInputData(prevState => ({
        ...prevState,
        restaurant: {
          ...prevState.restaurant,
          ...response.data,
          restaurant_id: rId
        }
      }));
    } catch (err) {
      console.error("Error fetching payroll data:", err);
    }
  };

  useEffect(() => {
    const fetchRecords = async () => {
      try {
        const response = await axios.get("http://localhost:1244/restaurant/all");
        setRecords(response.data);
      } catch (err) {
        console.error("Error fetching payroll records:", err);
      }
    };
    fetchRecords();
  }, []);

  useEffect(() => {
    console.log('Updated inputData:', inputData);
  }, [inputData]);


  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (validateValues(inputData)) {
      try {
        await axios.post("http://localhost:1244/food", inputData);
        alert("Data added successfully");
        console.log(inputData);
        navigate("/FoodView");
      } catch (err) {
        console.error("Error adding restaurant data:", err);
      }
    } else {
      alert("Please enter valid inputs!");
    }
  };

  const validateValues = (inputData) => {
    if (inputData.foodName.length === 0) {
      alert("Please enter valid Name !!! ");
      return false;
    } else if (inputData.price.length ===0) {
      alert("Please enter valid Ratings !!!");
      return false;
    } else if (inputData.quantity.length === 0) {
      alert("Please Enter the Valid Phone Number !!!");
      return false;
    } else {
      return true;
    }
  };

  return (
    <>
      <Navbar2/>
      <div
        id="add"
        className="d-flex w-100 vh-100 justify-content-center align-items-center"
        style={{ backdropFilter: 'blur(5px)', backgroundColor: '#f9f9f9' }}
      >
        <div className="w-50 border bg-dark p-5" style={{ animation: 'fadeIn 0.5s', border: '4px solid black', borderRadius: '30px' }}>
          <form onSubmit={handleSubmit}>
            <h1 style={{ marginBottom: '20px', color: '#fff' }}>ADD FOOD DATA</h1>

            <div className="mb-3">
            <lable className="form-label" htmlFor="name" style={{ marginRight: '45px', color: '#fff' }}>Food Name:</lable>
            <input type="text" name="foodName"  
 className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              onChange={(e) =>
                setInputData({ ...inputData, foodName: e.target.value })
              }
            />
          </div>

          <div className="mb-3">
            <lable className="form-label" htmlFor="rating" style={{ marginRight: '90px', color: '#fff' }}>Price :</lable>
            <input type="number" name="price"             
 className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              onChange={(e) =>
                setInputData({ ...inputData, price: e.target.value })
              }
            />
          </div>

          <div className="mb-3">
            <lable className="form-label" htmlFor="quantity" style={{ marginRight: '60px', color: '#fff' }}>Quantity :</lable>
            <input type="text" name="quantity"           
 className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              onChange={(e) =>
                setInputData({ ...inputData, quantity: e.target.value })
              }
            />
          </div>

          <div className="mb-3">
            <lable className="form-label" htmlFor="totalamount" style={{ marginRight: '20px', color: '#fff' }}>Total Amount :</lable>
            <input type="text" name="totalAmount"             
 className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              value={parseInt(inputData.price)*parseInt(inputData.quantity)}
              onBlur={(e) =>
                setInputData({ ...inputData, totalAmount: e.target.value })
              }
  
            />
          </div >

          <div className="mb-3">
            <label className="form-label" style={{ marginRight: '70px', color: '#fff' }}>Restaurant:</label>
            <select              
name="selectedId" value={inputData.restaurant.restaurantId} onChange={handleSelectChange}  className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm">
              <option value="">Select Restaurant</option>
              {records.map((d, i) => (
                <option key={i} value={d.restaurantId}>{d.restaurantId}</option>
              ))}
            </select>
          </div>

            <button type="submit" className="btn btn-info" style={{ fontSize: '16px', padding: '10px 20px' }}>
              Submit
            </button>

            <Link to="#" className="btn btn-primary" style={{ marginLeft: '10px' }}>
              Menu
            </Link>
          </form>
        </div>
      </div>
    </>
  );
}

export default FoodAdd;

