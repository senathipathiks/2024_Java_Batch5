<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TMS</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style>
body{
background-image: linear-gradient(#200122,#6f0000);
/* background-image: linear-gradient(#0f0c29,#302b63,#24243e); */
background-repeat:no-repeat;
background-size: cover;
height:240px;
background-position: fixed;
}
h1{
margin-top:200px;}

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
<div>
<a href="Insert"><h1 class="display-2 text-center">Tender Management System</h1></a>
</div>
<p class="fs-5 text-center"> <- Select any one of the options to continue</p>
</body>
</html>