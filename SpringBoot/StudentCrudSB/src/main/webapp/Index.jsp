<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
<style>
 
body{
background-color: rgb(224, 224, 235);}
#div1{
margin-top: 1rem;
font-family: sans-serif;
}
 
#fnt{
font-size: large;
font-family: inherit;
}
img{
margin-left: 10%}
</style>
 
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">SMS</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav" id="fnt">
      <a class="nav-item nav-link text-light" href="insert">INSERT</a>
      <a class="nav-item nav-link text-light" href="delete">DELETE</a>
      <a class="nav-item nav-link text-light" href="update">UPDATE</a>
      <a class="nav-item nav-link text-light" href="search">FIND</a>
      <a class="nav-item nav-link text-light" href="viewall">DISPLAY</a>
    </div>
  </div>
</nav>
<div class="container-fluid" id="div1">
<center><h1>Student Management System</h1></center>
</div>
<div class="Container">
<img alt="" src="Employee.jpg" class="img-fluid">
</div>
</body>
</html>