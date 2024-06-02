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
String name = request.getParameter("uname");
out.print("Hi"+name);
%>
<h1>Hello all this is sent items</h1>

	<form action="index" method="get">
	<input type="submit" value="profile">
	</form>
</body>
</html>