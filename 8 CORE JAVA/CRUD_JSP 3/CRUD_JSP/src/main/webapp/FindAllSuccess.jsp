<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.jsp.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table border="1">
<tr>
<th>EmpID</th>
<th>EmpName</th>
<th>EmpDesig</th>
<th>EmpDepartment</th>
</tr>
<c:forEach var="employee" items="${list}">
<tr>
<td>${employee.empId}</td>
<td>${employee.empname}</td>
<td>${employee.empdesig}</td>
<td>${employee.empdept}</td>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>