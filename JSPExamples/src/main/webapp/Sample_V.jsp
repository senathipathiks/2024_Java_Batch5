<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! String name="Boomer Vidhusha";
int square(int x){
	return x*x;
}
%>

<%="Square value of 3 is: "+square(3) %>

<br>

<%
out.println("<h1>Name:"+name+"</h1>");
%>


</body>
</html>