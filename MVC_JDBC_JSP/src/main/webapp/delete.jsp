<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- <html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="MainServlets" method="get">
Enter EmpId : <input type="text" name="deleteid"><br><br>

<input type="submit" value="delete" name="button">
</form>
</html> -->
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
	setTimeout(function() {
		document.querySelector('h1').style.display = 'none';
	}, 5000)
	
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
		<form class="mx-auto" action="MainServlets" method="get">
			<h4 class="text-center">Delete</h4>
			<div class="mb-1 mt-1">
				<label for="exampleInputEmail1" class="form-label">Enter
					EmpID</label> <input type="text" name="deleteid" class="form-control"
					id="InputEmail" aria-describedby="emailHelp">
				<p id="on"></p>
			</div>
			

			<button type="submit" class="btn btn-primary mt-4" value="delete" name="button">Delete</button>
		</form>
	</div>

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>


</body>

</html>