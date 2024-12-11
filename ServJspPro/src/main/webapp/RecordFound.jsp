<%@page import="com.lms.dao.LmsDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import ="com.lms.bean.Employee,java.util.*" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<Employee> res = (ArrayList<Employee>)request.getAttribute("res");
	out.println("<table border=3px align= center> <tr><th>Employee Id </th> <th>Employee Name </th> <th>Salary</th> <th> Designation </th></tr> ");
	for(Employee e : res) {
	out.println("<tr> <td>"+e.getEmpid()+"</td><td>"+e.getEmpname()+"</td><td>"+e.getsal()+"</td><td>"+e.getEmpdesg()+"</td></tr>");
	
	 
	 	}
	out.println("</table>");
%>

<center><h2> <font color=green> Data found !!</font></h2></center>


</body>
</html>