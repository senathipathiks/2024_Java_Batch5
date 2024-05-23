<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inbox</title>
</head>
<%//
//String name=(String)request.getAttribute("uname");
//out.println("Hi"+name+"!!");
//%>
<body>
<%
String name=request.getParameter("uname");
String pwd=request.getParameter("pwd");
if((name.equals("Shalini")) && (pwd.equals("Sha123")))
{
	%>
	<jsp:forward page="LoginSuccess.jsp"></jsp:forward>;
	out.print("Hi"+name+"!!");
	<%
}
else
{
	%>
	<jsp:include page="Login.jsp"></jsp:include>;
	out.print("Hi Guest!!");
	<%
}
%>
<h1>Welcome to Inbox..</h1>
<a href="send.jsp?uname=<%=name%>">send items </a>


</body>
</html>