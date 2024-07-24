import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import Navbar2 from "../Navbar2";

function FoodEdit() {
  const { fid } = useParams();
  const [data, setData] = useState({});
  const navigate = useNavigate();

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get("http://localhost:1244/food/" + fid);
        setData(response.data);
        console.log(setData);
      } catch (error) {
        console.error("Error fetching food data:", error);
      }
    };
    fetchData();
  }, [fid]);

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.put("http://localhost:1244/food", data);
      alert("Food Updated Successfully");
      navigate("/FoodView");
    } catch (error) {
      console.error("Error updating Food data:", error);
    }
  };

  return (
    <><Navbar2/>
   
      <div id="edit"  className="w-80 bg-white w-100 vh-100 d-flex justify-content-center align-items-center rounded-lg shadow-lg p-8"
        style={{ backdropFilter: 'blur(5px)', backgroundColor: '#f9f9f9' }}>

          <div className="w-50 border bg-dark p-5" style={{ animation: 'fadeIn 0.5s', border: '4px solid black', borderRadius: '30px' }}>
        <form onSubmit={handleSubmit} >
          <h1 className="text-3xl text-center font-semibold mb-8" style={{ marginBottom: '20px', color: '#fff' }}>UPDATE FOOD DATA</h1>
          <div className="mb-3">
            <label className="block text-sm font-medium text-gray-700" htmlFor="restaurant_id" style={{ marginBottom: '10px', color: '#fff' }}>
              ID:
            </label>
            <input
              type="text"
              disabled
                 className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              id="fid"
              value={data.fid}
              onChange={(e) => setData({ ...data, fid: e.target.value })}
            />
          </div>

          <div className="mb-3">
            <label htmlFor="name" className="block text-sm font-medium text-gray-700" style={{ marginBottom: '10px', color: '#fff' }}>
              Food Name:
            </label>
            <input
              type="text"
                 className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              id="foodname"
              value={data.foodName}
              onChange={(e) => setData({ ...data, foodName: e.target.value })}
            />
          </div>

          <div className="mb-3">
            <label htmlFor="ratings" className="block text-sm font-medium text-gray-700" style={{ marginBottom: '10px', color: '#fff' }}>
              Price:
            </label>
            <input
              type="number"
                 className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              id="price"
              value={data.price}
              onChange={(e) => setData({ ...data, price: e.target.value })}
            />
          </div>

          <div className="mb-3">
            <label htmlFor="Quantity" className="block text-sm font-medium text-gray-700" style={{ marginBottom: '10px', color: '#fff' }}>
            Quantity:
            </label>
            <input
              type="text"
                className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              id="quantity"
              value={data.quantity}
              onChange={(e) => setData({ ...data, quantity: e.target.value })}
            />
          </div>

          <div className="mb-3">
            <label htmlFor="Quantity" className="block text-sm font-medium text-gray-700" style={{ marginBottom: '10px', color: '#fff' }}>
            Total Amount:
            </label>
            <input
              type="text"
                 className="form-input mt-1 block w-full px-3 py-2 border rounded-md shadow-sm focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm"
              id="totalAmount"
              value={parseInt(data.price)*parseInt(data.quantity)}
              onBlur={(e) =>
                setData({ ...data, totalAmount: e.target.value })
              }
            />
          </div>

          <button type="submit" className="w-full bg-indigo-500 text-white p-3 rounded-md font-semibold hover:bg-indigo-600 transition duration-300">
            Update
          </button>
        </form></div>
      </div>
    </>
  );
}

export default FoodEdit;
