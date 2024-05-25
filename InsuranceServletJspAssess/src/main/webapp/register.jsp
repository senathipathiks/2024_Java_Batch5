<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <link rel="stylesheet" href="style.css">
        <!-- Bootstrap Link -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <!-- Bootstrap Link -->

        <!-- Font Awesome Cdn -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"> 
        <!-- Font Awesome Cdn -->

        <!-- Google Fonts Start -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap" rel="stylesheet">
        <!-- Google Fonts End -->

        <script>
            
            $(document).ready(function formValidation(){
                $("#signup").click(function(){
                    var name1 = $("#name1").val();
                    var name2 = $("#name2").val();
                    var phoneno = $("#phoneno").val();
                    var email = $("#emailid").val();
                    var pass = $("#pwd").val();
                    var cpwd = $("#cpwd").val();
                    var regEx = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\-+.]).{6,20}$/;
                    var regEx1 = /^(0|[+91]{3})?[6-9][0-9]{9}$/;
                    var validPass = regEx.test(pass);
                    var validNo = regEx1.test(phoneno);
                    if(name1 ==""){
                        alert("First Name is Required")
                    }
                    else if(name2 ==""){
                        alert("Last Name is Required")
                    }
                    else if(phoneno ==""){
                        alert("Phone Number is Required");
                    }
                    else if(phoneno !=""){
                        if(!validNo){
                            alert("Enter valid phone number");
                        }
                        else if(email ==""){
                        alert("Email must be entered");
                        }
                        else if(email!=""){
                            if(!email.includes("@")){
                                alert("Email entered is not Valid");
                            }
                            else if(!email.includes(".com")){
                                alert("Email entered is not Valid");
                            } 
                            else if(pass == ""){
                                alert("password should be entered");
                            }
                            else if(pass !=""){
                                if(!validPass){
                                alert("Enter valid password");
                                }
                                else if(cpwd == ""){
                                    alert("password needs to be confirmed")
                                }
                                else if(cpwd!=""){
                                    if(cpwd!=pass){
                                        alert("password must be same");
                                    }
                                    else{
                                        alert("Registered Succesfully");
                                    
                                    }
                                }  
                            }
                           
                        }
                    } 
                    
                        
                         
                })
                    
             })
                
                
        </script>
        
        <style>
            
            table{
                margin-top: 30px;
                background-color:rgba(15,77,134,255);
                color: aliceblue;
                padding: 10px 10px;
                border-radius: 25px;
                font-weight: bold;
                font-size: 15px;
                border-width:10px;
                border-style:double;
                border-color: aliceblue;
            }
            table td{
                padding: 10px 10px;
                border: none;
            }
            .button{
            background-color:aliceblue;
            border-color:black;
            border-width: 4px;
            border-radius:10px ;
            color:rgba(15,77,134,255);
            padding: 10px 10px;
            text-align: center;
            text-decoration:none;
            display:inline-block;
            font-size: 15px;
            font-weight: bold;
            }
            ::placeholder{
                color:rgba(15,77,134,255);
                font-size:small;
                background-color: aliceblue;
                padding: 5px;
            }
            input{
                border-radius: 10px;
                padding: 5px 5px;
                border-color:black;
                border-width: 4px;
            }
            
           

            .button:hover{
                transform: scale(1.2);
            }
            
        </style>
    </head>
    <body>
        <div id="register" class="register">
            <div class="content">
            <h2 align="center">Register <span>Insurance</span> Account</h2>
        <form name="f1" onsubmit="return formValidation()" action="JSPFrame.jsp">
        <center>
            <table border="1">
                <tr>
                    <td>First Name :</td>
                    <td><input type="text" placeholder="Enter First Name.." id="name1" name="name1"></td>
                </tr>
                <tr>
                    <td>Last Name :</td>
                    <td><input type="text" placeholder="Enter Last Name.." id="name2" name="name2"></td>
                </tr>
                <tr>
                    <td>Gender :</td>
                    <td>
                        <label for="male">Male</label>
                        <input type="radio" name="gender" value="male" checked>
                        <label for="female">Female</label>
                        <input type="radio" name="gender" value="female"></td>
                </tr>      
                <tr>
                    <td>Phone Number :</td>
                    <td><input type="text" placeholder="Enter Mobile Number.." name="phoneno" id="phoneno"></td>
                </tr>
                <tr>
                    <td>Email ID :</td>
                    <td><input type="text" placeholder="Enter email.." id="emailid" name="Emailid"></td>
                </tr> 
                <tr>
                    <td>Password :</td>
                    <td><input type="password" placeholder="Enter Password.." id="pwd" name="pwd"></td>
                </tr>
                <tr>
                    <td>Confirm Password :</td>
                    <td><input type="password" placeholder="Confirm Password.." id="cpwd" name="cpwd"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" class="button" name="signup" id="signup" value="Sign-Up"></td>
                </tr>
            </table>
        </center>
    </form>
            </div>
        </div>
        

    </body>
</html>