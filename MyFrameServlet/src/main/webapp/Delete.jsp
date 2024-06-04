<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
<style>
            body{
                background-color: aliceblue;
            }
            h2{
                color:grey;
            }
            table{
                background-color: grey;
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
            color: rgba(224,45,84,255);
            padding: 10px 10px;
            text-align: center;
            text-decoration:none;
            display:inline-block;
            font-size: 15px;
            font-weight: bold;
            }
            ::placeholder{
                color:rgba(224,45,84,255);
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
            .button2{
            background-color:aliceblue;
            border-color:black;
            border-width: 4px;
            border-radius:10px ;
            
            color: rgba(224,45,84,255);
            padding: 10px 10px;
            text-align: center;
            display:inline-block;
            font-size: 14px;
            font-weight: bold;
            }
            
            input[type='radio']{
                border-color:black;
                border-width: 5px;
            }

            .button:hover{
                transform: scale(1.2);
            }
            .button2:hover{
                transform: scale(1.2);
            }
        </style>
</head>
<body>

<h2 align="center">Delete</h2>
<form action="Controller" method="post">

<table border="1" align="center">
            <tr>
                <td>Enter Employee ID of Record you want to Delete:</td>
                <td><input type="number" placeholder="Enter ID.." id="id" name="id"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="del" value="Delete" ></td>
            </tr>
</table>
</form>
</body>
</html>