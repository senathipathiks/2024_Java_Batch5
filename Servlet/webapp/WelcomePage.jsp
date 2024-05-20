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
	String name = request.getParameter("message");
	out.println("Hi "+name);
%>
	<p> Welcome ${param.message} to your Inbox! </p>
</body>
</html>