<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<style>
form
{
margin-top:150px;
}
</style>
<body>
<form align="center" action="ControllerServlet" method="get">
Employee Id : <input type="number" name="id">
<br>
<br>
Employee Name : <input type="text" name="name">
<br>
<br>
Designation : <input type="text" name="desig">
<br>
<br>
Department : <input type="text" name="depart">
<br>
<br>
<input type="submit" class="btn btn-info" value="Update" name="button">
</form>
</body>
</html>