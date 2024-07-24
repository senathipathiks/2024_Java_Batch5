<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="Navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<link rel="stylesheet" href="Style.css">

</head>

<body>


<center>

<h2 id="con">Enter Student Details For Updation</h2><br><br>

<form action="MainServlet" method="get">




Enter Student ID:<br><input type="text" name="id"><br><br>
Enter Student Name:<br><input type="text" name="name"><br><br>
Enter Student Email ID:<br><input type="text" name="emailid"><br><br>
Enter Password:<br><input type="text" name="pwd"><br><br>

<input type="submit" name="button" value="Update"><br><br>

</form>
</center>



</body>
</html>