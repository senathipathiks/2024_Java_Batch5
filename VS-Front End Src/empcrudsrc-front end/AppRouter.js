import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import ViewEmployee from "./ViewEmployee";
import AddEmployee from "./AddEmployee";
import UpdateEmployee from "./UpdateEmployee";
import ViewPayroll from "./ViewPayroll";
import AddPayroll from "./AddPayroll";
import UpdatePayroll from "./UpdatePayroll"
import Home from "./Home";


function AppRouter() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/viewemployee" element={<ViewEmployee />} />
        <Route path="/addemployee" element={<AddEmployee/>} />
        <Route path="/updateemployee/:id" element={<UpdateEmployee/>} />
        <Route path="/viewpayroll" element={<ViewPayroll />} />
        <Route path="/addpayroll" element={<AddPayroll/>} />
        <Route path="/updatepayroll/:id" element={<UpdatePayroll/>} />
      </Routes>
    </Router>
  );
}

export default AppRouter;
