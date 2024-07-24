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
String gender = request.getParameter("gen");
if(name==""){
	out.print("Please enter your name");
}
else if(pass==""){
	out.print("Please enter your password");
}
else if(pass.length()<=6){
	out.print("Invalid password length");
}
else if(gender==""){
	out.print("Please enter gender");
}
else{
	out.print("Registration Success");
}
%>
</body>
</html>