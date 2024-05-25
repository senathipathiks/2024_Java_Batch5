<%@page import="javax.servlet.http.Cookie"%>
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
		//Cookie cookie[] = request.getCookies();
		HttpSession s1 = request.getSession();
		String name = s1.getAttribute("uname").toString();
		
		out.println("<h1>Welcome "
			+ name
			+ "</h1>"
			+ "<a href=LoginSendItems.jsp?message=" + name + ">Send Items</a>"
		);
	%>
</body>
</html>