<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Employee</title>
<style>
div{
	border: solid 2px transparent;
	width: 60%;
    padding-bottom: 3%;
	background-color: rgb(100, 161, 254);
	box-shadow: 15px 9px 10px 3px rgba(86, 86, 86, 0.474);
}

</style>
</head>
<body>
<form action="JdbcMainservlet" method="post">
<center>
	<div >
		<h1 id="head1">Insert Employee Details</h1>
	    Enter   ID    : 
	    <input type="text" name="id" class="in" required><br><br>
	    Enter Name    :
	    <input type="text" name="name" class="in" required><br>
	    <br>
	    Designation   :
	    <input type="text" name="desg" class="in" required><br>
	    <br>
	    Enter Salary  :
	    <input type="text" name="salary" class="in" required><br>
	    <br><input type="Submit" value="Insert" name="button">
	</div>

</center>

</form>

</body>
</html>