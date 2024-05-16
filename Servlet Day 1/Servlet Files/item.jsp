<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item Page</title>
</head>
<body>
<% 
String name=request.getParameter("uname");
out.print("Hlo "+name+" you're viewing your Items list");

 %>

<h2>  click to view <a href="profile.jsp">profile</a> </h2>
</body>
</html>