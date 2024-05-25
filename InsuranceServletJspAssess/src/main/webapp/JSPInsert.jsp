<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
<script>
            
            $(document).ready(function insertValidation(){
                $("#action").click(function(){
                    var name = $("#name").val();
                    var phoneno = $("#phoneNo").val();
                    var email = $("#emailID").val();
                    if(name ==""){
                        alert("Customer Name is Required")
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
                            else{
                                alert("Registered Succesfully");
                            
                            }
                        }
                    }
             })
                        
         })
</script>
<style>
            body{
                background-color: aliceblue;
            }
            h2{
                color:rgba(15,77,134,255);
            }
            table{
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
            color: rgba(15,77,134,255);
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

<h2 align="center">Insert</h2>
<form onsubmit="return insertValidation()" action="Controller" method="get" >
<table border="1" align="center">
            <tr>
                <td>Enter Customer ID:</td>
                <td><input type="text" placeholder="Enter ID.." name="id" id="id"></td>
            </tr>
            <tr>
                <td>Enter Customer Name:</td>
                <td><input type="text" placeholder="Enter Cus Name.." name="name" id="name"></td>
            </tr>
            <tr>
                <td>Enter Customer Age:</td>
                <td><input type="text" placeholder="Enter Cus Age.." name="age" id="age"></td>
            </tr>
            <tr>
                <td>Enter Customer Phone No:</td>
                <td><input type="text" placeholder="Enter Cus Phone No.." name="phoneNo" id="phoneno"></td>
            </tr>
            <tr>
                <td>Enter Customer Email ID:</td>
                <td><input type="text" placeholder="Enter Cus Email ID.." name="emailID" id="emailID"></td>
            </tr>
            <tr>
                <td>Enter Nominee Name:</td>
                <td><input type="text" placeholder="Enter Nominee Name.." name="nomineeName"></td>
            </tr>
            <tr>
                <td>Enter Nominee Relation:</td>
                <td><input type="text" placeholder="Enter Nominee Relation.." name="nomineeRelation"></td>
            </tr>
            <tr>
                <td>Enter Customer Address:</td>
                <td><input type="text" placeholder="Enter Cus Address.." name="address"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="action" id="action" value="Insert" ></td>
            </tr>
</table>
</form>


</body>
</html>