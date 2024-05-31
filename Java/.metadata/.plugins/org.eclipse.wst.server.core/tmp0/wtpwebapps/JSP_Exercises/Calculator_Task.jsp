<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<!--  <h1 align="center">Calculator</h1>
<input type="number" name="one"><br>
<input type="number" name="one"><br>
<input type="submit" value="Add"><br>
<input type="submit" value="Sub"><br>
<input type="submit" value="Mul"><br>
<input type="submit" value="Div"><br> -->

<%!
int add(int a,int b){
	return a+b;
}

int sub(int a,int b){
	return a-b;
}

int mul(int a, int b){
	return a*b;
}

int div(int a, int b){
	return a/b;
}
%>

<%=
"Addition is: "+add(2,2)%><br>
<%= "Subtraction is:"+sub(2,2)%><br>
<%="Multiplication is: "+mul(3,3)%><br>
<%= "Division is: "+div(4,2)%><br>


</body>
</html>