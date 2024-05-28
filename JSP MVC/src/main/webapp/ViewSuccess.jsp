<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.lms.bean.Employee,java.util.LinkedList"  %>  
<%@ include file="View.jsp" %>
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
 
out.print("<table border=1><tr>");
out.print("<th>EmpID<th>");
out.print("<th>EMpName<th>");
out.print("<th>EmpDesig<th>");
out.print("<th>EmpDepartment<th>");
out.print("</tr>");
 
for(Employee e1 : list)
{
	out.print("<tr>");
	out.print("<td>"+e1.getEmpid()+"<td>");
	out.print("<td>"+e1.getEmpname()+"<td>");
	out.print("<td>"+e1.getEmpdesig()+"<td>");
	out.print("<td>"+e1.getEmpdept()+"<td>");
	out.print("</tr>");
}
 
%>
</body>
</html>