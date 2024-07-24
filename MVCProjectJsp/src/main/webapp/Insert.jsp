<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
                border-color: white;
                margin-top:-100px;
                margin-left:400px;
            }
            table td{
                padding: 10px 10px;
                border-radius:2px;
                border-width:3px;
                border-color: white;
            }
</style>
<script>
        function validate() {
            var eid = document.forms["employeeForm"]["id"].value;
            var ename = document.forms["employeeForm"]["ename"].value;
            var edept = document.forms["employeeForm"]["edesig"].value;
            var edesg = document.forms["employeeForm"]["edept"].value;
 
            if (eid === "" || ename === "" || edept === "" || edesg === "") {
                alert("Please fill in all required fields.");
                return false;
            }
        }   
</script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="LMSMain" method="get" name="employeeForm" onsubmit="return validate();">
<table>
<center><h1>Enter the Insertion Details<h1><br>
<tr>
<td>Enter Traineeid  : <input type="text" name="id"><br><br></td></tr>
<tr>
<td>Enter Traineename : <input type="text" name="ename"></td><br><br></tr>
<tr>
<td>Enter TraineeDept :<input type="text" name="edesig"></td><br><br></tr>
<tr>
<td>Enter Trainingrole : <input type="text"  name="edept"></td><br><br></tr>
<tr>
<td><input type="submit" value="Insert" name="ins"></td></center></tr>
</form>
</table>
</body>
</html>