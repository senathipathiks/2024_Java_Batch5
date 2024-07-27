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
String freg = "^[A-Za-z_][A-Za-z0-9_]{7,29}$";
String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
String uname = request.getParameter("uname");
String pass = request.getParameter("pass");
String mob = request.getParameter("mob");

if(fname == "" || fname == null || !(fname.equals(freg)) || lname == "" || lname == null || uname == null || uname==""|| mob == null || mob==""|| pass == null || pass =="")
{
%>
	
	<jsp:include page="LoginError.jsp"></jsp:include>

<%
}
else if(fname.equals(freg)){
%>

	<jsp:include page="LoginSuccess.jsp"></jsp:include>
<%
}

%>
</body>
</html>