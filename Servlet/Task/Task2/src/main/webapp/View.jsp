<%@page import="java.sql.SQLException"%>
<%@page import="com.emp.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.emp.dao.EMPDAO" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>

<body>
<%
	EMPDAO emp = new EMPDAO();
	int count=0;
	try{
		ArrayList<Employee> alstu = emp.viewAll();
	
		out.println("<center><table border=2px ><tr><th>Student ID</th><th>Name</th><th>City</th><th>Mobile Number</th></tr></center>");
	
	
		for(Employee ems : alstu) {
			out.println("<tr><td>"+ems.getEmployee_id()+"</td><td>"+ems.getEmpname()+"</td><td>"+ems.getEmail()+"</td><td> "+ems.getPassword()+"</td></tr>");
			count++;
		}
		out.println("</table>");
	} catch (SQLException e) {
		System.out.println(e);
	}
	if(count<1) {
	out.println("No records found");
	}
%>

   
	</center>






</body>
</html>