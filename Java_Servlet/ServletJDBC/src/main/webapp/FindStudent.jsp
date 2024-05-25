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
	    <h1 id="head1">Find Studnent Details by ID</h1>
	    Enter Student ID *
	    <input type="text" name="id" required><br>
	    <input type="Submit" value="Find" name="action">
    </form>
</body>
</html>