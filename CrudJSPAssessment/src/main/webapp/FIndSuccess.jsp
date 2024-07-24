<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="Find.jsp" %>
    <%@page import="com.lms.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Employee e1=(Employee)request.getAttribute("res");

				out.print("<br><center><table border=1><tr>");
				out.print("<th>EmpID<th>");
				out.print("<th>EMpName<th>");
				out.print("<th>EmpDesig<th>");
				out.print("<th>EmpDepartment<th>");
				out.print("<tr>");
				out.print("<td>"+e1.getEmpid()+"<td>");
				out.print("<td>"+e1.getEmpname()+"<td>");
				out.print("<td>"+e1.getEmpdesig()+"<td>");
				out.print("<td>"+e1.getEmpdept()+"<td></center>");
//				response.getWriter().print("<h1><font-color-green>Record Found</font-color></h1>");	
%>
</body>
</html>