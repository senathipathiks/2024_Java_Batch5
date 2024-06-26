<%@page import="com.gopi.sample.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="black-theme">
<div class="card">
<center>
<form action="SearchingByName" method="post"><br><br>
<h2>Find Student Details Using Name</h2><br>
<select name="sname" required><br>
<option selected value="">Select ID</option>
<c:forEach items="${NameList}" var="sname">
<option value="${sname}">${sname}</option>
</c:forEach>
</select> <br><br>
<input type="Submit" value="Find By Name" class="button-29" name="button"><br><br>
</form>
<%
String result = (String) request.getAttribute("Action");
Student stud = (Student) request.getAttribute("Stud");
if (result != null) {
	if (result.equals("Success")) {
		out.print("<label><h4>Id: <font color=black>" + stud.getSid()
		+ "</font></h4></label><br><label><h4>Name: <font color=black>" + stud.getSname()
		+ "</font></h4></label><br><label><h4>City: <font color=black>" + stud.getScity()
		+ "</font></h4></label>");
	} else {
		out.print("<h3><font color=red>The Id Not Present</font></h3>");
	}
}
%>
</center>
</div>
</body>
</html>