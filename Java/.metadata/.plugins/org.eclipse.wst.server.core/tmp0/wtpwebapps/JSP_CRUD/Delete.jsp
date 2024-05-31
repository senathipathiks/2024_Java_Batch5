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
<h1 align="center">Removing Details</h1>
<hr>
<table>
	<tr>
		<td>
			Enter the Employee ID to delete details:
		</td>
		<td>
			<input type="number" name="id">
		</td>
	</tr>
	<tr>
		<td>
			<input type="submit" name="button" value="Delete">
		</td>
	</tr>
</table>
</form>
</body>
</html>