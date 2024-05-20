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
String name=request.getParameter("uname");
out.print("Hi " +name);
%>
<h1>Welcome to Send Item </h1>
<a href="profile.jsp?uname=<%=name%>">Profile</a>

</body>
</html>