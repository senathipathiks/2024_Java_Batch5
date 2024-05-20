<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	
	<form action="UserDetails" method="get">
			
		Name <input type="text" name="uname">
		Age <input type="number" name="uage">
		Phnum <input type="number" name="uph">
		Email <input type="email" name="uemail">
		Password <input type="password" name="upass">		
		
		<input type="Submit" value="Register"> 
	
	</form>
</body>
</html>