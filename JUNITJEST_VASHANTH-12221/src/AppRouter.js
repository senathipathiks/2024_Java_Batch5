import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

import Login from "./Login";
import SignUp from "./SignUp";
import Home from "./Home";
import Landing from "./Landing"
import  AppBar from "./Components/Appbar";
import Add from "./Add";
import Edit from "./Edit";
import View from "./View";
import Viewuser from "./MatchMaker/Viewuser"
import Adduser from "./MatchMaker/Adduser"
import Edituser from"./MatchMaker/Edituser"

function AppRouter() {
  return (
  <Router>
    
  <Routes>
   
     <Route path="/" element={<Home/>}></Route>
     <Route path="/login" element={<Login/>}></Route>
     <Route path="/signup" element={<SignUp/>}></Route>
     <Route path="/landing" element={<Landing/>}></Route>
     <Route path="/adduser" element={<Add/>}></Route>
     <Route path="/updateuser/:uid" element={<Edit/>}></Route>
     <Route path="/viewuser" element={<View/>}></Route>
     <Route path="/view" element={<Viewuser/>}></Route>
     <Route path="/insert" element={<Adduser/>}></Route>
     <Route path="/edit/:mid" element={<Edituser/>}></Route>
     {/* 
    
     <Route path="/user" element={<User/>}></Route> */}
  </Routes>

  </Router>
  )
}

export default AppRouter
