<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="validate" method="post">
<center>
<h1>Login Page</h1><br>
Username:<input type="text" name="uname"><br><br>
Password:<input type="password" name="pass"><br><br>
<input type="submit" name="submit"><br><br>

</form>

<%
String action = (String)	request.getAttribute("Action");
if(action != null)
{
out.print(action);	
}
%>
</center>
</body>
</html>