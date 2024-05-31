<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login.com</title>
</head>
<body> 
<!-- form action = "LoginServlet" method=""post-->
<!--  <form action = "Cookieservlet" method="get">-->
<form action = "SessionServlet" method="get">
	UserName : <input type="text" name="uname"><br>
	<br>Password  : <input type="password" name="pswd"><br>
	<input type="submit" value="Login">
</form>
</body>
</html>