<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
body {
 background-image: url("12.jpg");
 background-color: #cccccc;
	height: 100%;

  /* Center and scale the image nicely */
  
  background-repeat: no-repeat;
  background-size: cover;
}
</style>

</head>
<body><center>
<form action="LoginSuccess.jsp" method="get"><br><br>
Username:<input type="text" name="uname" ><br><br>
Password: <input type="password" name="pwd"><br><br>
<input type="submit" value="login"></center>
</body>
</html>