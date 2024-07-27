<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

<%
String name = request.getParameter("uname");
String pwd = request.getParameter("pwd");

if((name.equals("Gokul Anand") && pwd.equals("123")))
{
	out.println("<h1>Hii" +name+ "!!!</h1>");
}
else
{
	out.println("<h1>Hii Guest </h1>");
}

%>

<h1> Welcome to Inbox !</h1>
</body>
</html>