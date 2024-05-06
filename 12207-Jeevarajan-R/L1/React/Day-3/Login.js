import React, { Component } from 'react'
// import React from 'react'

function Login() {
  return (
    <div>
      <form action="/Hotel_Management/html/reservation.html">
                <h3>Login</h3>
                <div class="uname">
                    <label for="Name">Username :</label>
                    <input type="text" name="Name" id="" required/><br/>
                </div>
                <div class="pswd">
                    <label for="password">Password :</label>
                    <input type="password" name="password" id="" required/><br/><hr/>
                </div>
                <div align="center" class="submit">
                    <input type="submit" name="" id=""/><br/>
                </div>
                <div class="reg">
                    <a href="register.html">register?</a>
                    <a href="forgetPswd.html">forget password?</a>
                </div>
            </form>
    </div>
  )
}

export default Login


export class LoginF extends Component {
  render() {
    return (
      <div>
        <form action="/Hotel_Management/html/reservation.html">
                <h3>Login</h3>
                <div class="uname">
                    <label for="Name">Username :</label>
                    <input type="text" name="Name" id="" required/><br/>
                </div>
                <div class="pswd">
                    <label for="password">Password :</label>
                    <input type="password" name="password" id="" required/><br/><hr/>
                </div>
                <div align="center" class="submit">
                    <input type="submit" name="" id=""/><br/>
                </div>
                <div class="reg">
                    <a href="register.html">register?</a>
                    <a href="forgetPswd.html">forget password?</a>
                </div>
        </form>
        
      </div>
    )
  }
}

// export default LoginF

