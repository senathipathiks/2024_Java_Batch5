import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import View from "./View";
import Add from "./Add";
import Edit from "./Edit"
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
        <Route path="/viewmeetroom" element={<View />} />
        <Route path="/addmeetroom" element={<Add />} />
        <Route path="/update/:id" element={<Edit/>} />
      </Routes>
    </Router>
  );
}

export default AppRouter;
