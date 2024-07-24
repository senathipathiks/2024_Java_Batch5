<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- 
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
-->

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
                background-color:lightpink;
                color: aliceblue;
                padding: 10px 10px;
                border-radius: 25px;
                font-weight: bold;
                font-size: 15px;
                border-width:10px;
                
                border-color: white;
                margin-top:10px;
                margin-left:10px;
                
            }
            table td{
                padding: 10px 10px;
                border-radius:2px;
                border-width:3px;
                border-color: white;
            }
</style>
</head>
<body>
<center>
<form action="Insertion" method="post" >
<table>

<center><h1>Enter the Insertion Details<h1>
<tr>
<center><td><h2>Enter Name  : <input type="text" name="sname" class="in" required><br></td></tr></h2>
<!-- <tr>
<td><h2>Enter City : <input type="text" name="scity" class ="in" required></td><br><br></tr></h2>-->

<td><h2>Enter city : <input type="text" name="scity" class ="in" required></td><br><br></tr></h2>

<td><h2><center><input type="Submit" value="Insert" name="button"></td></center></h2>
</form>
</center>
</table>

<%
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Insertion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
}
 
}

%>
</body>
</html>