<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<center>
	<div>
		<form action="JdbcMainservlet" method="post">
			<h1>Edit Employee by ID</h1><br>         
			
			
					Enter   ID    : 
					<input type="text" name="eid" class="in" required><br><br>
					Enter Name    :
					<input type="text" name="name" class="in" required><br>
					<br>
					Designation   :
					<input type="text" name="desg" class="in" required><br>
					<br>
					Enter Salary  :
					<input type="text" name="salary" class="in" required><br>
					<br><input type="Submit" value="update" name="button">
			</form>
	</div>


</center>
</body>
</html>