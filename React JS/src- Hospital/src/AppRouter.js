import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import View from "./View";
import Add from "./Add";
import Edit from "./Edit"
import "./App.css";
import Mynav from "./Mynav"
import Home from "./Home";
// import AddD from "./AddD";
import { Link } from "react-router-dom";

function AppRouter() {
  return (
    <Router >
     <Mynav/>
     {/* <Home/> */}
        {/* <br/>
        <br></br> */}
      <Routes >
      
      <Route exact path="/" element={<Home />} />
        <Route path="/home" element={<Home />} />
        <Route path="/view" element={<View />} />
        <Route path="/create" element={<Add />} />
        <Route path="/update/:id" element={<Edit/>} />
        {/* <Route path="/createD" element={<AddD/>} /> */}

        {/* <Route path="/delete" element={<App2 />} /> */}
      </Routes>
    </Router>
  );
}

export default AppRouter;

