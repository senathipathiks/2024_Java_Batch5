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
</head>
<body>
<nav class="navbar navbar-expand-lg bg-transparent">
  <div class="container-fluid">
    <a style="color:white" class="navbar-brand" href="Welcome.jsp">Courier Management System</a>
    <button style="background-color:white;" class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse justify-content-end" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a style="color:white"  class="nav-link active" aria-current="page" href="Track.jsp">Track Courier</a>
        <a style="color:white"  class="nav-link " href="Insert.jsp">Insert</a>
        <a style="color:white"  class="nav-link " href="Update.jsp">Update</a>
        <a style="color:white"  class="nav-link " href="Delete.jsp">Delete</a>
        <a style="color:white"  class="nav-link " href="Find.jsp">Find</a>        
        <a style="color:white"  class="nav-link " href="ViewAll.jsp">View All</a>
        <a style="color:white"  class="nav-link " href="About.jsp">About Us</a>
        
      </div>
    </div>
  </div>
</nav>
</body>
</html>