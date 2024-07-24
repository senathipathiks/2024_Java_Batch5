<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        	    <%@ include file="Navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<center><h1>Welcome to Login page</h1>


<form action="Log" method="post" modelAttribute="bean">

User Name: <input type="text" name="name"/><br><br>

Password:  <input type="password" name="password"/><br><br>

<input type="submit" value="Login" name="login">

</form>


<%

String result = (String) request.getAttribute("Action");

if (result != null) {
	if ("Success".equals(result)) {
		out.print("<h3 style=color:green>Login Successfully</h3>");
	} else {
		out.print("<h3 style=color:red>Login Failed</h3>");
	}
}

%>

</center>


</body>
</html>