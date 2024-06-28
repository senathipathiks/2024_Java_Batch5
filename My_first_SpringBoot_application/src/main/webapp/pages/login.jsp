<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1 style="font-style: bold">LOGIN FORM</h1>
		<form action="validate " method="post">
			Username: <input type="text" name="uname"> <br /> <br />
			Password: <input type="text" name="password"><br /> <br />
			<center>
				<input type="submit" value="login">
			</center>
			<br/>
			<br/>


		</form>
	<%
	String action = (String) request.getAttribute("Action");
	if (action != null) {
		out.print(action);

	}
	%>
		</center>
	
</body>
</html>