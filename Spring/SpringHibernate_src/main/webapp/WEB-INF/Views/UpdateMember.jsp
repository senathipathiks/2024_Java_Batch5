<%@page import="com.sms.bean.Student"%>
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

<body>
	<div class="background-wrap">
	  <div class="background"></div>
	</div>
	
	<form action="Fetch" method="post">
		<h1>Update Employee Details</h1>
		ID :<select name="id">
			<option selected>Select ID</option>
			<c:forEach items="${IdList}" var="id">
				<option value="${id}">${id}</option>
			</c:forEach>
		</select> <br>
		<input type="Submit" value="Fetch" name="button">
	</form>
	
	<form id="accesspanel" method="post" modelAttribute="bean" action="Updation">
		<h1 id="litheader">Update Student Details</h1>
		<div class="inset">
			<p>
				<input type="text" name="id" placeholder="ID" value="${${id}}" readonly>
			</p>
			<p>
				<input type="text" name="name" placeholder="Name" value="${student.getName()}">
			</p>
			<p>
				<input type="text" name="batch" placeholder="Batch" value="${student.getBatch()}">
			</p>
		</div>

		<p class="p-container">
			<input type="submit" value="Update">
		</p>

	</form>
	
	<%
	String action = (String) request.getAttribute("Action");
	Student student = (Student) request.getAttribute("student");
	if (action != null) {

		if (action.equals("Success")) {
			out.print("<h3><font color=green>Update Operation is Success</font></h3>");
		} else {
			out.print("<h3><font color=red>Update Operation is Failure</font></h3>");
		}
	}
	%>
</body>
</html>