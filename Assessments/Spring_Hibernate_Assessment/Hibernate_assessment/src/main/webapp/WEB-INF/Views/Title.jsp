<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style>
body{
background-image: linear-gradient(#200122,#6f0000);
/* background-image: linear-gradient(#00B4DB,#0083B0); */
background-repeat:no-repeat;
background-size: cover;
background-position: fixed;
}
a{
text-decoration:none;
color:white;
}
#title{
color:white;
}
@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
#title{
  animation-name: ani;
  animation-duration: 3s;
  animation-timing-function: ease;
  animation-direction: forwards;
  animation-iteration-count: 1;
}
</style>
<title>TMS</title>
</head>
<body>
<br>
<hr>

<div id="title">
<a href="Welcome" target="frame3"><h1 class="display-5 fs-text-6 text-center">Tender Management System</h1></a>
</div>
<hr>

</body>
</html>