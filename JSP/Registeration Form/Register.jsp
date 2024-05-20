<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<center>
		<h1>Register Page</h1>
		<form action="Valid.jsp" method="get">
			Name : <input type="text" name="name"> <br> <br>
			Age : <input type="text" name="age"> <br> <br>
			Phone Number : <input type="number" name="Phnum"> <br> <br>
			Email : <input type="text" name="email"> <br> <br>
			Password : <input type="password" name="pwd"> <br> <br>
			<input type="Submit" value="Register"> 
		</form>
	</center>
</body>
</html>