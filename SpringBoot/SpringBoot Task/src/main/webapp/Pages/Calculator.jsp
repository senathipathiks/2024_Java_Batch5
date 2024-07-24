<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="cal">
Enter the num1:<input type="text" name="num1"><br><br>
Enter the num2:<input type="text" name="num2"><br><br>
<input type="button" value="sum" name="button">
<input type="submit" value="sub">
<input type="submit" value="mul">
<input type="submit" value="div"><br><br>

</form>
</body>
<%
String result = (String) request.getAttribute("Action");
if(result!=null){
	 out.print(result);

}
%>

</html>