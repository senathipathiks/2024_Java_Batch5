<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		String name = request.getParameter("message");
		out.println("<h1>Welcome "
			+ name 
			+ "</h1>"
			+ "<h1>Welcome to Profile Page</h1>"
			+ "<a href=LoginRedirect.jsp>Logout</a>"
		);
	%>
</body>
</html>