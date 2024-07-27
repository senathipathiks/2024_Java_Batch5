<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<form action="Validation.jsp">
<center>
<table border=11>
	<tr>
		<th colspan="2">
		Registration Page
		</th>
	</tr>
	<tr>
		<td>First Name</td>
		<td><input type="text" name="fname"></td>
	</tr>
	<tr>
	<td>Last Name</td>
	<td><input type="text" name="lname"></td>
	</tr>
	<tr>
	<td>Username</td>
	<td><input type="text" name="uname"></td>
	</tr>
		<td>Mobile Number</td>
		<td><input type="text" name="mob"></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="pass"></td>
	</tr>
	<tr>
	<td colspan="2"><input type="Submit" class="btn btn-success" Value="Register"></td>
</table>
</center>
</form>
</body>
</html>