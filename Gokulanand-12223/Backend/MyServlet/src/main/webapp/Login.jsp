<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyLoginPage</title>
</head>
<body>
	<form action="RequestDispatcherLogin" method="get">
		UserName : <input type="text" name="uname"> <br> <br>
		Password : <input type="password" name="pswd"> <br> <br>
		<input type="submit" value="Login">
	</form>
</body>
</html>