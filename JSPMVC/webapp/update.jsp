<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<h1> update content</h1> <br>
<h2> Enter Employee's ID to be updated </h2>
<form action="MainServletController" method="post">
employee ID :<input type="number " name="eid"><br> <br>
employee Name:<input type="text " name="ename"><br> <br>
Department : <input type="text " name="edept"><br> <br>
Designation :<input type="text " name="edesg"><br> <br>

<button type="submit" value="update" name="button" > Update</button> 
</form>
</body>
</html>