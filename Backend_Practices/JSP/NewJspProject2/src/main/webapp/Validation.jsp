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

String uname = "Nandhakumaran";
String password = "Nandha@64";

if( uname.equals(request.getParameter("uname")) && password.equals(request.getParameter("pwd")) ){

%>

<jsp:forward page="Display.jsp"></jsp:forward>
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