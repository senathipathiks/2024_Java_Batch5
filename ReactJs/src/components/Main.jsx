import React from 'react';

import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Home from './Home';
import AboutUs from './AboutUs';
import Login from './Login';
import SignUp from './SignUp';
import './MyStyle.css';
import Forgot from './Forgot';

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
                            <li>
                                <Link to="/login">Login</Link>
                            </li>
                            <li>
                                <Link to="/signup">SignUp</Link>
                            </li>
                        </ul>
                    </nav>
                </header>

                <Routes>
                    <Route exact path="/" element={<Home />} />
                    <Route exact path="/about" element={<AboutUs />} />
                    <Route exact path="/login" element={<Login />} />
                    <Route exact path="/forgot" element={<Forgot/>} />
                    <Route exact path="/signup" element={<SignUp />} />
                </Routes>
            </Router>

        </div>
    );
}

export default Main;
