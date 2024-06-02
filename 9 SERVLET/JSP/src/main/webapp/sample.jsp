<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello all</h1>
<%
out.print("HELLO ALL"); %>
<%! String fname="gopi";

int square(int x)
{
	return x*x;
}
%>
<%="square value of 5 is:"+square(5) %>
<br>
<%out.print("Name:" +fname); %>

</body>
</html>