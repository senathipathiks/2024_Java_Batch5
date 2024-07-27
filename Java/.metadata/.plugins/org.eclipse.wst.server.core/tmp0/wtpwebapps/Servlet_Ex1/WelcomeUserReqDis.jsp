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
	String name = (String) request.getParameter("name");
	out.println("Welcome " +name+ " to your Inbox!!!");
%>
<!-- <h1>Welcome ${param.message} to your Inbox!!! </h1>            	This is one way of passing the parameters-->
</body>
</html>