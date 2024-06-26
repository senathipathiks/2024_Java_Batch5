<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Calculator</h1>
	<form action="cal" style="align-content: center" method="post">
		<table align="center" cellpadding="10px">

			<tr>
				<td>Enter the 1st Number:</td>
				<td><input type="number" placeholder="Number1" name="num1"
					required></td>
			</tr>
			<tr>
				<td>Enter the 2nd Number:</td>
				<td><input type="number" name="num2" placeholder="Number2"
					required></td>
			</tr>

			<tr>
				<td colspan="2" align="center">
				<input type="submit" name="but" value="add">
					<input type="submit" name="but" value="sub"> 
					<input type="submit" name="but" value="mul"> 
					<input type="submit"name="but" value="div"></td>
			</tr>
		</table>
	</form>
	<%
	String action = (String) request.getAttribute("Action");
	if (action != null) {
		out.print(action);
	}
	else{
		out.print("<h5>Invalid Input</h5>");
	}
	%>
</body>
</html>