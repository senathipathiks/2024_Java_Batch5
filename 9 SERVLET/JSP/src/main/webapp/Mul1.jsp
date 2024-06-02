<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<h1>Multiplication Table:</h1>
<%
	int x = Integer.parseInt(request.getParameter("num"));
	int i = 1;
	while(i<11){
		out.print(i+" x "+ x +" = "+(i*x)); %><br></br>
		<%
		i++;
	}
%>
</center>
</body>
</html>