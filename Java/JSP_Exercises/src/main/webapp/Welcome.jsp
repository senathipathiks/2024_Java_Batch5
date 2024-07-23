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
	String name = request.getParameter("user");
	String pwd= request.getParameter("pwd");
	if(name.equals("admin") && pwd.equals("123")){
		out.println("Hi "+name+" !!!");
	}
	else{
		out.println("Hi Guest!!!");
	}
%>
<center> <h1>Welcome to Inbox!!!</h1></center>
<!-- <h1>Welcome ${param.message} to your Inbox!!! </h1>            	This is one way of passing the parameters-->
</body>
</html>