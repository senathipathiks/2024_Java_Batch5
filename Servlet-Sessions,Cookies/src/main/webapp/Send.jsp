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
out.println("<center><h1> Hi "+ name+" Welcome to Profile Page<h1><center>");
out.println
("<center><a style=text-decoration:none href = Profile.jsp?uname="+name+" ><h2>Profile  </h2></a></center>");
%>
</body>
</html>