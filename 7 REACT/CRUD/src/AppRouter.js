import React from 'react'
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import "./HomePage.css"
import Home from "./Home";

import Add from "./Add";
import Edit from "./Edit";

function AppRouter() {
  return (
    <Router class="head">
        <header>
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/login">Login</Link>
            </li>
            <li>
              <Link to="/register">Register</Link>
            </li>
            <li>
              <Link to="/create">Add Patient</Link>
            </li>
            <li>
              <Link to="/update/:id">Update Patient</Link>
            </li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li>
                <input type='text'></input>
                <button>Search</button>
            </li>
          </ul>
        </nav>
        </header>
        <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/login" element={<Login />} />
            <Route path="/register" element={<Register />} />
            <Route path="/create" element={<Add />} />
            <Route path="/update/:id" element={<Edit/>} />
        </Routes>
    </Router>
  )
}

export default AppRouter;
