<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Page</title>
<link href="styles.css" rel="stylesheet" media="all" />
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.
min.css" rel="stylesheet" integrity="sha384-
QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
crossorigin="anonymous">
<script
src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bu
ndle.min.js" integrity="sha384-
YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
crossorigin="anonymous"></script>
</head>

<style>
th, td {
  border: 1px solid black;
}
</style>

<body>
<form align = "center">
	
<table align = "center">
  <h1 style="font-family: sans-serif;">Student Details</h1>
  <thead>
    <tr>
      <th>STUDENT_ID</th>
      <th>STUDENT_NAME</th>
      <th>STUDENT_CITY</th>
    <tr>
  </thead>
  <tbody>
  <c:forEach items="${Stu}" var="pro" >
    <tr>
      <td>${pro.getId() }</td>
      <td>${pro.getName() }</td>
      <td>${pro.getCity() }</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</form>
</body>
</html>