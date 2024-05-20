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
//String userid = request.getAttribute("uname"); 
String name=request.getParameter("uname");
out.print("Hi " +name);
//request.sendParameter("name");
%>
<h1>Welcome to Inbox </h1>
<a href="sendItem.jsp?uname=<%=name%>">Send Item</a>

</body>
</html>