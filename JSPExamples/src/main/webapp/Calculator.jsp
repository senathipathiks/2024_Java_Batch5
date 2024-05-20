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
int x,y;
int add(int x,int y){
	return x+y;
}
int sub(int x, int y){
	return x-y;
}
int mul(int x,int y){
	return x*y;
}
int div(int x,int y){
	return x/y;
}
%>

<%="Add value is: "+add(3,3) %>
<br>
<%="Sub is: "+sub(3,3) %>
<br>
<%="Mul value is: "+mul(3,3) %>
<br>
<%="Div value is: "+div(3,3) %>

</body>
</html>