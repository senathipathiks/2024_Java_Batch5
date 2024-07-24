<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="Navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Student</title>
<link rel="stylesheet" href="Style.css">

</head>

<body>



<center>

<h2 id="con">Enter Student Id to Find</h2><br><br>


<form action="MainServlet" method="get" >
<input type="text" name="id" required>
<br><br>
<input type="submit" name="button" value="Find"><br><br>
</form>

</center>

</body>
</html>