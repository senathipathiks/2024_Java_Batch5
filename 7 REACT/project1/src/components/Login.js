import React from 'react'

function Login() {
  return (

      <div >
        <div >
            <form >
                <div  >
                    <label for="user">
                        Username:
                    </label>
                    <input type="text" name="username" id="usernames" required></input>
                </div>

                <div >
                    <label for="email">
                        Email:
                    </label>
                    <input type="email" name="email" id="email" required ></input>
                    <small id="emailvalid" ><br></br>
                    Your email must be a valid email
                    </small>
                </div>

                <div >
                    <label for="password">
                        Password:
                    </label>
                    <input type="password" name="pass" id="password" required></input>

                </div>

                <div >
                    <label for="conpassword">
                        Confirm Password:
                    </label>
                    <input type="password" name="username" id="conpassword" required></input>

                </div>

                <input type="submit" id="submitbtn" value="Submit" ></input>
            </form>
        </div>
    </div>

  )
}

export default Login
