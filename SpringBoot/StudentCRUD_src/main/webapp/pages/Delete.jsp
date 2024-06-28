<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
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

	<!-- <form id="accesspanel" action="Controller" method="get" name="memberform" onsubmit="return validateForm()">
	  <h1 id="litheader">Delete Member Details by ID</h1>
	  <div class="inset">
	    <p>
	      <input type="text" name="id">
	    </p>
	  </div>
	  
	  <p class="p-container">
	    <input type="Submit" value="Delete" name="action">
	  </p>
	  
	</form> -->
	<form action="DeletionById" method="post">
		<h1>Delete Employee by ID</h1>
		ID :<select name="id">
			<option selected>Select ID</option>
			<c:forEach items="${IdList}" var="id">
				<option value="${id}">${id}</option>
			</c:forEach>
		</select> <br>
		<input type="Submit" value="Delete" name="button">
	</form>
	<form action="DeletionByName" method="post">
		<h1>Delete Employee by Name</h1>
		ID :<select name="name">
			<option selected>Select Name</option>
			<c:forEach items="${NameList}" var="name">
				<option value="${name}">${name}</option>
			</c:forEach>
		</select> <br>
		<input type="Submit" value="Delete" name="button">
	</form>
	<%
	String action = (String) request.getAttribute("Action");

	if (action != null) {

		if (action.equals("Success")) {
			out.print("<h3><font color=green>Deletion Operation is Successfully Done</font></h3>");
		} else {
			out.print("<h3><font color=red>Deletion Operation is Failure</font></h3>");
		}
	}
	%>

	</center>
</body>
</body>
</html>