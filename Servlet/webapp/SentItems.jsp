<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send Item Page</title>
</head>
<body>
<%
	String name = (String) session.getAttribute("name");
	out.println("<center><h1>Hi "+name+" "+"Welcome to Sent Items Page! </h1></center>");
%>
	<center>
		<a style="none" href="Profile.jsp">Click me to Redirect Profile Page!</a>
	</center>
	
</body>
</html>