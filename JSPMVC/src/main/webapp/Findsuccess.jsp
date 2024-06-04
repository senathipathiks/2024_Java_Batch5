<%@page import="java.util.LinkedList"%>
<%@page import="com.jsp.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file = "find.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color = green>Record Found...</font></h1>
			
			<%
			LinkedList<Employee> list = new LinkedList<>();
			list =	(LinkedList<Employee>)request.getAttribute("list");
			out.println("<table align=center border=3px><tr><th>Employee ID</th><th>Employee Name</th><th>Employee Designation</th><th>Department</th></tr>");
			
			for(Employee li : list) {
				out.println("<tr><td>"+li.getEmpid()+"</td><td>"+li.getEmpname()+"</td><td>"+li.getEmpdesignation()+"</td><td>"+li.getDepartment()+"</td></tr></table>");
				
				
			}
			 		
			%>
</body>
</html>