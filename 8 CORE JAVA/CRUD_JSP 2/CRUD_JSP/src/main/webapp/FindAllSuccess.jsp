<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="com.jsp.bean.Donor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {
 background-image: url("12.jpg");
 background-color: #cccccc;
	height: 100%;

  /* Center and scale the image nicely */
  
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body>
<center>

<b><h1>Donor Table</h1><b><br>
<table border="1">
<tr>
<th>Donor ID</th>
<th>Donor Name</th>
<th>Donor Blood Group</th>
<th>Donor Phone Number</th>
</tr>
<c:forEach var="doner" items="${list}">
<tr>
<td>${doner.donorid}</td>
<td>${doner.donorname}</td>
<td>${doner.donorbg}</td>
<td>${doner.donorphoneno}</td>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>