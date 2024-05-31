<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find</title>
</head>
<body>
<center>
<form action="JdbcMainservlet" method="get">
<h1>Find Employee by ID</h1>
ID               : 
	    <input type="text" name="id" class="in" required>
	    <br><input type="Submit" value="Find" name="search">
</form>

</center>
</body>
</html>