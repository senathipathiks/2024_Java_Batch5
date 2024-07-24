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
String name=(String)request.getAttribute("uname");
session.setAttribute("name",name);
out.println("Hi "+name+ " !!!");
%>

<h1>Welcome Inbox!!</h1>
         / <a href = "Products.jsp">Products Page</a> 

</body>
</html>