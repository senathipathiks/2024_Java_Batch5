<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="ViewAll.jsp" %>
    <%@page import="com.lms.bean.Employee,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
LinkedList<Employee> list = new LinkedList<Employee>();
list=(LinkedList)request.getAttribute("list");

out.print("<br><center><table border=1><tr>");
out.print("<th>EmpID<th>");
out.print("<th>EMpName<th>");
out.print("<th>EmpDesig<th>");
out.print("<th>EmpDepartment<th>");
out.print("</tr></center>");

for(Employee e1 : list)
{
	out.print("<center><tr>");
	out.print("<td>"+e1.getEmpid()+"<td>");
	out.print("<td>"+e1.getEmpname()+"<td>");
	out.print("<td>"+e1.getEmpdesig()+"<td>");
	out.print("<td>"+e1.getEmpdept()+"<td>");
	out.print("</tr></center>");
}

%>
</body>
</html>