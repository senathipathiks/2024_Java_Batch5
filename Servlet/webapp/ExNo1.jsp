<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<center>
		<h1>Login Page</h1>
			<form action="AuthServlet" method="get">
				Username : <input type="text" name="uname"> <br> <br>
				Password : <input type="password" name="pwd"> <br> <br>
							<input type="Submit" value="Login"> 
			</form>
	</center>
</body>
</html>