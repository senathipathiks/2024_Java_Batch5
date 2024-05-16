import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import View from "./View";
import Add from "./Add";
import Edit from "./Edit"
import "./App.css";
import Mynav from "./Mynav"
import Home from "./Home";
import AddS from "./AddS" ;
import Viewstocks from "./Viewstocks";


import { Link } from "react-router-dom";

function AppRouter() {
  return (
    <Router>
     <Mynav/>
     {/* <Home/> */}
        {/* <br/>
        <br></br> */}
        
      <Routes >
        <Route exact path="/" element={<Home />} />
        <Route path="/home" element={<Home />} />
        <Route path="/View" element={<View />} />
        <Route path="/create" element={<Add />} />
        <Route path="/update/:id" element={<Edit/>} />
        <Route path="/createS" element={<AddS />} />
        <Route path="/Viewstocks" element={<Viewstocks/>}/>
        {/* <Route path="/delete" element={<App2 />} /> */}
      </Routes>
    </Router>
  );
}

export default AppRouter;

