<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Employee</title>
</head>
<body>
<form action="JdbcMainservlet" method="post">
<center>
<h1 id="head1">Insert Employee Details</h1>
	    ID               : 
	    <input type="text" name="id" class="in" required><br>
	    <br>Name         :
	    <input type="text" name="name" class="in" required><br>
	    <br>Designation   :
	    <input type="text" name="desg" class="in" required><br>
	    <br>Salary        :
	    <input type="text" name="salary" class="in" required><br>
	    <br><input type="Submit" value="Insert" name="button">
</center>

</form>

</body>
</html>