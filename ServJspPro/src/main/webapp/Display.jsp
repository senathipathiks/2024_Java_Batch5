<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.exceptions.RSAException"%>
<%@page import="com.lms.dao.LmsDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view all</title>
</head>
<body>


<%
LmsDao dao = new LmsDao();

ResultSet rs =dao.viewAll();
int cnt =0;

out.println("<table border=3px align=center> <tr><th>Employee Id </th> <th>Employee Name </th> <th>Salary</th> <th> Designation </th></tr> ");
while(rs.next()) {
	out.println("<tr> <td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
	
	 cnt++;
}
out.println("</table>");

if(cnt<=0) {
	  System.out.println("No records found");
}
%>

</body>
</html>