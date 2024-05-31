<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find</title>
<style>
div{
	border: solid 2px transparent;
	width: 60%;
    padding-bottom: 3%;
	background-color: rgb(100, 254, 233);
	box-shadow: 15px 9px 10px 3px rgba(51, 117, 72, 0.651)
}
</style>

</head>
<body>
<center>
	<div>
		<form action="JdbcMainservlet" method="get">
			<h1>Find Employee by ID</h1>
			ID               : 
					<input type="text" name="id" class="in" required>
					<br><input type="Submit" value="Find" name="search">
			</form>
	</div>


</center>
</body>
</html>