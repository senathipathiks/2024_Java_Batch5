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
<h1 align="center">Employee Details</h1>
<hr>
<table>
	<tr>
		<td>
			Enter the Employee ID to view details:
		</td>
		<td>
			<input type="number" name="id">
		</td>
	</tr>
	<tr>
		<td>
			<input type="submit" name="button" value="Find">
		</td>
	</tr>
</table>
</form>
</body>
</html>