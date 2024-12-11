<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome user</title>
</head>
<body>
<%
String name = request.getParameter("uname");
out.println("<center><h1> Hi "+ name+" !!!<h1><center>");

%>
<center>
<!--  <h1>Welcome ${message}</h1>-->
<h2 > Welcome to your Inbox</h2>
</center>
<% 

out.println("<a style=text-decoration:none href = Send.jsp?uname=" +name +" >Send Mail </a>");

%>
</body>
</html>