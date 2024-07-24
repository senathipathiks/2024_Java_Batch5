<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@ include file="Navbar.jsp" %>
	
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>

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
	 background-image:
		url('https://images.pexels.com/photos/2976970/pexels-photo-2976970.jpeg?auto=compress&cs=tinysrgb&w=600');
	background-attachment: fixed;
	background-position: center;
	background-size: 100% 100%;
	font-family: "Open Sans", sans-serif;
	font-weight: 300;
	line-height: 1.42em;
	color: #black;
}

h1 {
	font-size: 3em;
	font-weight: 300;
	text-align: center;
	display: block;
	line-height: 1em;
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

.containe th h1 {
	font-weight: bold;
	font-size: 1em;
	text-align: left;
	color: white;
}

.containe td {
	font-weight: normal;
	font-size: 1em;
	-webkit-box-shadow: 0 2px 2px-2px #0E1119;
	-moz-box-shadow: 0 2px 2px -2px #0E1119;
	box-shadow: 0 2px 2px -2px #0E1119;
}

.containe {
	text-align: left;
	overflow: auto;
	padding-top:10%;
	width: 60%;
	margin: 0 auto;
	display: table;
/* 	padding: 0 0 4em 0;
 */}

.containe td, .containe th {
	padding-bottom: 2%;
	padding-top: 2%;
	padding-left: 2%;
}
/*Background-color of the odd rows */
.containe tr:nth-child(odd) {
	background-color: #f8f7f7;
}
/*Background-color of the even rows*/
.containe tr:nth-child(even) {
	background-color: #f8f7f7;
}

.containe th {
	background-color: #1F2739;
}

.containe td:first-child {
	color: red;
}

@media ( max-width : 800px) {
	.containe td:nth-child(4), .containe th:nth-child(4) {
		display: none;
	}
}
}

tbody {
    height: 100px; /* Set your desired height */
    display: inline-block;
    width: 100%;
    overflow: auto;
  }
</style>

</head>
<body>
	<table class="containe" style="overflow-y: auto">
		<thead>
			<tr>
				<th><h1>Booking ID</h1></th>
								<th><h1>User ID</h1></th>
								<th><h1>Room ID</h1></th>
				
				<th><h1>User Name</h1></th>
				<th><h1>Meeting Start Time</h1></th>
				<th><h1>Meeting End Time</h1></th>

			</tr>
		</thead>
		<c:forEach items="${meets}" var="met">
		<tbody>
			<tr>
				<td>${met.getBookingid()}</td>
								<td>${met.getMeetUserid()}</td>
								<td>${met.getMeetRoomid()}</td>
				
				<td>${met.getMeetUserName()}</td>
				<td>${met.getMeetStartTime()}</td>
				<td>${met.getMeetEndTime()}</td>

			</tr></tbody>
		</c:forEach>
	</table>
</body>
</html>