<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserDetailsServlet" method="get">
		Enter your Name : <input type="text" name="uname"> <br>
		Enter your Age : <input type="text" name="uage"> <br>
		Enter your Phone Number : <input type="text" name="uphone"> <br>
		Enter your Email : <input type="text" name="uemail"> <br>
		<input type="submit" value="Login">
	</form>
</body>
</html>