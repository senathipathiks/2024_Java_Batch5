import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import View from "./View";
import Add from "./Add";
import Edit from "./Edit"
import Navbar from "./Navbar";
import Find from "./Find";
import Login from "./Login";
import Signup from "./Signup";

function AppRouter() {
  return (
    <Router>
      <Navbar />
      <Routes>
        <Route path="/view" element={<View />} />
        <Route path="/create" element={<Add />} />
        <Route path="/update/:id" element={<Edit/>} />
        <Route path="/find" element={<Find />} />
        <Route path="/login" element={<Login />} />
        <Route path="/signup" element={<Signup />} />
        {/* <Route path="/delete" element={<App2 />} /> */}
      </Routes>
    </Router>
  );
}

export default AppRouter;