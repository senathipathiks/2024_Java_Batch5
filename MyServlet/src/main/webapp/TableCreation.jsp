<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table Creation</title>
</head>
<body>
<form action="TableCreationServlet" method="get">
Enter First Name : <input type="text" name="fname">
Enter Last  Name : <input type="text" name="lname">
Enter the age    : <input type="number" name="age">
Enter designation: <input type="text" name="desig">
<input type="submit" value="Create Table">
</form>
</body>
</html>