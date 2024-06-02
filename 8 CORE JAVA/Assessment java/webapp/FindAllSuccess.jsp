<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="FindAllPage.jsp" %>
    <%@page import="com.cms.bean.Employees,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
LinkedList<Employees> list=new LinkedList<Employees>();
list=(LinkedList)request.getAttribute("list");
out.print("<table border=1><tr>");
out.print("<th>EmpID<th>");
out.print("<th>EMpName<th>");
out.print("<th>EmpDesig<th>");
out.print("<tr>");
for(Employees e1:list)
{
	out.print("<tr>");
	out.print("<td>"+e1.getEid()+"<td>");
	out.print("<td>"+e1.getEname()+"<td>");
	out.print("<td>"+e1.getEdesig()+"<td>");
	out.print("</tr>");
}

%>
</body>
</html>