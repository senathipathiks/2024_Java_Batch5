<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        	    <%@ include file="Navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center><h1>Welcome to Register page</h1>


<form action="registration" method="post" modelAttribute="bean1">

User Name: <input type="text" name="name"/><br><br>

Email ID:  <input type="email" name="email"/><br><br>

Password:  <input type="password" name="password"/><br><br>

<input type="submit" value="Register" name="register">

</form>


<%

String result = (String) request.getAttribute("Action");

if (result != null) {
	if ("Failure".equals(result)) {
		out.print("<h3 style=color:red>Registered Failed</h3>");
	} else {
		out.print("<h3 style=color:green>Registered Successfully</h3>");
	}
}

%>

</center>


</body>
</html>