<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.lms.bean.Employee" %>
 <%@ include file="find.jsp" %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Employee e1 = (Employee)request.getAttribute("res");
 out.println("<table border=1><tr>");
				out.println("<th>EmpID</th>");
				out.println("<th>EMpName</th>");
				out.println("<th>EmpDesig</th>");
				out.println("<th>EmpDepartment</th> </tr> <tr>");
				out.println("<td>"+e1.getEmpid()+"</td>");
				out.println("<td>"+e1.getEmpname()+"</td>");
				out.println("<td>"+e1.getEmpdesig()+"</td>");
				out.println("<td>"+e1.getEmpdept()+"</td></tr></table>");

%>	
</body>
</html>