<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
#content{
position: fixed;
  inset: 0;
  width: fit-content;
  height: fit-content;
  margin: auto;
}

@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
a{
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
</style>
</head>
<body>
<div align="center" id="content">

<a href="About.jsp"><h1 class="display-2 text-center">Courier Management System</h1></a>
<p class="fs-5 text-bold text-center">Delivering Excellence, Every Mile!</p>
</div>
</body>
</html>