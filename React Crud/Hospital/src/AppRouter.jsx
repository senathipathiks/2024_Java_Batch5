import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import View from "./View";
import Add from "./Add";
import Edit from "./Edit"
import './Nav.css';
import Login from "./Login";
import Signup from "./Signup";
import Forgot from "./Forgot";
import Display from "./Display";
import Home from "./Home";
import ViewDoctor from "./ViewDoctor";
import AddDoctor from "./AddDoctor";
import EditDoctor from "./EditDoctor";
import DisplayDoctor from "./DisplayDoctor";


function AppRouter() {
  return (
    <Router>
      <header>
      <div className="container-fluid">
        <ul>
        <li>
            <Link to="/home">Home</Link>
          </li>
          <li>
            <Link to="/">View Patient</Link>
          </li>
          <li>
            <Link to="/view">View Doctor</Link>
          </li>
          <li>
            <Link to="/create">Add Patient</Link>
          </li>
          <li>
            <Link to="/createdoc">Add Doctor</Link>
          </li>
          <li>
            <Link to="/update/:id">Update Patient</Link>
          </li>
          <li>
            <Link to="/updatedoc/:id">Update Doctor</Link>
          </li>
          <li>
            <Link to="/login">Login</Link>
          </li>
          <li>
            <input type="text" style={{width:300}} /> 
            <button className="btn btn-warning" style={{width:200}}>Search</button>
          </li>
          
        </ul>
        </div>
      </header>
      
    
      <Routes>
      <Route path="/home" element={<Home />} />
        <Route path="/" element={<View />} />
        <Route path="/view" element={<ViewDoctor />} />
        <Route path="/create" element={<Add />} />
        <Route path="/createdoc" element={<AddDoctor />} />
        <Route path="/update/:id" element={<Edit/>} />
        <Route path="/updatedoc/:id" element={<EditDoctor/>} />
        <Route path="/login" element={<Login/>} />
        <Route path="/signup" element={<Signup />} />
        <Route path="/forgot" element={<Forgot />} />
        <Route path="/read/:id" element={<Display/>} />
        <Route path="/readdoc/:id" element={<DisplayDoctor/>} />
      </Routes>
    </Router>
  );
}

export default AppRouter;
