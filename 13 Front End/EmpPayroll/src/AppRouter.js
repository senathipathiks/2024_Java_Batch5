import React from 'react'
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";


import Add from "./components/Add/Add";
import Edit from "./components/Edit/Edit";
import ViewPayroll from './components/View/ViewPayroll';
import Editpayroll from './components/Edit/EditPayroll';
import AddPayroll from './components/Add/AddPayroll';
import Header from './components/Nav/Header';
import View from './components/View/View';
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
      </div>
      <Routes>
        {/* <Route path="/" element={<Header />} /> */}
        <Route path="/view" element={<View />} />
        <Route path="/create" element={<Add />} />
        <Route path="/update/:id" element={<Edit />} />
        <Route path="/viewpayroll" element={<ViewPayroll />} />
        <Route path="/updatepayroll/:id" element={<Editpayroll />} />
        <Route path="/createpayroll" element={<AddPayroll />} />
        {/* <Route path="/login" element={<ValidatedLoginForm />} /> */}
        <Route path="/" element={<Home />} />
        <Route path="/register" element={<RegisterComponent />} />
        <Route path="/login" element={<LoginComponent />} />

        



      </Routes>
    </Router>
  )
}

export default AppRouter;