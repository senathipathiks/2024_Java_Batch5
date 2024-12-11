<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<%
String name = request.getParameter("uname");
out.println("<h1> Thank you !! "+name+"</h1>");
out.println("<a style=text-decoration:none  href = LoginCheck.jsp?uname="+name+" ><h4>Logout</h4></a>");
%>

</center>
</body>
</html>