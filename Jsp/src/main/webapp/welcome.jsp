<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("uname");
	String pwd = request.getParameter("pwd");
	if ((name.equals("subash")) && (pwd.equals("123"))) {
		out.println("Hi" + name + "!!!");
	} else {
		out.println("Hi Guest welcome");
	}
	%>
</body>
</html>