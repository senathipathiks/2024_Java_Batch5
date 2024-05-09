import React from 'react'

//Functional Component
const LoginFun=()=>{return(<div>
    <form>
        <div class="bg-text">
            <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" id="user"></input> </td>
                </tr>

                <tr>
                    <td>Password</td>
                    <td><input type="text" name="username" id="pass"></input> </td>
                </tr>

                <tr>
                    <th colspan="2"> <input type="submit" id="but" value="submit" ></input></th>
                </tr>
            </table>
            </div>



    </form>
</div>)}
export default LoginFun
