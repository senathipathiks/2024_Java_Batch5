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
String n = request.getParameter("uname");
String p = request.getParameter("pass");
if(n.equals("nagarjun") && p.equals("123")){
%>
<jsp:forward page="Welcome.jsp"></jsp:forward>
<%
}
else
{
%>
<jsp:forward page="LoginFailure.jsp"></jsp:forward>
<%
}
%>
</body>
</html>