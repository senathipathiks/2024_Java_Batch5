<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
    <%@page errorPage="LoginError.jsp" isErrorPage="false" isELIgnored="false" buffer="8kb" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
out.print(new Date());
%>

</body>
</html>