<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
</head>
<body>

<center>

<h2>Enter Student Details</h2>

<form action="MainServlet" method="get">

Student ID:<br><input type="text" name="id"><br><br>
Student Name:<br><input type="text" name="name"><br><br>
Student Email:<br><input type="email" name="emailid"><br><br>
Password:<br><input type="password" name="pwd"><br><br>

<input type="submit" name="button" value="Insert"><br><br>

</form>



</center>

</body>
</html>