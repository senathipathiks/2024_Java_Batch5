import React from 'react'
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import HomePage from "./HomePage.css"
import Main from './Main';
import Login from "./Login";
import Register from "./Register";
import Add from "./Add";
import AddAdmin from "./AddAdmin"
import Edit from "./Edit";
import View from './View';
import ViewAdmin from './ViewAdmin';
import EditDoctor from './EditAdmin';

function AppRouter() {
  return (
    <Router class="head">
        <header>
        <nav>
          <ul>
          <li>
              Cake Bee
            </li>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/Login">Login</Link>
            </li>
            <li>
              <Link to="/Register">Register</Link>
            </li>
            <li>
              <Link to="/viewu">View User</Link>
            </li>
            <li>
              <Link to="/viewa">View Admin</Link>
            </li>
            {/* <li>
              <Link to="/create">Add Patient</Link>
            </li> */}
            
            
            <li>
                <input type='text'></input>
                <button>Search</button>
            </li>
          </ul>
        </nav>
        </header>
        <Routes>
            <Route path='/' element={<Main />} />
            <Route path='/login' element={<Login />} />
            <Route path='/register' element={<Register />} />
            <Route path="/create" element={<Add />} />
            <Route path="/createa" element={<AddAdmin />} />
            <Route path="/viewu" element={<View />} />
            <Route path="/viewa" element={<ViewAdmin />} />
            <Route path="/updateUser/:id" element={<Edit/>} />
            <Route path="/updateAdmin/:id" element={<EditDoctor/>} />
        </Routes>
    </Router>
  )
}

export default AppRouter;
