<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--This is my first JSP Page --%>
<%!String firstname = "Ganapathy";
int square(int x)
{
	return x*x;
}
%>
<%="Square value of 3 is :"+square(3) %>
<br>
<%
out.println("Name :" +firstname);
%>
</body>
</html>