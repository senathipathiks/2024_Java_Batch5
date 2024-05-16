<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile page</title>
</head>
<body>
<% 
String name=request.getParameter("uname");
out.print("Viewing"+name+"'s profile");

 %>

<h2><bold/><a href="login.jsp">logout</a></h2>
</body>
</html>