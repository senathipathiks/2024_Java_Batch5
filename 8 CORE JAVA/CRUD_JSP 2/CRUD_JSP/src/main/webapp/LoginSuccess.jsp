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
if(name.equals("Gopi") && pwd.equals("Gopi123"))
{
%>
<jsp:forward page="Index.jsp"></jsp:forward>
<% 	
}
else
{
%>
<jsp:forward page="LoginFailure.jsp"></jsp:forward>
<%
}
%>
</body>
</html>