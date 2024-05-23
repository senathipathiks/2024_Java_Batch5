<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>

<%
String name=request.getParameter("uname");
out.println("Hi"+name+"!!");
%>
<body>
<h2>Welcome to your Profile</h2>
<a href="Log.jsp">Logout</a>
</body>
</html>