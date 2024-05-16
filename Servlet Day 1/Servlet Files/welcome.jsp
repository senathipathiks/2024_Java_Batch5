<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<% 
String name=request.getParameter("uname");
out.print("Hlo "+name+"'s Inbox");

 %>
<h3> click <a href="item.jsp" target="_blank">view item</a> </h1>

</body>
</html>