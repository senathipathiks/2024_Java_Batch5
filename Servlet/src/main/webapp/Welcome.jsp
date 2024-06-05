<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//String name = request.getParameter("uname");
//out.print("Hi "+name+" \n");
String name = (String) request.getAttribute("uname");
out.print("Hi "+name+" \n");
%>
<h1>Welcome to our apllication </h1>
</body>
</html>