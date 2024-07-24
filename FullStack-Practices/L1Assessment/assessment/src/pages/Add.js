import axios from "axios";
import React, { useState, useEffect } from "react";
import { useNavigate, useParams, Link } from "react-router-dom";
import "./App2.css";
import Navbar from "../components/Navbar";
import { Checkbox } from 'antd';

function Add() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const [selectedId, setSelectedId] = useState('');
  const [total, setTotal] = useState(0); // State to hold total amount
  const [selectedItems, setSelectedItems] = useState([]); // State to hold selected item labels
  const [paymentMethod, setPaymentMethod] = useState(''); // State to hold selected payment method

  const [inputData, setInputData] = useState({
    orderId: "",
    orderedItems: "", // Will store names of selected items
    totalAmount: 0, // Initialize total amount
    user: {
      id: "",
      name: "",
      emailid: "",
      address: "",
      phoneNumber: "",
      bill:""
    },
    payment: ""
  });

  const options = [
    { label: 'Cappuccino', value: 100 },
    { label: 'Latte', value: 90 },
    { label: 'Macho', value: 80 }
  ];

  const naviget = useNavigate();

  useEffect(() => {
    axios
      .get("http://localhost:4444/user/all")
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  const onChange = (checkedValues) => {
    let total = 0;
    let selectedItemsNames = [];
    checkedValues.forEach((value) => {
      const option = options.find((option) => option.label === value);
      if (option) {
        total += parseInt(option.value, 10);
        selectedItemsNames.push(option.label);
      }
    });
    setTotal(total); // Update total amount state
    setSelectedItems(selectedItemsNames); // Update selected items names
    setInputData({
      ...inputData,
      orderedItems: selectedItemsNames.join(', '),
      totalAmount: total
    }); // Update ordered items and total amount in form data
  };

  const handleChanges = (event) => {
    const selectedUserId = event.target.value;
    setSelectedId(selectedUserId);
    axios
      .get(`http://localhost:4444/user/${selectedUserId}`)
      .then((response) => {
        setInputData({
          ...inputData,
          user: response.data
        });
      })
      .catch((err) => {
        console.log(err);
      });
  };

  const handleChange = (event) => {
    setPaymentMethod(event.target.value); // Update selected payment method
    setInputData({
      ...inputData,
      payment: event.target.value
    }); // Update payment method in form data
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(inputData); // Log input data before submission for verification

    // Validate form data
    if (!validateForm()) {
      alert("Please Enter Valid Inputs!!!");
      return;
    }

    axios
      .post("http://localhost:4444/order", inputData)
      .then((res) => {
        alert("Data added Successfully");
        naviget("/"); // Navigate to home page after successful submission
      })
      .catch((err) => console.error("Error submitting data:", err));
  };

  const validateForm = () => {
    const { user, payment } = inputData;
    if (user.name.trim() === "" || user.emailid.trim() === "" || payment.trim() === "") {
      return false;
    }
    return true;
  };

  return (
    <>
      <Navbar />

      <div
        id="add2"
        className="d-flex w-100 vh-100 justify-content-center align-items-center"
        style={{ backdropFilter: 'blur(5px)', backgroundColor: '#f9f9f9' }}
      >
        <div className="w-50 border bg-dark p-5" style={{ animation: 'fadeIn 0.5s', border: '4px solid black', borderRadius: '30px' }}>
          <form onSubmit={handleSubmit}>
            <h1 style={{ marginBottom: '20px', color: '#fff' }}>Place Your Order</h1>

            <div className="mb-3 bg-light p-3" id="check">
              <label htmlFor="items" className="form-label mr-4" style={{ color: 'black' }}>
                Items
              </label>
              <Checkbox.Group options={options.map(opt => opt.label)} defaultValue={[]} onChange={onChange} />
            </div>

            <div className="mb-3">
              <label htmlFor="selectId">Select a User ID:</label>
              <select id="selectId" onChange={handleChanges}>
                <option value="">Select an ID</option>
                {data.map((item) => (
                  <option key={item.id} value={item.id}>
                    {item.id}
                  </option>
                ))}
              </select>
            </div>

            <div className="mb-3">
              <label htmlFor="orderedItems" className="form-label">
                Ordered Items
              </label>
              <input
                type="text"
                id="orderedItems"
                name="orderedItems"
                className="form-control"
                value={selectedItems.join(', ')} // Display selected items names
                readOnly
              />
            </div>

            <div className="mb-3">
              <label htmlFor="totalAmount" className="form-label">
                Total Amount
              </label>
              <input
                type="number"
                id="totalAmount"
                name="totalAmount"
                className="form-control"
                value={total}
                disabled
              />
            </div>

            <div className="mb-3">
              <label htmlFor="payment" className="form-label">
                Payment
              </label>
              <select
                id="payment"
                name="payment"
                className="form-control"
                onChange={handleChange}
                value={paymentMethod}
              >
                <option value="">Select Payment Method</option>
                <option value="cash">Cash</option>
                <option value="online_payment">Online Payment</option>
                <option value="coupons">Coupons</option>
              </select>
            </div>

            <button type="submit" className="btn btn-info" style={{ fontSize: '16px', padding: '10px 20px' }}>
              Submit
            </button>

            <Link to="/items" className="btn btn-primary" style={{ marginLeft: '10px' }}>
              Menu
            </Link>
          </form>
        </div>
      </div>
    </>
  );
}

export default Add;
