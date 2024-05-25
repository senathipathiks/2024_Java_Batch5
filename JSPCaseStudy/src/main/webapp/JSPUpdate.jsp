<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<style>
            body{
                background-color: aliceblue;
            }
            h2{
                color:rgba(15,77,134,255);
            }
            table{
                background-color: rgba(15,77,134,255);
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
<h2 align="center">Update</h2>
<form action="Controller" method="get">
<table border="1" align="center">
           <tr>
                <td>Enter Employee ID:</td>
                <td><input type="text" placeholder="Enter ID.." name="id"></td>
            </tr>
            <tr>
                <td>Enter Employee Name:</td>
                <td><input type="text" placeholder="Enter Emp Name.." name="name"></td>
            </tr>
            <tr>
                <td>Enter Employee Desig:</td>
                <td><input type="text" placeholder="Enter Emp Desig.." name="desig"></td>
            </tr>
            <tr>
                <td>Enter Employee Dept:</td>
                <td><input type="text" placeholder="Enter Emp Dept.." name="dept"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="action" value="Update" ></td>
            </tr>
</table>
</form>
</body>
</html>