<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send items</title>
</head>
<%
String name=request.getParameter("uname");
out.println("Hi"+name+"!!");
%>
<body>
<h2>Welcome to send items dashboard</h2>
<a href="prof.jsp?uname=<%=name%>">Profile</a>
</body>
</html>