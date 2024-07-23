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
	String name = request.getParameter("user1");
	session.setAttribute("name", name);
	
	out.println("Welcome " +name+ " to your Inbox!!!");
	Cookie cookie[] = request.getCookies();
	
	out.println("<center> <h1>Hi "+ cookie[0].getValue()+"!!!</h1></center>");
%>
<!-- <h1>Welcome ${param.message} to your Inbox!!! </h1>            	This is one way of passing the parameters-->
</body>
</html>