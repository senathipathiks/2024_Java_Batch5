import React, { useEffect, useState } from "react";

import { Link, useNavigate } from "react-router-dom";
import img1 from './about.jpg'
import img2 from './home3.jpg'
import img3 from './logo.jpg'

function Home() {
    return (
        <div>
            <div>
                <nav class="navbar navbar-expand-sm bg-dark">
                    <ul class="nav nav-pills nav-expand-sm col-1">
                        <li class="nav-item">

                            <img className="img-responsive" src={img3} height="50" width="100"></img>
                        </li>
                    </ul>
                    <div className="d-flex ms-auto ">
                        <ul class="nav nav-pills nav-expand-sm col-12">
                            <li class="nav-item">
                                <Link to="/" className="text-decoration-none"> <a class="nav-link text-light">Home</a></Link>
                            </li>
                            <li class="nav-item">
                                <Link to="/About" className="text-decoration-none"> <a class="nav-link text-light" >About us</a></Link>
                            </li>
                            <li class="nav-item">
                                <Link to="/Login" className="text-decoration-none"><a class="nav-link text-light">Login</a></Link>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-light" href="#">Pages</a>
                            </li>
                            <li class="nav-item">
                                <a className="nav-link text-light" href="#">Blog</a>
                            </li>
                            <li class="nav-item">
                                <Link to="/Registration" className="text-decoration-none"><a className="nav-link text-light" >Register</a></Link>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-light" href="#">Contact</a>
                            </li>
                        </ul>
                    </div>


                </nav>
            </div>
            <div class="container-fluid">
                <div class="main">
                    <img src={img2} height="500px" width="100%" class="d-block" alt="..."></img>
                    <div class="main-caption ">
                        <center>
                            <h3>Welcome to our </h3>
                            <h2>Travel Agency</h2>
                        </center>

                    </div>
                </div>
                <hr />
                <br />
                <br />
                <div class="container">
                    <div class="row">
                        <h5 class="display-1  justify-content-center">Why we are the best</h5>
                        <p>We are the best because we care for your each rupee.</p>
                    </div>
                </div>
                <hr />
                <div class="about" id="ab">
                    <div class="display-1 text-center">
                        About us
                    </div>
                </div>

                <div class="container aboutmsg">
                    <div class="row">
                        <div class="col-md-6 align-content-center">
                            <img className="img-responsive" id="about" src={img1}></img>
                        </div>

                        <div class="col-md-6 align-content-center">
                            <p>“Why Travel Agency”</p>
                            <p> Travel agencies don't just sell you accommodation and book tours; they work hard to ensure that
                                every customer receives attention and personalized service. By understanding what you want to
                                do, where you want to go and why, a travel agency can provide expert advice and tailor
                                itineraries to suit your needs.</p>
                        </div>
                    </div>
                </div>

                <br />
                <br></br>
            </div>
        </div>

    )
}

export default Home
