<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send</title>
</head>
<body>

<center>
<!-- <h1>Welcome ${param.uname}</h1>-->

<%

String name = request.getParameter("uname");
out.println("<center><h1> Hi " + name + "</h1><h2> Welcome to the Send Page </h2><h3> Click Profile to get into Profile Page</h3><h2> <a style=text-decoration:none href=Profile.jsp?uname="+name+">Profile</a></h2></center>");

%>
</center>
</body>
</html>