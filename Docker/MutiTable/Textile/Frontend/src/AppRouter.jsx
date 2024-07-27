import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

import Navbar from "./Navbar";

import Home from "./Home";
import Signup from "./Signup";
import Login from "./Login";
import ViewCustomer from "./ViewCustomer";
import ViewOrder from "./ViewOrder";
import AddCustomer from "./AddCustomer";
import AddOrder from "./AddOrder";
import EditCustomer from "./EditCustomer";
import EditOrder from "./EditOrder";



function AppRouter() {
  return (
    <Router>
      <Navbar />

      <Routes>
        {/* <Route path="/" element={<Home />} /> */}
        <Route path="/signup" element={<Signup />} />
        <Route path="/login" element={<Login />} />
        <Route path="/viewcustomer" element={<ViewCustomer />} />
        <Route path="/vieworder" element={<ViewOrder />} />
        <Route path="/createcustomer" element={<AddCustomer />} />
        <Route path="/createorder" element={<AddOrder />} />
        <Route path="/updatecustomer/:customerId" element={<EditCustomer />} />
        <Route path="/updateorder/:orderId" element={<EditOrder />} />
      </Routes>
    </Router>
  );
}

export default AppRouter;