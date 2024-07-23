<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

<style>
h1,p,th,td{
color:white
}
body{
background-image: linear-gradient(#200122,#6f0000);
background-repeat:no-repeat;
background-size: cover;
height:440px;
background-attachment: fixed;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<form align="center" class="container" action="ViewAll" method="post">
<h1>Tender Details</h1>
<table border="1" class="table table-hover">
<tr>
	<th scope="col">Tender ID</th>
	<th scope="col">Tender Name</th>
	<th scope="col">Tender City</th>
	<th scope="col">Tender Budget</th>
	<th scope="col">Tender Description</th>
	<th scope="col">Tender Owner</th>
</tr>

	<c:forEach items="${TendList}" var="tend">
		<tr>
			<td>${tend.getTid() }</td>
			<td>${tend.getTname() }</td>
			<td>${tend.getTcity() }</td>
			<td>${tend.getTbudget() }</td>
			<td>${tend.getTdesc() }</td>
			<td>${tend.getTowner() }</td>
		</tr>
	</c:forEach>
</table>
</form>
</body>
</html>