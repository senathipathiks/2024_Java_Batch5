import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import ViewProducts from "./ViewProducts";
import AddProduct from "./AddProduct";
import UpdateProduct from "./UpdateProduct";
import ViewBoutique from "./ViewBoutique";
import AddBoutique from "./AddBoutique";
import UpdateBoutique from "./UpdateBoutique"
import Home from "./Home";
import SignUp from "./SignUp";
import Login from "./Login";


function AppRouter() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<SignUp />} />
        <Route path="/login" element={<Login />} />
        <Route path="/home" element={<Home />} />
        <Route path="/viewproducts" element={<ViewProducts />} />
        <Route path="/addproduct" element={<AddProduct/>} />
        <Route path="/updateproduct/:id" element={<UpdateProduct/>} />
        <Route path="/viewboutique" element={<ViewBoutique />} />
        <Route path="/addboutique" element={<AddBoutique/>} />
        <Route path="/updateboutique/:id" element={<UpdateBoutique/>} />
      </Routes>
    </Router>
  );
}

export default AppRouter;
