import React from 'react';
import './Loginstyles.css';
function login() {
  return (
    <div>
       <div id="main">
      <div id="container">
        <div id="bgimg">
          <div id="img">
            <img src="Signup.png" alt="" />
          </div>
        </div>

        <div id="form">
          <h2>SIGN IN</h2>
          <div class="input">
            <i class="fas fa-user"></i>
            <input
              type="text"
              placeholder="Username"
              id="name"
              class="name"
              required
            />
            

          </div>
          <p id="warningname">Username should not be Empty</p>
          <div class="input">
            <i class="fas fa-lock"></i>
            <input   type="password" placeholder="Password" required id="pass"class="name"
            />
           
          </div>
          <p  id="warningpass">Password should not be Empty</p>
           <div id="warningpass">  <p></p></div> 

          <center>
            <button type="submit" onclick="valid()">LOGIN</button>
            <p>Or signin with socialmedia accounts</p>
            <div class="social-media">
              <a href="#" class="social-icon">
                <i class="fab fa-facebook-f"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-twitter"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-google"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-instagram"></i>
              </a>
            </div>
          </center>
        </div>
      </div>
    </div>
    </div>
  )
}

export default login;
