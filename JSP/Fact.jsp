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
int n = Integer.parseInt(request.getParameter("num"));
int fact = 1;
for(int i=1;i<=n;i++){
	fact=fact*i;
	out.print(i+"factorial is "+fact);
%>
<br>
<%
}
%>
</body>
</html>