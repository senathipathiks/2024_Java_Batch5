<%@page import="org.apache.catalina.util.RequestUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>
<h1>Factorial</h1>
<form action="Fact.jsp">
Enter the number: <input type="number" name="num" placeholder="NUmber">
<input type="Submit" value="Submit" name="sub">
</form>

<input type="text" id="employeeid" name="employeeid" value="${c.employee_id}">

<%---<% int empid = c.employee_id;
String x =request.getParameter("num"); 
int num = Integer.parseInt(x);

int sum =0;
for(int i = 1; i <= num; ++i)
{
    sum = sum*i;
}
out.println("Factorial of "+num+" is: "+sum);
--%>

</body>
</html>