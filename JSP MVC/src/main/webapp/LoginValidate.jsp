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

String n = request.getParameter("name");
String p = request.getParameter("pass");
if(n.equals("Aravind") && p.equals("Aravind2@")){
	response.sendRedirect("Home.jsp");
}
else{
	response.sendRedirect("Display.jsp");
}
%>

</body>
</html>