<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<form action = "Controller"  method="get">
<center>
<table border="1" align="center">
            <tr>
                <td>Enter Employee ID:</td>
                <td><input type="text" placeholder="Enter ID.." name="id" required></td>
            </tr>
            <tr>
                <td>Enter Employee Name:</td>
                <td><input type="text" placeholder="Enter Emp Name.." name="name" required></td>
            </tr>
            <tr>
                <td>Enter Employee Desig:</td>
                <td><input type="text" placeholder="Enter Emp Desig.." name="desig" required></td>
            </tr>
            <tr>
                <td>Enter Employee Dept:</td>
                <td><input type="text" placeholder="Enter Emp Dept.." name="dept" required></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="action" value="Update" ></td>
            </tr>
</table>
</center>
</form>
</body>
</html>