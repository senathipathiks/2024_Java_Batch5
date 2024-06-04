<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "Controller"  method="get">
<center>
<label>Employee Id:</label><br><br>
<input type="number" name="id"><br><br>
<label>Employee Name:</label><br><br>
<input type="text" name="name"><br><br>
<label>Employee Designation</label><br><br>
<input type="text" name="des"><br><br>
<label>Employee Department:</label><br><br>
<input type="text" name="dept"><br><br>
<input type="submit" name="action" value="Update">
</center>
</form>
</body>
</html>