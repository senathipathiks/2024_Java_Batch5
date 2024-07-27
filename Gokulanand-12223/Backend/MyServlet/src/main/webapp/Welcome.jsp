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
String name = request.getParameter("uname");
out.println("<h1>Hii" +name+ "!!!</h1>");
%>

<h1> Welcome to Inbox !</h1>
<h1 align="center"><a href="SendItem.jsp?uname=<%=name %>">Send</a><h1>
</body>
</html>