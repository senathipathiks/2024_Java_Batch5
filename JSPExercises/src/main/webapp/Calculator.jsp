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
int add(int a,int b)
{
	return a+b;
}

int sub(int a,int b)
{
	return a-b;
}

int mul(int a,int b)
{
	return a*b;
}

int div(int a,int b)
{
	return a/b;
}
%>

<%= "After addition: "+add(10,20)%><br>
<%="Subtraction: "+sub(20,10) %><br>
<%="Multiplication: "+mul(2,2) %><br>
<%="Division: "+div(9,3) %><br>

</body>
</html>