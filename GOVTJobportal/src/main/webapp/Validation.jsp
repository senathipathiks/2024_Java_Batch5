<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h2{
justify-content: center;
	margin: 15%;
	top: 50%;
	left:35%;
	position:absolute;
	transform: translate(-50%,-50%);
}

</style>
</head>
<body>
<%
String uname = "tsv@gmail.com";
String pwd = "Tsv123";
if(uname .equals(request.getParameter("email")) && pwd.equals(request.getParameter("textarea"))){
	
	  request.getRequestDispatcher("Display.jsp").include(request, response);
	  out.println("<h2 ><font color=white >Login Success!!!...Welcome to India-Jobs</font></h2>");
}
else{
	  request.getRequestDispatcher("LoginFail.jsp").include(request, response);
}
%>
</body>
</html>