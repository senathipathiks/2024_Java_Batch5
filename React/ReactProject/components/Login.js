import React from 'react'

function Login() {
  return (
    <div>
        <table >
                <tr >
                    <th>Enter Username:<th><input type="text" name="username"/></th></th>
                </tr>
                <tr>
                    <th>Enter password:<th><input type="password" name="password"/></th></th>
                </tr>
               <th colspan="2"><input type="submit" name="submit"/></th> 
        </table>
</div>
)
}


export default Login
