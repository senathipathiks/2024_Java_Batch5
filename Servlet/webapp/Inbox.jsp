<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inbox Page</title>
</head>
<body>
<%
	String name = request.getParameter("uname");
	session.setAttribute("name",name);
	out.println("<h1>Hi</h1>" +name);
	
	out.println("<center><h1>Hi "+name+" "+"Welcome to Inbox Items Page! </h1></center>");
%>
	<center>
		<a style="none" href="SentItems.jsp">Click me to Redirect SendItems!</a>
	</center>
</body>
</html>