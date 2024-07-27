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

<style>
.tab
{
border-radius:50px;
margin-top:250px;
padding:10px 10px 10px 10px;
}
</style>
<body>

<form action="Validation.jsp" class="tab">
<table border=20 align="center">
		<tr><td>First Name : </td> <td><input type="text" name="fname"></td></tr>
		<tr><td>Last Name : </td> <td><input type="text" name="lname"> </td></tr>
		<tr><td>Email    : </td> <td><input type="email" name="mail"> </td></tr>
		<tr><td>UserName : </td> <td><input type="text" name="uname"> </td></tr> 
		<tr><td>Password : </td> <td><input type="password" name="pwd"> </td></tr>
		<tr><td><input type="submit" class="btn btn-success" value="Register"> </td> </tr>
</table>
</form>
</body>
</html>