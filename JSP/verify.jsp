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
String pwd=request.getParameter("pwd1");
String age=request.getParameter("age");
String gen=request.getParameter("gen");
if(name==("")&& pwd==("") && age==("")&& gen==(""))
{
	out.print("Hi,Please enter valid details");
}
else
{
	out.print("Hi,Resigration success");
}
%>
 
</body>
</html>