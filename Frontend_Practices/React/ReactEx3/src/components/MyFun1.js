import React from 'react'
import './MyFun1.css'


var MyFun1=() => {

    return(

    <div>
        <h1>Anonymous Function !!!</h1>
        <div id="ab">
      <h1>LOGIN</h1>
      <div class="name">
        <input
          type="text"
          name="uname"
          id="uname"
          placeholder="USER NAME"
          required
        />
        <input
          type="email"
          name="email"
          id="email"
          placeholder="EMAIL ID"
          required
        />
      </div>
      <div class="pass">
        <input
          type="password"
          name="pword"
          id="pword"
          placeholder="ENTER PASSWORD"
          required
        />
      </div>
      <p id="new">NEW USER? <a href="registration.html">SIGN UP</a></p>
      <hr />
      <button id="submit"><a href="ticket.html">LOGIN</a></button>
    </div>
    </div>
    );
  
}

export default MyFun1;
