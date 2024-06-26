import React from 'react'
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import ViewPliceStation from './components/View/ViewPoliceStation';
import ViewFIR from './components/View/ViewFIR';


import Add from "./components/Add/Add";
import Edit from "./components/Edit/EditFir";
import Editpayroll from './components/Edit/EditPoliceStation';
import AddPayroll from './components/Add/AddPoliceStation';
import Header from './components/Nav/Header';
import Home from './components/Home/Home';
import LoginComponent from './components/Auth/LoginComponent';
import RegisterComponent from './components/Auth/RegisterComponent';

// import Register from "./Register";
// import Login from './Login';

function AppRouter() {
  return (
    <Router class="head">
      <div>
        <Header />
        {/* <ViewFIR /> */}
      </div>
      <Routes>
        <Route path="/view" element={<ViewFIR />} />
        <Route path="/create" element={<Add />} />
        <Route path="/update/:id" element={<Edit />} />
        <Route path="/viewpayroll" element={<ViewPliceStation />} />
        <Route path="/updatepayroll/:id" element={<Editpayroll />} />
        <Route path="/createpayroll" element={<AddPayroll />} />
        <Route path="/" element={<Home />} />
        <Route path="/register" element={<RegisterComponent />} />
        <Route path="/login" element={<LoginComponent />} />

        



      </Routes>
    </Router>
  )
}

export default AppRouter;