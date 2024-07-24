<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Navbar.jsp" %>
	
<%@taglib prefix="c" uri="jakarta.tags.core"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://fonts.googleapis.com/css? family=Open+Sans:300, 400, 700"
	rel="stylesheet" type="text/css" />

<style type="text/css">
@charset "UTf-8";

@import
url(https://fonts.googleapis.com/css?font-family=
"Open+Sans:300, 400, 700"
);

body {
	/* background-image:
		url('https://images.pexels.com/photos/2781814/pexels-photo-2781814.jpeg?auto=compress&cs=tinysrgb&w=600');
	background-attachment: fixed;
	background-position: center;
	background-size: 100% 100%; */
	 height: 100vh;
    margin: 0;
    background-size: 400% 400%;
    background-image: linear-gradient(45deg, #800080 0%, #E6E6FA 25%, #E6E6FA 50%, #800080 75%, #800080 100%);
    animation: gradient 15s ease infinite;
	font-family: "Open Sans", sans-serif;
	font-weight: 300;
	line-height: 1.42em;
	color: #black;
}



@keyframes gradient {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}

h1 {
	font-size: 3em;
	font-weight: 300;
	text-align: center;
	display: block;
	line-height: 1em;
	padding-bottom: 2em;
	color: #FB667A;
}

h2 a {
	font-weight: 700;
	text-transform: uppercase;
	color: #FB667A;
	text-decoration: none;
}

.blue {
	color: #185875;
}

.yellow {
	color: #FfF842;
}

.container th h1 {
	font-weight: bold;
	font-size: 1em;
	text-align: left;
	color: white;
}

.container td {
	font-weight: normal;
	font-size: 1em;
	-webkit-box-shadow: 0 2px 2px-2px #0E1119;
	-moz-box-shadow: 0 2px 2px -2px #0E1119;
	box-shadow: 0 2px 2px -2px #0E1119;
}

#maindiv .container {
	text-align: left;
	overflow: hidden;
	width: 60%;
	margin: 0 auto;
	display: table;
	padding: 0 0 4em 0;
	padding-top:10%;
	
}

.container td, .container th {
	padding-bottom: 2%;
	padding-top: 2%;
	padding-left: 2%;
}
/*Background-color of the odd rows */
.container tr:nth-child(odd) {
	background-color: #f8f7f7;
}
/*Background-color of the even rows*/
.container tr:nth-child(even) {
	background-color: #f8f7f7;
}

.container th {
	background-color: #1F2739;
}

.container td:first-child {
	color: red;
}

@media ( max-width : 800px) {
	.container td:nth-child(4), .container th:nth-child(4) {
		display: none;
	}
}
}
</style>

</head>
<body>

<div id="maindiv">
	<table class="container">
		<thead>
			<tr>
				<th><h1>Student ID</h1></th>
				<th><h1>Student Name</h1></th>
				<th><h1>Student City</h1></th>

			</tr>
		</thead>
		<c:forEach items="${students}" var="stu">
			<tr>
				<td>${stu.getStudid()}</td>
				<td>${stu.getStudName()}</td>
				<td>${stu.getStudCity()}</td>
				

			</tr>
		</c:forEach>
	</table></div>
</body>
</html>