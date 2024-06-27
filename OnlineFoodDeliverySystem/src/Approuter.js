import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import View from "./View";
import Viewuser from "./Customer/Viewuser"
import Add from "./Add";
 import Edit from "./Edit";
import ColorSchemesExample, { CardComp } from "./ColorSchemesExample";
import { Card } from "@mui/material";
//  import Search from "./Search";
import Adduser from "./Customer/Adduser";
import Edituser from "./Customer/Edituser";
import Home from './Home';
import Login from "./Login";
import Signup from "./Signup";
import Menu from "./Menu";
// import Registration from "./Registration";

function Approuter() {
  return (
    <Router>
      <ColorSchemesExample/>
      {/* <CardComp /> */}
     <Routes>
        {/* <Route path="/" element={<ColorSchemesExample/>}/> */}
        <Route path="/" element={<Home/>}/>
        <Route path="/view" element={<View/>}/>
        <Route path="/create" element={<Add/>}/>
        <Route path="/update/:id" element={<Edit/>}/>
        <Route path="/login" element={<Login/>}/>
        <Route path="/signup" element={<Signup/>}/>
        <Route path="/payupdate/:cid" element={<Edituser/>}/>
        {/* <Route path="/search" element={<Search/>}/> */}
        <Route path="/payroll" element={<Viewuser/>}/>
        <Route path="/insertpay" element={<Adduser/>}/>
        <Route path="/menus" element={<Menu/>}/>
        {/* <Route path="login" element={<Registration/>}/> */}
        {/* <Route path="signin" element={<Signin/>}/> */}
        
        </Routes> 
    </Router>
  )
}

export default Approuter;
