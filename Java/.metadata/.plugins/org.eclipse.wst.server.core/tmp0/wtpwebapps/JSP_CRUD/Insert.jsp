<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LmsController" method="post">
<h1 align="center">Registration Form</h1>
<hr>
<table>
	<tr>
		<td>
			Employee ID:
		</td>
		<td>
			<input type="text" name="id">
		</td>
	</tr>
	<tr>
		<td>
			Employee Name:
		</td>
		<td>
			<input type="text" name="name">
		</td>
	</tr>
	<tr>
		<td>
			Employee Position:
		</td>
		<td>
			<input type="text" name="pos">
		</td>
	</tr>
	<tr>
		<td>
			Employee Department:
		</td>
		<td>
			<input type="text" name="dep">
		</td>
	</tr>
	<tr>
		<td>
			<input type="submit" name="button" value="Insert">
		</td>
	</tr>
	
</table>
</form>
</body>
</html>