
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<h1>Student Details</h1>
<table  border="1" >
<tr>
<th>Student Id</th>
<th>Student Name</th>
<th>Student City</th>
</tr>
<tr>
<c:forEach items="${Studlist}" var="stud">
<td>${stud.getSid()}</td>
<td>${stud.getSname()}</td>
<td>${stud.getScity()}</td>
</tr>
</c:forEach>
</table>
</form>
 
 
</body>
</html>