import React, { Component } from 'react';

export class LoginClass extends Component {
  render() {
    return (
      <div>
        <form  >
               <hr />
               Email ID<br />
               <input type="text" name="email" /><br />
               Password<br />
               <input type="password" name="pas" /><br />
               <button>Login</button>  
             <a href="fp.html">forget password</a>
             <hr />
            </form>
      </div>
    );
  }
}
