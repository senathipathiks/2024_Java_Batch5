<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.emp.bean.EmpBean" %>
      <%@include file="find.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Record found</title>
</head>
<body>
<% 
				EmpBean e =(EmpBean)request.getAttribute("res");
 				 out.println("<table border=3><tr>");
				 out.println("<th>Emp Id</th>");
				 out.println("<th>Emp Name</th>");
				 out.println("<th>Emp Dept</th>");
				 out.println("<th>Emp Desg</th>");
				 out.println("</tr>");
				 out.println("<tr>");
				 out.println("<td>"+e.getEmpId()+"</td>");
				 out.println("<td>"+e.getEmpName()+"</td>");
				 out.println("<td>"+e.getEmpDept()+"</td>");
				 out.println("<td>"+e.getEmpDesg()+"</td>");
				// out.println("</tr>");
				 //out.println("</table>");
                 //out.println("</center>");
				
%>

<h1 ><font color="green" >Record found</font> !</h1>
</body>
</html>