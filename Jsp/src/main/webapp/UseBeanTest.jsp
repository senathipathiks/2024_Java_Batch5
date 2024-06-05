<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.subash.jsp.Registrationclass" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%
	String uname = request.getParameter("uname");
	String pno = request.getParameter("pno");
	String loc = request.getParameter("loc");
	String age = request.getParameter("age");
	String email = request.getParameter("email");
	
	............
	
	this code not needed when we use the usebean property setProperty and getProperty

%> --%>
<jsp:useBean id="stud1" class="com.subash.jsp.Registrationclass"></jsp:useBean>
<jsp:setProperty property="*" name="stud1"/>
<jsp:getProperty property="uname" name="stud1"/>
<jsp:getProperty property="pno" name="stud1"/>
<jsp:getProperty property="loc" name="stud1"/>
<jsp:getProperty property="age" name="stud1"/>
<jsp:getProperty property="email" name="stud1"/>
</body>
</html>