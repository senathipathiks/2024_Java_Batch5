import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Login from "./components/Login";
import Signup from "./components/Signup";
import Hero from "./components/Hero";
import Main from "./components/main";
import ViewUser from "./pages/ViewUser";
// import Add from "./pages/Add";
import Edit from "./pages/Edit";
import AddUser from "./pages/AddUser";
import EditUser from "./pages/EditUser";
import UserMain from "./components/UserMain";
import ViewRequest from "./pages/ViewRequest";



function AppRouter() {
  return (
   
    <Router>
      <Routes>
      <Route path="/" element={<Hero/>} />
        <Route path="/main" element={<Main/>} />
        <Route path="/usermain" element={<UserMain/>} />

        <Route path="/login" element={<Login/>} />
        <Route path="/signup" element={<Signup/>} />

        {/* <Route path="/add" element={<Add/>} /> */}
        <Route path="/adduser" element={<AddUser/>} />

        <Route path="/edit/:id" element={<Edit/>} />
        <Route path="/edituser/:id" element={<EditUser/>} />

        <Route path="/viewrequest" element={<ViewRequest/>}/>
        <Route path="/viewuser" element={<ViewUser/>} />

      </Routes>
    </Router>
    
  );
}

export default AppRouter;