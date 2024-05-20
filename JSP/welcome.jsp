<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<% 
String name=request.getParameter("uname");

String pswrd=request.getParameter("pswrd");

if((name.equals("Vidhusha"))&&(pswrd.equals("vs@123"))){
	%>
	<jsp:forward page="loginsuccess.jsp"></jsp:forward>
<% 	
}
else{
	out.println("Hi guest  !");
}
 %>


</body>
</html>