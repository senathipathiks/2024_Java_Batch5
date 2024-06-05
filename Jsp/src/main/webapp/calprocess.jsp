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
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String button = (String)request.getParameter("button");
	if (button.equals("Add")) {
	%>

	<jsp:include page="Calculator.jsp"></jsp:include>
	<%
	out.println(num1 + num2);
	} else if (button.equals("Sub")) {
	%>

	<jsp:include page="Calculator.jsp"></jsp:include>
	<%
	out.println(num1 - num2);
	} else if (button.equals("Mul")) {
	%>
	<jsp:include page="Calculator.jsp"></jsp:include>
	<%
	out.println(num1 * num2);
	} else {
	%>
	<jsp:include page="Calculator.jsp"></jsp:include>
	<%
	
	out.println(num1 / num2);
	}
	%>
	
</body>
</html>