<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="perform">
Enter Number 1: <br>
<input type="number" name="num1"><br><br>
Enter Number 2: <br>
<input type="number" name="num2"><br><br>
<input type="submit" value="add"><br>
<input type="submit" value="sub"><br>
<input type="submit" value="mul"><br>
<input type="submit" value="div"><br>
</form>
<%
String res = (String)request.getAttribute("Action");
out.print("<h3><font color=green>"+res+"</font></h3>");
%>
</body>
</html>