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
	<center>
		<form action="Fetch1" method="post">
			<h1>Find Student</h1>
			ID : <select name="sid">
				<option selected>Select ID</option>
				<c:forEach items="${IdList}" var="id">
					<option value="${id}">${id}</option>
				</c:forEach>
			</select> <br> <br> <input type="Submit" value="Find" name="button">
		</form>

		<form action="Findpost" method="post">
			<center>

				<br> <br /> ID: <input type="number" name="sid"
					placeholder="ID" value=${ Stud.getSid()}><br /> Name : <input
					type="text" name="sname" placeholder="Student Name"
					value=${ Stud.getSname()}><br> <br> City : <input
					type="text" name="scity" placeholder="Student City"
					value=${ Stud.getScity()}><br>


			</center>
		</form>
		<%
		String result = (String) request.getAttribute("Action");

		if (result != null) {

			if (result.equals("Success")) {
				out.print("<h3><font color=green>Updation Operation is Successfully Done</font></h3>");
			} else {
				out.print("<h3><font color=red>Updation Operation is Failure</font></h3>");
			}

		}
		%>

	</center>
</body>
</html>