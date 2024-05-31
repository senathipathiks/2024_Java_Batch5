<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="JdbcMainservlet" method="post">
<h1>Edit Employee by ID</h1><br>         
ID      :
	    <input type="text" name="eid"  required><br>
	    <br>Name         :
	    <input type="text" name="name" class="in" required><br>
	    <br>Designation   :
	    <input type="text" name="desg" class="in" required><br>
	    <br>Salary        :
	    <input type="text" name="salary" class="in" required><br>
	    <br><input type="Submit" value="update" name="button">
</form>

</center>
</body>
</html>