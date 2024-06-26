<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
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
	width: 40%;
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
<script>
	
</script>
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
		<form class="mx-auto" action="Fetch1" method="post"
			modelAttribute="bean">
			<h1>Find by ID</h1>
			<select class="form-select" name="FlightId" aria-label="Select ID">
				<option selected>Select ID</option>
				<c:forEach items="${idList}" var="id">
					<option value="${id}">${id}</option>
				</c:forEach>
			</select>


			<button type="submit" class="btn btn-primary mt-4" value="Fetch1"
				name="button">Fetch</button>
		</form>
		<center>
			<form>
				<h4 class="text-center">Fetched Records...</h4>
				<div class="mb-1 mt-1">
					<label  class="form-label"> Flight
						Id</label> <input type="text" name="flightId" class="form-control"
						placeholder="ID" aria-describedby="emailHelp"
						value=${f.getFlightId() } readonly>

					<div class="mb-1">
						<label  class="form-label">Flight
							Name</label> <input type="text" name="flightName" class="form-control"
							value=${f.getFlightName() } required>

					</div>
					<div class="mb-1">
						<label  class="form-label">Source
						</label> <input type="text" name="source" class="form-control"
							value=${f.getSource() } required>

					</div>
					<div class="mb-1">
						<label  class="form-label">Destination
						</label> <input type="text" name="destination" class="form-control"
							value=${f.getDestination() } required>

					</div>
					<div class="mb-1">
						<label  class="form-label">TicketCost
						</label> <input type="text" name="ticketCost" class="form-control"
							value=${f.getTicketCost() } required>
			</form>
		</center>

	</div>


</body>

</html>