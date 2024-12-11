import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import View from "./View";
import Add from "./Add";
import Edit from "./Edit";
import ColorSchemesExample, { CardComp } from "./ColorSchemesExample";
import Search from "./Search";
import Login from "./Login";
import Signin from "./Signin";
// import Registration from "./Registration";

function Approuter() {
  return (
    <Router>
      <ColorSchemesExample/>
      {/* <CardComp /> */}
     <Routes>
        {/* <Route path="/" element={<ColorSchemesExample/>}/> */}
        <Route path="/" element={<CardComp/>}/>
        <Route path="/view" element={<View/>}/>
        <Route path="/create" element={<Add/>}/>
        <Route path="/update/:id" element={<Edit/>}/>
        <Route path="/search" element={<Search/>}/>
        <Route path="login" element={<Login/>}/>
        {/* <Route path="login" element={<Registration/>}/> */}
        <Route path="signin" element={<Signin/>}/>
        
        </Routes> 
    </Router>
  )
}

export default Approuter;
