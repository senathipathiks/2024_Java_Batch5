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
String name = request.getParameter("uname");
String pass = request.getParameter("pwd");
if((name.equals("vicky")) && (pass.equals("root"))){
	out.print("Hi "+ name +"!!!");
}
else{
	out.print("Hii Guest");
}
%>
<h1>Welcome to Inbox</h1>

</body>
</html>