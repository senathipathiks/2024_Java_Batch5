<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%
String name = request.getParameter("uname");
String pwd = request.getParameter("pass");
if((name.equals("Gopi"))&& (pwd.equals("123"))){
	%>
	<jsp:forward page="loginSuccess.jsp"></jsp:forward>
	<%
}
else{
	%>
	<jsp:include page="login1.jsp"></jsp:include>
<%
	out.print("<h3><font color=red> Invalid Usernamr/Password</font></h3>");
}
%>
</body>
</html>