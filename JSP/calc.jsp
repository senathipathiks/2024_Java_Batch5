<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<%
int a = Integer.parseInt(request.getParameter("num1"));
int b = Integer.parseInt(request.getParameter("num2"));
String action = request.getParameter("b");
if(action.equals("add")){
	out.print(a+b);
}
else if(action.equals("sub")){
	out.print(a-b);
}
else if(action.equals("mul")){
	out.print(a*b);
}
else if(action.equals("div")){
	out.print(a/b);
}
%>
</body>
</html>