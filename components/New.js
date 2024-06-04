import React from 'react'

function New() {
  return (
    <div>
      <div>
            <form>
                <h3 class="text-center"> Login</h3><br></br>

                    <label>username : </label><input type="text" id="username" name="username"
                        placeholder="Enter your Username" required></input><br></br>
                    <label>password : </label><input type="password" id="password" name="pwd"
                        placeholder="Enter your password" required></input><br></br>
                    <div class="wrap">
                        <center><button id="btn">login</button></center>
                    </div><br></br>
                        <p><a>Forget password?</a></p>
                        <p>Already have an Account<a href="signup.html">signup</a></p>

            </form>
        </div>
    </div>
  )
}

export default New
