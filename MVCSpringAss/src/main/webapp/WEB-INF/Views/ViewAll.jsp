<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>
body {
	background-color: aliceblue;
}

h2 {
	color: rgba(15, 77, 134, 255);
}

table {
	background-color: lightpink;
	color: aliceblue;
	padding: 10px 10px;
	border-radius: 20px;
	font-weight: bold;
	font-size: 15px;
	border-width: 8px;
	border-color: white;
	margin-top: 10px;
	margin-left: 10px;
}

table td {
	padding: 10px 10px;
	border-radius: 2px;
	border-width: 2px;
	border-color: white;
}

body {
	background-image:
		url("https://th.bing.com/th/id/OIP.0CxHyuHGnwlkm_199tl1XAHaFY?rs=1&pid=ImgDetMain");
	background-repeat: no-repeat;
	background-size: 1200px 600px;
	color: aliceblue;
}
</style>
</style>
</head>
<body>
	<center>
		<form>
			<h1>Alumni details</h1>

			<table border="2">

				<tr>
					<th><h2>Alumni ID</h2></th>
					<th><h2>Alumni Name</h2></th>
					<th><h2>Alumni Batch</h2></th>
					<th><h2>Alumni Dept</h2></th>
				</tr>
				<tr>
					<c:forEach items="${Alumlist}" var="alum">
						<td><h2>${alum.getAid() }</h2></td>
						<td><h2>${alum.getAname() }</h2></td>
						<td><h2>${alum.getAbatch() }</h2></td>
						<td><h2>${alum.getAdept() }</h2></td>
				</tr>
				</c:forEach>


			</table>
	</center>
	</form>
</body>