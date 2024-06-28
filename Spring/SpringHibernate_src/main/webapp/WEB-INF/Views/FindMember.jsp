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
	
	<form action="Searching" method="post">
		<h1>Find Employee Details</h1>
		ID :<select name="id">
			<option selected>Select ID</option>
			<c:forEach items="${IdList}" var="id">
				<option value="${id}">${id}</option>
			</c:forEach>
		</select> <br>
		<input type="Submit" value="Find" name="button">
	</form>
	
	<%
	String result = (String) request.getAttribute("Action");
	Student student = (Student) request.getAttribute("student");

	if (result != null) {

		if (result.equals("Success")) {
			out.print("<h3><font color=green>"
					+ student.getName()
					+"</font></h3>");
		} else {
			out.print("<h3><font color=red>Deletion Operation is Failure</font></h3>");
		}
	}
	%>
	
	
</body>
</html>