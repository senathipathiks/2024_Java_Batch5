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
String pwd=request.getParameter("pwd");
if((name.equals("Supraja")) && (pwd.equals("Admin123")))
{
	RequestDispatcher rd = request.getRequestDispatcher("Loginsuccess.jsp");
	rd.forward(request, response);
}
else
{
	RequestDispatcher rd = request.getRequestDispatcher("Loginfail.jsp");
	rd.forward(request, response);
}

%>
</body>
</html>

