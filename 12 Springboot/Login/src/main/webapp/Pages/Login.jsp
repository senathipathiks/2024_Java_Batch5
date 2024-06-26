<%@page
	import="org.springframework.boot.autoconfigure.flyway.FlywayProperties.Postgresql"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Login</h1>

	<form action="Validate" style="align-content: center" method="post">
		<table align="center" cellpadding="10px">

			<tr>
				<td>Enter the User Name:</td>
				<td><input type="text" placeholder="User Name" name="username" required>
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="pass" placeholder="Password" required>
				</td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="Login"></td>
			</tr>

		</table>
	</form>
	<center>
		<%
		String action = (String) request.getAttribute("Action");
		if (action != null) {
			if (action.equals("Success")) {
				out.print("<h3><font color=green>Login success</font></h3>");
			} else {
				out.print("<h3><font color=red>Login Failure</font></h3></div>");
			}
		}
		%>

	</center>
</body>
</html>