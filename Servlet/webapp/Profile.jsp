<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IProfile Page</title>
</head>
<body>

<%
	String name = (String) session.getAttribute("name");
	out.println("<h1>Hi</h1>" +name);
%>
	<center>
		<a style="none" href="login.jsp">Click me to Logout!</a>
	</center>
</body>
</html>