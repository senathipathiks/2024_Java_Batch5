import React from 'react'
import{
    BrowserRouter as Router,
    Routes,
    Route,
    Link,
 } from "react-router-dom";
import Home from './Home';
import AboutUs from './AboutUs';
import './MyStyle.css';
function Main() {
  return (
    <div>
      <Router>
        <header>
            <nav>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/about">About Us</Link>
                    </li>
                </ul>
            </nav>
        </header>
        <Routes>
          <Route exact path="/" element={<Home />} />
          <Route exact path="/about" element={<AboutUs />} />
        </Routes>
      </Router>
    </div>
  )
}
export default Main;