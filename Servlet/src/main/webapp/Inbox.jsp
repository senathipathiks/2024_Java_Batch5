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
session.setAttribute("name", name);
out.print("<h1>Hi </h1>"+name+" \n");

Cookie cookie[] = request.getCookies();
out.println("cookie name : "+cookie[0].getValue());
%>
<h1>Welcome to inbox</h1>
<a href="SentItems.jsp?">Move to SentItems</a>
</body>
</html>