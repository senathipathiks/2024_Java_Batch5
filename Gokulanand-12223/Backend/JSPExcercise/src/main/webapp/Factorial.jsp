<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>

<%!
int n=1,i;
int fact(int x)
{
	for(i=x; i>0; i--)
	{
		n = n*i;
	}
	return n;
}
%>

<%=
"Factorial of given number is : " + fact(5)
%>
</body>
</html>