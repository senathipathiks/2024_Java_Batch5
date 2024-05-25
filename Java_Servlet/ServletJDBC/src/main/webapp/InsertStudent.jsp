<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="JdbcMainServlet" method="post">
	    <h1 id="head1">Insert Studnent Details</h1>
	    ID *
	    <input type="text" name="id" required><br>
	    Name * : 
	    <input type="text" name="name" class="in" required><br>
	    City * : 
	    <input type="text" name="city" class="in" required><br>
	    Mobile * : 
	    <input type="text" name="mobile" class="in" required><br>
	    <input type="Submit" value="Insert" name="action">
    </form>
</body>
</html>