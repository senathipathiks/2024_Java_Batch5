<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

<%  

String firstname = "Nandhakumaran";
String lastname = "H";
String emailid = "nkumaran431@gmail.com";
String password = "Nandha@64";

if( firstname.equals(request.getParameter("fname")) && lastname.equals(request.getParameter("lname")) && emailid.equals(request.getParameter("email")) && password.equals(request.getParameter("pwd")) ){

%>

<jsp:forward page="LoginSuccess.jsp"></jsp:forward>
<%
}
else
{
%>

<jsp:forward page="Login.jsp"></jsp:forward>

<%
}
%>
</center>

</body>
</html>