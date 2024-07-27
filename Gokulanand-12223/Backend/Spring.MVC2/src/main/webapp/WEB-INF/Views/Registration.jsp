<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>

<form align="center" action="register">
<table border=5 align="center">
<tr>
<td>First Name  </td>
<td><input type="text" name="fname"> </td>
</tr>
<tr>
<td>Last Name  </td>
<td><input type="text" name="lname"> </td>
</tr>
<tr>
<td>Email </td>
<td><input type="email" name="email"> </td>
</tr>
<tr>
<td>Blood Group </td>
<td><input type="text" name="bgroup"> </td>
</tr>
<tr>
<td><input type="submit" class="btn btn-success" name="Submit"></td>
</tr>
</table>
</form>

</body>
</html>