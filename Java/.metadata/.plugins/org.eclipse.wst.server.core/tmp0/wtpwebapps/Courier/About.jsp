<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
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
p{
color:white;}
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
}
</style>
<style>
body{
background-attachment: fixed;
background-repeat: no-repeat;
background-size: cover;
}
#img{

width:500px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<p class="display-1 text-center">About us</p>
<div class="row">
<div class="col-md-6 align-content-center">
<img id="img" src="About.jpg">
</div>

<div class="col-md-6 align-content-center">
<p>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A courier delivery management system, or CMS, is business software that simplifies courier management and routing. A CMS streamlines all of the following tasks:

Planning and optimizing delivery routes
Courier tracking and scheduling
Analyzing courier performance
Package tracking during delivery service
Updating customers
Manual planning and routing are time-consuming processes. It's hard to isolate the optimal route across cities with thousands of different roads. It's nearly impossible to do this well when you need to calculate hundreds or thousands of stops. This is known as the traveling salesman problem and it's what courier management systems set out to solve.



</p>
</div>

</div>
</div>
</body>
</html>