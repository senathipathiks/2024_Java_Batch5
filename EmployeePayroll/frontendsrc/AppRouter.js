import React from 'react'
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import   "./HomePage.css";
import Main from './Main';
import Login from "./Login";
import Register from "./Register";
import AddEmployee from "./AddEmployee";
import AddPayRoll from "./AddPayRoll"
import EditEmployee from "./EditEmployee";
import ViewEmployee from './ViewEmployee';
import ViewPayRoll from './ViewPayRoll';
import EditPayRoll from './EditPayRoll';


function AppRouter() {
  return (
    <Router class="head">
        <header>
        <nav>
          <ul>
          <li>
              Employee PayRoll System
            </li>
            <li class = "active">
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/Login">Login</Link>
            </li>
            <li>
              <Link to="/Register">Register</Link>
            </li>
            <li>
              <Link to="/viewEmployee">View Employee</Link>
            </li>
            <li>
              <Link to="/viewPayroll">View PayRoll</Link>
            </li>
            
            
            
            <li>
                <input type='text'></input>
                <button1>Search</button1>
            </li>
          </ul>
        </nav>
        </header>
        <Routes>
            <Route path='/' element={<Main />} />
            <Route path='/login' element={<Login />} />
            <Route path='/register' element={<Register />} />
            <Route path="/add" element={<AddEmployee />} />
            <Route path="/addp" element={<AddPayRoll />} />
            <Route path="/viewEmployee" element={<ViewEmployee />} />
            <Route path="/viewPayroll" element={<ViewPayRoll />} />
            <Route path="/updateEmployee/:empid" element={<EditEmployee/>} />
            <Route path="/updatePayroll/:payrollid" element={<EditPayRoll/>} />
        </Routes>
    </Router>
  )
}

export default AppRouter;
