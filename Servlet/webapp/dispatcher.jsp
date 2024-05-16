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
String name = (String)request.getParameter("uname");//it will return object so convert into string
out.println("Hi " + name+"!!!");
%>
<h1>Welcome to inbox !!!</h1>

</body>
</html>