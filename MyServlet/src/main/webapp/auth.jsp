<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Auth</title>
</head>
<body>

<form action = "AuthServlet" method = "get">
Name : <input type = "text" name = "uname">
Password : <input type = "password" name = "pwd">
<input type = "Submit" value = "Auth">

</form>
</body>
</html>