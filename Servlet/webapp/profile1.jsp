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
out.println("<h1>"+name);
%>
<p>welcome to Profile page</p>
<a href="Register.jsp">Logout</a>

</body>
</html>