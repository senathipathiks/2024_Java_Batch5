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
Enter EmpId : <input type="text" name="id"><br><br>
Enter EmpName : <input type="text" name="uname"><br><br>
Enter EmpDesig : <input type="text" name="desig"><br><br>
Enter EmpDept : <input type="text" name="dept"><br><br>
<input type="submit" value="update" name="button">
</form>
</body>
</html> -->
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
	setTimeout(function() {
		document.querySelector('h1').style.display = 'none';
	}, 5000)
	function emailvalidation() {

		var validRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
		var email1 = document.getElementById("InputEmail").value;

		if (email1 == "") {

			document.getElementById("InputEmail").style.borderColor = "red";
			document.getElementById("on").innerHTML = "Enter the email";
			document.getElementById("InputEmail").focus();
		} else if (!email1.match(validRegex)) {

			document.getElementById("InputEmail").style.borderColor = "red";
			document.getElementById("InputEmail").focus();

		} else {
			document.getElementById("InputEmail").style.borderColor = "green";
		}
	}
	function passwordvalidation() {
		var regex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\-+.]).{6,20}$/;
		var password1 = document.getElementById("InputPassword").value;

		if (password1 == "") {
			document.getElementById("InputPassword").style.borderColor = "red";
			document.getElementById("Inputpassword").focus();
		}
		if (!password1.match(regex)) {

			document.getElementById("InputPassword").style.borderColor = "red";
			document.getElementById("InputPassword").focus();
		}
		if (password1.match(regex)) {
			document.getElementById("InputPassword").style.borderColor = "green";

		}

	}
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
			<h4 class="text-center">Update</h4>
			<div class="mb-1 mt-1">
				<label for="exampleInputEmail1" class="form-label">Enter
					EmpID</label> <input type="text" name="id" class="form-control"
					id="InputEmail" aria-describedby="emailHelp">
				<p id="on"></p>
			</div>
			<div class="mb-1">
				<label for="exampleInputPassword1" class="form-label">Enter
					Name</label> <input type="text" name="uname" class="form-control"
					id="InputPassword">

			</div>
			<div class="mb-1">
				<label for="exampleInputPassword1" class="form-label">Enter
					Designation</label> <input type="text" name="desig" class="form-control"
					id="InputPassword">

			</div>
			<div class="mb-1">
				<label for="exampleInputPassword1" class="form-label">Enter
					Department</label> <input type="text" name="dept" class="form-control"
					id="InputPassword">

			</div>

			<button type="submit" class="btn btn-primary mt-4" value="update"
				name="button">Update</button>
		</form>
	</div>

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>


</body>

</html>