<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- <style>
 
    table {
        border-collapse: collapse;
        width: 100%;
        max-width: 600px;
        margin: 0 auto;
         background-color: rgb(248, 26, 92);
    }
 
    th, td {
        border: 1px solid white;
        padding: 10px;
        text-align: left;
        color: white; /* Set font color to white */
         background-color: rgb(248, 26, 92);
    }
 
    th {
        
         background-color: rgb(248, 26, 92);
    }
    </style>-->
<style>
body {
	background-color: aliceblue;
}

h2 {
	color: rgba(15, 77, 134, 255);
}

table {
	background-color: lightpink;
	color: aliceblue;
	padding: 10px 10px;
	border-radius: 20px;
	font-weight: bold;
	font-size: 15px;
	border-width: 10px;
	border-color: white;
	margin-top: 20px;
	margin-left: 400px;
}

table td {
	padding: 10px 10px;
	border-radius: 2px;
	border-width: 3px;
	border-color: white;
}
</style>

</head>
<body>
	<center>
		<form action="Fetch" method="post" modelAttribute="bean">
			<h1>Update Employee by ID</h1>
			ID : <select name="sid">
				<option selected>Select ID</option>
				<c:forEach items="${idList}" var="id">
					<option value="${id}">${id}</option>
				</c:forEach>
			</select> <br>
			<br>
			<input type="Submit" value="Fetch" name="button">
		</form>
		<br>
	</center>

	<center>
		<form action="Updation" method="post" modelAttribute="bean">


			<div>
				<h2>
					<table border="1" align="center" class="container">
						<tr>
							<th><h2>ID:</th>
							<td><input type="hidden" name="sid" placeholder="Student ID"
								value=${ Stud.getSid()}></td>
								</h2>
						</tr>


						<tr>
							<th><h2>Enter Name:</th>
							<td><input type="text" name="sname"
								placeholder="Student name" value=${ Stud.getSname()}></td>
							</h2>
						</tr>

						<tr>
							<th><h2>Enter city:</th>
							<td><input type="text" name="scity"
								placeholder="Student city" value=${ Stud.getScity()}></td>
								</h2>
						</tr>


						<tr>
						<th colspan="2"><h2><input type="submit" value="Update"
								name="button"></th>
								</h2>
						</tr>

					</table>
					<br>
				</h2>
			</div>



		</form>
	</center>

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