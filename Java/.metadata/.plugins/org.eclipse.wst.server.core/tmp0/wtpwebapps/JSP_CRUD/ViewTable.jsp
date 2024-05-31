<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.lms.dao.LmsDao,java.sql.ResultSet, java.sql.ResultSetMetaData"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="LmsController">
<h1 align="center">Employee Details</h1>
<%
LmsDao dao = new LmsDao();
out.println("<table><th><td>Employee ID</td><td>Employee Name</td><td>Employee Designation</td><td>Employee Department</td></th></table>");
out.println("");
%>
</form>
</body>
</html>