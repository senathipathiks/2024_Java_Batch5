import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Viewpayroll from "./components/ViewPayroll";
import Addpayroll from "./components/AddPayroll"
import EditPayroll from "./components/EditPayroll";
import ViewEmployee from "./components/ViewEmployee";
import AddEmployee from "./components/AddEmployee";

function AppRouter() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<ViewEmployee />} />
        <Route path="/viewpayroll" element={<Viewpayroll />} />
        <Route path="/createpayroll" element={<Addpayroll />} />
        <Route path="/updatepayroll/:id" element={<EditPayroll/>} /> 
        <Route path="/create" element={<AddEmployee/>} />
        {/* <Route path="/delete" element={<App2 />} /> */}
      </Routes>
    </Router>
  );
}

export default AppRouter;
