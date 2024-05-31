<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Welcome Page</title>
</head>
<body>
<center>
<h2 > Welcome to your Inbox</h2>
<%

String name = request.getParameter("uname");
out.println("<h1>Login Successfull !!! </h1>");
out.println("<h1> Welcome "+name+" </h1>");

%>

</center>

</body>
</html>