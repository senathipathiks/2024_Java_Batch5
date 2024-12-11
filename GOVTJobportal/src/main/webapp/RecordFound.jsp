<%@page import="com.lms.bean.Applicant"%>
<%@page import="com.lms.dao.LmsDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import ="com.lms.bean.Applicant,java.util.*" %>  
        <%@ include file="Search.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table{
align-items: center;
	justify-content: center;
	margin: 0;
	top: 70%;
	left:50%;
	position:absolute;
	transform: translate(-50%,-50%);
	color:white;
}
h2{
justify-content: center;
	margin: 15%;
	top: 50%;
	left:35%;
	position:absolute;
	transform: translate(-50%,-50%);
}
</style>
<body>
<br>
<br>
<%
ArrayList<Applicant> res = (ArrayList<Applicant>)request.getAttribute("res");
	out.println("<table border=3px align = center> <tr><th>Applicant Id </th> <th>Applicant Name </th> <th>Applied Job Post</th> <th> Application Status </th></tr> ");
	for(Applicant e : res) {
	out.println("<tr> <td>"+e.getAid()+"</td><td>"+e.getAname()+"</td><td>"+e.getJob()+"</td><td>"+e.getSts()+"</td></tr>");
	
	 
	 	}
	out.println("</table>");
%>

<center><h2> <font color=white> Data found !!</font></h2></center>


</body>
</html>