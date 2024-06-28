<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>CALCULATOR</h1>
</center>
<center>
	<form action="Calculate" method="post" ModelAttribute="bean">
		<br> Number 1 :<input type="text" name="num1" /><br> <br>
		Number 2 :<input type="text" name="num2" /><br> <br> 
		<input type="submit" name="but" value="Add" /> 
		<input type="submit" name="but" value="Sub" /> 
		<input type="submit" name="but" value="Mul" /> 
		<input type="submit" name="but" value="Div" />
	</form>
</center>

<%
	String result = (String) request.getAttribute("Result");
	String action = (String) request.getAttribute("Action");
	if (action != null) {
		if (action.equals("Success")) {
			out.print("<center>");
			out.println("<h2>Result :</h2>");
			out.print("<h3><font color=green>" + result + "</font></h3>");
			out.print("</center>");
		} else {
			out.print("<center><h3><font color=red>Calculate Failed</font></h3></center>");
		}
	}
%>
</body>
</html>