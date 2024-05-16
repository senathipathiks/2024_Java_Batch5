import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import View from "./View";
import View1 from "./View1";
import Add from "./Add";
import Edit from "./Edit";
import { Link } from "react-router-dom";
import App from "./App";
import Home from "./Home";
import Add1 from "./Add1";
import Edit1 from "./Edit1";


function AppRouter() {
  return (
    <Router class="header">
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
              <Link to="/View">Customer</Link>
            </li>
            <li>
              <Link to="/View1">Advertisment</Link>
            </li>
            <li style={{marginLeft:"90px"}}>
              <input type="text"></input>
              <button className="btn btn-primary">Search</button>
            </li>
            <li></li>
            <li style={{marginLeft:"90px"}}>
              <h5 style={{color:"white"}}>ADMIN</h5>
            </li>
          </ul>
        </nav>
      </header>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/view" element={<View />} />
        <Route path="/view1" element={<View1 />} />
        <Route path="/create" element={<Add />} />
        <Route path="/update/:id" element={<Edit />} />
        <Route path="/create1" element={<Add1 />} />
        <Route path="/update1/:id" element={<Edit1 />} />
        {/* <Route path="/delete" element={<App2 />} /> */}
      </Routes>
    </Router>
  );
}

export default AppRouter;
