<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

<style>
h1{
color:white;
}
body{
background-image: linear-gradient(#0f0c29,#302b63,#24243e);
background-repeat:no-repeat;
background-size: cover;
background-attachment: fixed;
}
@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
td{
color:white;}
a{
text-decoration:none;
color:white;
 
}
a:hover{
transform:scale(1.01);
}
</style>
<script>

function check(){
var uid = document.forms["Insform"]["uid"].value;
var uname = document.forms["Insform"]["uname"].value;
var cid = document.forms["Insform"]["cid"].value;
var uadd = document.forms["Insform"]["uadd"].value;
var dest = document.forms["Insform"]["dest"].value;
var rname = document.forms["Insform"]["recname"].value;
if(uid === "" || uname === "" || cid === "" || uadd === "" || dest === "" || rname === ""){
	alert("All fields are required!!!");
	event.preventDefault();
}
}
</script>
</head>
<body>
<form action="CmsController" onsubmit="return check();" name="Insform" class="container" method="post">
<h1 class="display-4 table-head" align="center">Registration Form</h1>
<hr>
<table class="table text-center table-light">
	<tr>
		<td>
			User ID:
		</td>
		<td>
			<input type="number" name="uid">
		</td>
	</tr>
	<tr>
		<td>
			User Name:
		</td>
		<td>
			<input type="text" name="uname">
		</td>
	</tr>
	<tr>
		<td>
			Courier ID:
		</td>
		<td>
			<input type="number" name="cid">
		</td>
	</tr>
	<tr>
		<td>
			User Address:
		</td>
		<td>
			<input type="text" name="uadd">
		</td>
	</tr>
	<tr>
		<td>
			Destination Address:
		</td>
		<td>
			<input type="text" name="dest">
		</td>
	</tr>
	<tr>
		<td>
			Receiver Name:
		</td>
		<td>
			<input type="text" name="recname">
		</td>
	</tr>
</table>
<div class="text-center">
			<input type="submit" onclick="check()" class="btn btn-success" name="button" value="Insert">
</div>


</form>
</body>
</html>