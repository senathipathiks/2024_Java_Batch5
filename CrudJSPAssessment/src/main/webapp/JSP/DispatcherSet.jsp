<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DispatcherGet.jsp">
<%
RequestDispatcher rd = request.getRequestDispatcher("DispatcherGet.jsp");
request.setAttribute("uname", "Velan");
rd.forward(request,response);
%>
</form>
</body>
</html>