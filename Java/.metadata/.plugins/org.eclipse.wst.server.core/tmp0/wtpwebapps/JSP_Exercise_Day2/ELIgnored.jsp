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
RequestDispatcher rd = request.getRequestDispatcher("Simple.jsp");
request.setAttribute("uname","Nagarjun");
rd.forward(request, response);
%>
</body>
</html>