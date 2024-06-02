<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
   <%@include file="FindPage.jsp" %>
   <%@page import="com.cms.bean.Employees" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>found</title>
</head>
<body>
<%

Employees e1 =(Employees)request.getAttribute("res");
out.print("<center><h1><font color=green>Record Found!</font></h1>");
out.println("<table border=3><tr>");
out.println("<th>Emp Id</th>");
out.println("<th>Emp Name</th>");
out.println("<th>Emp Desig</th>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>"+e1.getEid()+"</td>");
out.println("<td>"+e1.getEname()+"</td>");
out.println("<td>"+e1.getEdesig()+"</td>");

%>

</body>
</html>