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
String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
String email = request.getParameter("mail");
String uname = request.getParameter("uname");
String pwd = request.getParameter("pwd");

if((fname.equals("Gokul Anand")) && lname.equals("M") && email.equals("gokulanand007@gmail.com") && uname.equals("gokulanand6") && pwd.equals("123"))
{
%>
<jsp:forward page="RegistrationSuccess.jsp"></jsp:forward>
<%	
}
else
{
%>
<jsp:forward page="RegistrationError.jsp"></jsp:forward>
<%
}
%>
</body>
</html>