<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<link rel="stylesheet" href="style.css">
<title>Login</title>
</head>

<body>
	<div class="container-fluid">
		<form class="mx-auto" action="Insertion" method="post"
			modelAttribute="bean">
			<h4 class="text-center">Insert</h4>
			<div class="mb-1">
				<label class="form-label">Flight Name</label> <input type="text"
					name="flightName" class="form-control" required>

			</div>
			<div class="mb-1">
				<label class="form-label">Source </label> <input type="text"
					name="source" class="form-control" required>

			</div>
			<div class="mb-1">
				<label class="form-label">Destination </label> <input type="text"
					name="destination" class="form-control" required>

			</div>
			<div class="mb-1">
				<label class="form-label">TicketCost </label> <input type="text"
					name="ticketCost" class="form-control" required>

			</div>

			<button type="submit" class="btn btn-primary mt-4" value="Insert"
				name="button">Insert</button>
			<%
			String result = (String) request.getAttribute("Action");

			if (result != null) {

				if (result.equals("Success")) {
					out.print("<h5><font color=green>Insertion Operation is Successfully Done</font></h5>");
				} else {
					out.print("<h5><font color=red>Insertion Operation is Failure</font></h5></div>");
				}

			}
			%>
		</form>
	</div>
</body>

</html>