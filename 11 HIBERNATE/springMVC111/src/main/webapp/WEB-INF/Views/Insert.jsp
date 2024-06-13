<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Insert" method="get" modelAttribute="bean">
		<h1>INSERTION</h1>
		Enter the Student Name :<input type="text" placeholder="Name"
			name="sname" required><br> Enter the Student Address :<input
			type="text" placeholder="Address" name="address" required><br>
		Enter the Student Department :<input type="text"
			placeholder="Department" name="Department" required><br>
		<input type="submit" name="ins" value="insert">
	</form>
	<%
	String result = (String) request.getAttribute("Action");

	if (result != null) {

		if (result.equals("Success")) {
			out.print("<h3><font color=green>Insertion Operation is Successfully Done</font></h3>");
		} else {
			out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
		}

	}
	%>
</body>
</html>