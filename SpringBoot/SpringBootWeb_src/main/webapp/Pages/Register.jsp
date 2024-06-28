<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form id="accesspanel" method="post" modelAttribute="bean" action="RegisterValidate">
		<div class="container">
			<div class="box">
				<h1>Register</h1>
				<div class="user">
					<i class="fas fa-user"></i> 
					<input type="text" name="name" id="username" placeholder="Full Name" > 
					<i class="fas fa-envelope"></i> 
					<input type="password" name="password" id="password" placeholder="State">
					<i class="fas fa-envelope"></i> 
					<input type="password" name="password" id="confirmpassword" placeholder="State">
				</div>
				<div class="login-btn">
					<button class="btn">
						Login
					</button>
				</div>
			</div>
		</div>
	</form>
</body>
</html>