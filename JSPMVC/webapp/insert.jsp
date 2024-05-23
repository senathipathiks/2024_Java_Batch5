<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>insert</title>
</head>
<body>
<h1> Insert Employee details</h1>
<form action="MainServletController" method="post">

employee ID :<input type="text " name="eid"><br> <br>
employee Name:<input type="text " name="ename"><br> <br>
Department : <input type="text " name="edept"><br> <br>
Designation :<input type="text " name="edesg"><br> <br>
<button type="submit" value="Insert" name="button" > Insert </button>

</form>
</body>
</html>