<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Product items</h1>

<%
String name=request.getParameter("uname");
Cookie cookie[] = request.getCookies();
String nam = cookie[1].getValue().toString();

out.println("<h1> Hi "+nam+" !!! </h1>");
%>

<a href="Profile.jsp">Profile Page</a>
</body>
</html>