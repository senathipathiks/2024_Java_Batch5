<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String name = request.getParameter("uname");
out.println("<h1>Hii" + name + "!!!</h1>");
out.println("<h1>View ur Profile ? Click Profile !");
%>
<body>
<h1 align="center"><a href="Logout.jsp">Profile</a></h1>
</body>
</html>