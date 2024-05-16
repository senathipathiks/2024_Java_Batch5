import React from "react";
import { Link } from "react-router-dom";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import AddCustomer from "./AddCustomer";
import AddProduct from "./AddProduct";
import EditCustomer from "./EditCustomer";
import EditProduct from "./EditProduct";
import DisplayCustomer from "./DisplayCustomer";
import DisplayProduct from "./DisplayProduct";
import ViewCustomer from "./ViewCustomer";
import ViewProduct from "./ViewProduct";
import Home from "./Home";
import './Nav.css';


function AppRouter() {
  return (
    <Router>

<header>
      <div className="container-fluid">
        <ul>
        <li>
            <Link to="/home">Home</Link>
          </li>
          <li>
            <Link to="/viewcustomer">View Customer</Link>
          </li>
          <li>
            <Link to="/viewproduct">View Product</Link>
          </li>
          <li>
            <Link to="/createcustomer">Add Customer</Link>
          </li>
          <li>
            <Link to="/createproduct">Add Product</Link>
          </li>
          <li>
            <Link to="/updatecustomer/:id">Update Customer</Link>
          </li>
          <li>
            <Link to="/updateproduct/:id">Update Product</Link>
          </li>
          <li>
            <input type="text" style={{width:300}} /> 
            <button className="btn btn-warning" style={{width:200}}>Search</button>
          </li>
          
        </ul>
        </div>
      </header>


      <Routes>
        <Route path="/home" element={<Home />} />
        <Route path="/viewcustomer" element={<ViewCustomer />} />
        <Route path="/viewproduct" element={<ViewProduct />} />
        <Route path="/createcustomer" element={<AddCustomer />} />
        <Route path="/createproduct" element={<AddProduct />} />
        <Route path="/updatecustomer/:id" element={<EditCustomer/>} />
        <Route path="/updateproduct/:id" element={<EditProduct/>} />
        <Route path="/readcustomer/:id" element={<DisplayCustomer/>} />
        <Route path="/readproduct/:id" element={<DisplayProduct/>} />
     
      </Routes>
    </Router>
  );
}

export default AppRouter;
