<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Filter.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="JdbcMainservlet" method="post">
<h1>Filter Employee by Designation</h1>
Designation              : 
	    <input type="text" name="desg" class="in" required>
	    <br><input type="Submit" value="Filter" name="button">
</form>

</center>
</body>
</html>