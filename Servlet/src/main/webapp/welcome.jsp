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
	String name1 = request.getParameter("uname");
	out.println("Hi" + name1);
	%>
	<h1>Welcome to your Inbox</h1>
	<%
	out.println();
	%>
	<%
	out.print("hi  hello");
	%>
	

</body>
</html>

