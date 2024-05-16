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
String name = (String)request.getParameter("uname");
out.println("<h1>Hi "+"<font color = red>"+name+"</font>");
%>
<p>welcome to inbox page</p>
<a href="sent1.jsp?uname=<%=name %>">SentItemPage</a>
</body>
</html>