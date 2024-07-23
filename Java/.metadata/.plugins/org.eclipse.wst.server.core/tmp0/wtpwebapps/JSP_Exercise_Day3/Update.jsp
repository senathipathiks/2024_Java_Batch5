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
<meta charset="ISO-8859-1">
<script>

function check(){
var no = document.forms["Uform"]["id"].value;
var name = document.forms["Uform"]["name"].value;
var pos = document.forms["Uform"]["pos"].value;
var dep = document.forms["Uform"]["dep"].value;
if(no === "" || name == "" || pos == "" || dep == ""){
	alert("All fields are required!!!");
	event.preventDefault();
}
}
</script>
<style>
td,h1{
color:white
}
body{
background-image: linear-gradient(#0f0c29,#302b63,#24243e);
background-repeat:no-repeat;
background-size: cover;
height:440px;
background-attachment: fixed;
}

#b1:hover,#b2:hover,#b3:hover,#b4:hover,#b5:hover{
transform:scale(1.01);
}
@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
#cont{
  animation-name: ani;
  animation-duration: 3s;
  animation-timing-function: ease;
  animation-direction: forwards;
  animation-iteration-count: 1;
}
</style>
</head>
<body>

<form action="LmsController" name="Uform" onsubmit="return check();" class="container" method="post">
<h1 align="center" class="display-4">Updation Form</h1>
<hr>
<table class="table table-light">
	<tr>
		<td>
			Employee ID:
		</td>
		<td>
			<input type="number" name="id">
		</td>
	</tr>
	<tr>
		<td>
			Employee Name:
		</td>
		<td>
			<input type="text" name="name">
		</td>
	</tr>
	<tr>
		<td>
			Employee Position:
		</td>
		<td>
			<input type="text" name="pos">
		</td>
	</tr>
	<tr>
		<td>
			Employee Department:
		</td>
		<td>
			<input type="text" name="dep">
		</td>
	</tr>
	
</table>
<div class="text-center">
			<input type="submit" class="btn btn-warning" name="button" value="Update">
	</div>
</form>
</body>
</html>