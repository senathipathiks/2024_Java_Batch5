<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<%@ page import="com.lms.bean.Employee, java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<%
		LinkedList<Employee> list = new LinkedList<>(); 
		list = (LinkedList<Employee>) request.getAttribute("list");

		
		out.println("<table border=\"2\">");
		out.println("<tr>");
		out.println("<th>EmpID</th>");
		out.println("<th>EmpName</th>");
		out.println("<th>Designation</th>");
		out.println("<th>Department</th>");
		out.println("</tr>");
		
		for (Employee e : list) {
		    out.println("<tr>");
		    out.println("<td>" + e.getEmpid() + "</td>");
		    out.println("<td>" + e.getEmpname() + "</td>");
		    out.println("<td>" + e.getEmpdesig() + "</td>");
		    out.println("<td>" + e.getEmpdept() + "</td>");
		    out.println("</tr>");
		}

		out.println("</table>");

%>
</center>
<h3 style="color:green" align="center">Successfully Found</h3>
</body>
</html>