<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">

<head>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@200&display=swap')
	;

* {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

body {
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(75, 14, 154, 1) 35%, rgba(0, 212, 255, 1) 100%);
	font-family: 'poppins', sans-serif;
}

form {
	width: 60%;
	background-color: white;
	padding: 30px;
	border-radius: 20px;
	margin-top: 40px;
}

.btn-primary {
	width: 100%;
	border: none;
	border-radius: 50px;
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(75, 14, 154, 1) 35%, rgba(0, 212, 255, 1) 100%);
}

.form-control {
	color: rgba(0, 0, 0, .87);
	border-bottom-color: rgba(0, 0, 0, .42);
	box-shadow: none;
	/* border: none; */
	border: 2px solid;
	border-radius: 4px 4px;
}

h4 {
	font-size: 2rem !important;
	font-weight: 700;
}

.form-label {
	font-family: 800 !important;
}

a {
	text-decoration: none;
	font-weight: 800;
}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Login</title>
</head>

<body>
	<div class="container-fluid">
		<center><form>
<table border="1" align="center" class="table table-bordered table-striped">
		<tr id="one"><h1>Flight table records<h1></tr>
            <tr>
            	<th>Flight ID</th>
            	<th>Flight Name</th>
            	<th>Source</th>
            	<th>Destination</th>
            	<th>TicketCost</th>
           	</tr>
           	
           	<c:forEach items="${flightlist}" var="f">
           	<tr>
           		<td>${f.getFlightId() }</td>
           		<td>${f.getFlightName() }</td>
           		<td>${f.getSource() }</td>
           		<td>${f.getDestination() }</td>
           		<td>${f.getTicketCost() }</td>           		
			</tr>
			</c:forEach>
			
</table>
</form>
</center>

	</div>

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>


</body>

</html>