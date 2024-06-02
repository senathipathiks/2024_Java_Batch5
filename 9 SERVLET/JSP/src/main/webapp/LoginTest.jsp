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
String name  = request.getParameter("uname");
String pwd  = request.getParameter("pass");
if(name.equals("Gopi")&&pwd.equals("123")){
	%>
	<jsp:forward page = "img.jsp"></jsp:forward>
	<%
}
else
{
%>
<jsp:forward page = "LoginFail.jsp"></jsp:forward>
<%
}
%>

</body>
</html>