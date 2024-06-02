<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="Find.jsp" %>
    <%@page import="com.jsp.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Employee e1=(Employee)request.getAttribute("res");

				out.print("<table border=1><tr>");
				out.print("<th>EmpID<th>");
				out.print("<th>EMpName<th>");
				out.print("<th>EmpDesig<th>");
				out.print("<th>EmpDepartment<th>");
				out.print("<tr>");
				out.print("<td>"+e1.getEmpId()+"<td>");
				out.print("<td>"+e1.getEmpname()+"<td>");
				out.print("<td>"+e1.getEmpdesig()+"<td>");
				out.print("<td>"+e1.getEmpdept()+"<td>");
//				response.getWriter().print("<h1><font-color-green>Record Found</font-color></h1>");	
%>
</body>
</html>