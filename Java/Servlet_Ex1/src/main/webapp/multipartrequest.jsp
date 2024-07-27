<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ page import="java.sql.*,com.oreilly.servlet.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	MultipartRequest m = new MultipartRequest(request,"D:/L1/Servlet_Ex1/src/main/webapp/Uploads");
	out.println("File uploaded Successfully!!!");
%>
</body>
</html>