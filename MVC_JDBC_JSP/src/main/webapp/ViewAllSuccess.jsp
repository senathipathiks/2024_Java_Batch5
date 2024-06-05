<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="viewall.jsp"%>
 <%@ page import="java.util.*,com.lmsdb.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
 LinkedList<Employee> list = (LinkedList<Employee>)request.getAttribute("ls");



out.print("<center><table border=1><tr>");
	out.print("<th>EmpID<th>");
	out.print("<th>EmpName<th>");
	out.print("<th>Designation<th>");
	out.print("<th>Department<th>");
out.print("<tr>");



for(Employee i : list){
	out.print("<tr>");
	out.print("<td>"+i.getEmpid()+"<td>");
	out.print("<td>"+i.getEpmname()+"<td>");
	out.print("<td>"+i.getEmpdesig()+"<td>");
	out.print("<td>"+i.getEmpdept()+"<td>");
	out.print("</tr>");

}

out.println("</table>");
%>
<center><h1 style="color:blue" >!!! ViewAll Success !!!</h1></center>
</body>
</html>