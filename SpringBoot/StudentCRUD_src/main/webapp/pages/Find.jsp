<%@page import="com.karthi.StudentCrudSP.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	@charset "UTf-8";
	@import url(https://fonts.googleapis.com/css?font-family="Open+Sans:300, 400, 700");
	
	body{
		font-family: "Open Sans", sans-serif;
		font-weight: 300;
		line-height: 1.42em;
		color: #black;
		background-image: url("https://media.istockphoto.com/id/1701407934/photo/red-and-blue-lightning-abstract-electrical-background.jpg?s=2048x2048&w=is&k=20&c=ydgSXfFHJ-STO5ch2NAAbE8Ud9Fn8RCO0ee32LomLbE=");
 			background-repeat: no-repeat;
 			background-attachment: fixed;
	}
	h1{
		font-size: 3em;
		font-weight: 300;
		text-align: center;
		display: block;
		line-height: 1em;
		padding-bottom: 2em;
		color: #FB667A;
	
	}
	h2 a{
		font-weight: 700;
		text-transform: uppercase;
		color: #FB667A;
		text-decoration: none;
	
	}
	.blue{color: #185875;}
	.yellow{color: #FfF842;}
	
	.container th h1{
		font-weight: bold;
		font-size: 1em;
		text-align: left;
		color: white;
	
	}
	.container td{
		font-weight: normal;
		font-size: 1em;
		-webkit-box-shadow:0 2px 2px-2px #0E1119;
		-moz-box-shadow:0 2px 2px -2px #0E1119;
		box-shadow: 0 2px 2px -2px #0E1119;
	
	}
	.container{
		text-align: left;
		overflow: hidden;
		width: 80%;
		margin: 0 auto;
		display: table;
		padding: 0 0 8em 0;
	
	}
	.container td, .container th{
		padding-bottom: 2%;
		padding-top: 2%;
		padding-left: 2%;
	
	}
	/*Background-color of the odd rows */
	.container tr:nth-child(odd){
		background-color: #f8f7f7;
	
	}
	/*Background-color of the even rows*/
	.container tr:nth-child(even){
		background-color: #f8f7f7;
	}
	.container th{
		background-color: #1F2739;
	
	}
	.container td:first-child{color: red;}
	
	@media(max-width: 800px){
		.container td:nth-child(4),
		.container th:nth-child(4){display: none;}
	
		}
	}
	.select {
		padding: 20px;
	}
		
</style>
</head>
<body>
    <div class="background-wrap">
	  <div class="background"></div>
	</div>
	<center>
	<form action="Searching" method="post">
		<h1>Find Customer</h1>
		<span style="color: yellow;">ID :</span>
		<select name="id" class="select">
			<option selected>Select ID</option>
			<c:forEach items="${IdList}" var="id">
				<option value="${id}">${id}</option>
			</c:forEach>
		</select> <br>
		<input type="Submit" value="Find" name="button" class="button">
	</form>
	</center>
	<br><br>
	<table class="container">
		<thead>
			<tr>
				<th><h1>Student ID</h1></th>
				<th><h1>Name</h1></th>
				<th><h1>City</h1></th>
			</tr>
		</thead>
			<tr>
				<td> ${student.getId()} </td>
				<td> ${student.getName()} </td>
				<td> ${student.getCity()} </td>
			</tr>
	</table>
	
	<%
	String action = (String) request.getAttribute("Action");

	if (action != null) {

		if (action.equals("Success")) {
		} else {
			out.print("<h3><font color=red>Deletion Operation is Failure</font></h3>");
		}
	}
	%>
	
	
</body>
</html>