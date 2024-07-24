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
<center><h1>Enter the Updation Details<h1><br>
<table>
<tr><td>Enter Traineeid  : <input type="text" name="id"><br><br></td></tr>
<tr><td>Enter TraineeName : <input type="text" name="ename"><br><br></td></tr>
<tr><td>Enter TraineeDept :<input type="text" name="edesig"><br><br></td></tr>
<tr><td>Enter TrainingRole : <input type="text"  name="edept"><br><br></td></tr>
<tr><td><input type="submit" value="Update" name="upd"></center></td></tr>
</table>
</form>
</body>
</html>