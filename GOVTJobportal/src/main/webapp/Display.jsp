<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.exceptions.RSAException"%>
<%@page import="com.lms.dao.LmsDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
    <%@ include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view all</title>
<style>
body{

    background-image:url('./Images/emplbg.png');

}
#box{
	display: flex;
	align-items: center;
	justify-content: center;
	margin: 0;
	top: 50%;
	left:50%;
	position:absolute;
	transform: translate(-50%,-50%);
}
th{
   background-color:green;
   padding:5%;
   width:100%;
     padding-left:8px;
      padding-right:8px;
}
td{
background-color:white;
   padding:3%;
   padding-right:8px;
   padding-left:8px;
   width:100%;
   
}
</style>
</head>
<body>


<%
LmsDao dao = new LmsDao();

ResultSet rs =dao.viewAll();
int cnt =0;

out.println("<div id=box><table border=1px align=center> <tr><th>Applicant Id </th> <th>Applicant  Name </th> <th>Applied Job Post </th> <th> Application Status </th></tr> ");
while(rs.next()) {
	out.println("<tr> <td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
	
	 cnt++;
}
out.println("</table></body></div>");

if(cnt<=0) {
	  System.out.println("No records found");
}
%>

</body>
</html>