<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form id="accesspanel" method="post" modelAttribute="bean" action="LoginValidate">
		<div class="container">
			<div class="box">
				<h1>Login</h1>
				<div class="user">
					<i class="fas fa-user"></i> 
					<input type="text" name="name" id="username" placeholder="Full Name" > 
					<i class="fas fa-envelope"></i> 
					<input type="password" name="password" id="email" placeholder="State" value>
				</div>
				<div class="login-btn">
					<button class="btn">
						Login
					</button>
				</div>
			</div>
		</div>
	</form>
	<%
	String result = (String) request.getAttribute("Action");

	if (result != null) {
		if (result.equals("Success")) {
			out.print("<h3><font color=green>Login Successfully</font></h3>");
		} else {
			out.print("<h3><font color=red>Login Failed</font></h3></div>");
		}
	}
	%>
</body>
</html>