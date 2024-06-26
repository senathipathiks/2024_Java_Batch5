<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="Login" method="post" modelAttribute="bean">
 <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    
    <input type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit">Login</button>
</form>

<%
int res = request.getAttribute(result);
 
    		out.print(res);
 
%>
</body>
</html>