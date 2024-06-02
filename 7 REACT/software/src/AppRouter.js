import React from 'react'
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import "./HomePage.css";
import View from './View';
import Home from './Home';

import Add from "./Add";

import ViewCom from './ViewCom';
import AddCom from './AddCom';
import EditCom from './EditCom';
import Edit from './Edit';

function AppRouter() {
  return (
    <Router class="head" id="nav">
        <header>
        <nav >
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/view">List Of Software</Link>
            </li>
            <li>
              <Link to="/create">Add Software</Link>
            </li>
            <li>
              <Link to="/viewCompany">List Of Company</Link>
            </li>
            <li>
              <Link to="/createCompany">Add Company</Link>
            </li>


          </ul>
        </nav>
        
        </header>
        <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/view" element={<View />} />
            <Route path="/create" element={<Add />} />

            <Route path="/viewCompany" element={<ViewCom/>} />
            <Route path="/createCompany" element={<AddCom/>} />
            <Route path="/updateSoftware/:id" element={<Edit/>} />
            <Route path="/updateCompany/:id" element={<EditCom/>} />
            
        </Routes>
    </Router>
  )
}

export default AppRouter;
