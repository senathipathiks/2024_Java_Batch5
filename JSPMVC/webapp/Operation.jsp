<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Operation</title>
<style>
a{
 text-decoration:none;
 color:red;
 
}

button{
	width:80px;
	height:30px;
	color:red;
	
}

</style>
</head>
<body>
<center>

<button type="submit" class="btn btn-primary-dark" name="b1"><a href="insert.jsp" target="frame3">Insert</a></button><br> <br>
<button type="submit" class="btn btn-primary-dark" name="b1"><a href="delete.jsp"  target="frame3">Delete</a></button><br> <br>
<button type="submit" class="btn btn-primary-dark" name="b1"><a href="update.jsp" target="frame3" >Update</a></button><br> <br>
<button type="submit" class="btn btn-primary-dark" name="b1"><a href="find.jsp" target="frame3" >Find</a></button><br> <br>
<form action="MainServletController" target="frame3" method="post">
<button type="submit" value="display" class="btn btn-primary-dark" name="button" >Display</button>
</form>
</center>
</body>
</html>