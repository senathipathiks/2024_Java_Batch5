<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="Navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Page</title>
<link rel="stylesheet" href="Style.css">

</head>

<body>



<center>

<h2 id="con">Enter Student ID to Delete</h2><br><br>


<form action="MainServlet" method="get">
<input type="text" name="id"><br><br>
<input type="submit" value="Delete" name="button">
</form>

</center>

</body>
</html>