<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int mul(int x,int y)
{
return x*x;
}
int add(int x,int y)
{
	return x+y;
}
int sub(int x,int y)
{
	return x-y;
}
int div(int x,int y)
{
	return x/y;
}
%>
<%="Addition:"+add(14,5)%> 
<%="Subraction:"+sub(14,5)%>
<%="Multiplication:"+sub(14,5)%>
<%="Division:"+sub(14,5)%>
<br>

</body>
</html>