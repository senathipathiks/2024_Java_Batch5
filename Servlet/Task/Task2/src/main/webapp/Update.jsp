<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>


	<center>
		
			<h2>Employee Update Form</h2>

				<form action="Controller" method="get">
				
				    <label for="number">Employee Id:</label>
				    <input type="number" id="id" name="id" required><br><br>
				    
				    <label for="name">Employee Name:</label>
				    <input type="text" id="name" name="name" required><br><br>
				    
				    <label for="email">Email:</label>
				    <input type="email" id="email" name="email" required><br><br>
				    
				    <label for="password">Password:</label>
				    <input type="password" id="pass" name="pass" required><br><br>
				    				    				    
				    <input type="submit" value="Update" name="Insert">
				</form>

		</center>

</body>
</html>