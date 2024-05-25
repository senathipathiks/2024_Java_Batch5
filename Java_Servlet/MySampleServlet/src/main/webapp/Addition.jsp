<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AdditionServlet" method="get">
		Enter 1st Number : <input type="text" name="first">
		Enter 2st Number : <input type="text" name="second">
		<input type="submit" value="Add">
		<p><%= request.getAttribute("ans") %></p>
	</form>
</body>
</html>