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
String name = request.getParameter("username");
out.print("<h1>Hi "+name+"!!!</h1>");
%>
<!-- <h1>Hi ${param.username}</h1> -->
<h1>Welcome to your inbox</h1>

</body>
</html>