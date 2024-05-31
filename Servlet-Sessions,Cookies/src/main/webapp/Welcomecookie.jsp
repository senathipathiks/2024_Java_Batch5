<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cookie</title>
</head>
<body>
<%
Cookie cookie[] = request.getCookies();
out.println("<h1>Hii "+cookie[1].getValue()+"!!! </h1>");
%>
<h2> Welcome to Cookies Seesion </h2>
</body>
</html>