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
                margin-top:-90px;
                margin-left:300px;
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
            var eid = document.forms["traineeForm"]["tid"].value;
            var ename = document.forms["traineeForm"]["tname"].value;
            var edept = document.forms["traineeForm"]["tdept"].value;
            var edesg = document.forms["traineeForm"]["trole"].value;
 
            if (tid === "" || tname === "" || tdept === "" || trole === "") {
                alert("Please fill in all required fields.");
                return false;
            }
        }   
</script>



<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="TMSMain" method="get" name="traineeForm" onsubmit="return validate();">
<table>
<center><h1>Enter the Insertion Details<h1><br>
<tr>
<td>Enter Trainee ID  : <input type="text" name="tid"><br><br></td></tr>
<tr>
<td>Enter Trainee Name : <input type="text" name="tname"></td><br><br></tr>
<tr>
<td>Enter Trainee Dept :<input type="text" name="tdept"></td><br><br></tr>
<tr>
<td>Enter Training Role : <input type="text"  name="trole"></td><br><br></tr>
<tr>
<td><input type="submit" value="Insert" name="ins"></td></center></tr>
</form>

</table>
</body>
</html>