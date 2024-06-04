<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<%!
String n3;

%>
<%
int n1 =Integer.parseInt(request.getParameter("num1"));
int n2 =Integer.parseInt(request.getParameter("num2"));
n3 = request.getParameter("sum");

if(n3.equals("Addition"))
{
	out.println(n1+n2);
}
else if(n3.equals("Subtraction"))
{
	out.println(n1-n2);
}
else if(n3.equals("Multiplication"))
{
	out.println(n1*n2);
}
else if(n3.equals("Division"))
{
	out.println(n1/n2);
}
%>
</body>
</html>