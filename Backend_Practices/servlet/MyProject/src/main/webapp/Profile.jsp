<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>

<center>

<%

String name = request.getParameter("uname");
out.println("<h1>Thankyou For Login</h1><h2> <a style=text-decoration:none href=LoginCred.jsp>Logout</a></h2>");


%>

</center>

</body>
</html>