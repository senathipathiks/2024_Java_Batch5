<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="LoginNavbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>Courier Management System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style>
body{
background-image: linear-gradient(#0f0c29,#302b63,#24243e);
background-repeat:no-repeat;
background-size: cover;
background-attachment:fixed;
}
@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
body{
text-decoration:none;
color:white;
  animation-name: ani;
  animation-duration: 3s;
  animation-timing-function: ease;
  animation-direction: forwards;
  animation-iteration-count: 1;
}
p{
text-decoration:none;
color:white;
  animation-name: ani;
  animation-duration: 2s;
  animation-timing-function: ease;
  animation-direction: forwards;
  animation-iteration-count: infinite;
}
a:hover{
transform:scale(1.01);
}
h1,td{
color:white;
}
</style>

</head>
<body>
<form action="Welcome.jsp" name="Fform" onsubmit="return check();" class="container" method="post">
<h1 align="center" class="display-4">Login</h1>
<hr>
<table align="center">
	<tr>
		<td class="display-6">
			Username<br>
		</td>
		</tr>
		<tr>
		<td id="in">
			<input type="text" name="uname"><br>
		</td>
	</tr>
	<tr>
		<td class="display-6">
			Password<br>
		</td>
		</tr>
		<tr>
		<td id="in">
			<input type="password" name="pass"><br>
		</td>
	</tr>
</table><br>
<div class="text-center">
			<input type="submit" class="btn btn-success" name="button" value="Login">
</div>
</form>
</body>
</html>