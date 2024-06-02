<%@page import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request"%>
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
String s =request.getParameter("sum");

int x =Integer.parseInt(request.getParameter("num1"));
int y =Integer.parseInt(request.getParameter("num2"));

if(s.equals("+"))
	out.print("ANSWER: "+ (x+y));
else if(s.equals("-"))
	out.print("ANSWER: "+ (x-y));
else if(s.equals("x"))
	out.print("ANSWER: "+ x*y);
else if(s.equals("/"))
	out.print("ANSWER: "+ x/y);
%>

</body>
</html>