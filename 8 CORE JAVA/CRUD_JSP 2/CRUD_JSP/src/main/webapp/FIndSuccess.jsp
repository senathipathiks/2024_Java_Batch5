<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="Find.jsp" %>
    <%@page import="com.jsp.bean.Donor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><br><br><center>
<%
Donor e1=(Donor)request.getAttribute("res");

		out.print("<table border=1></tr>");
		out.print("<th>Donor ID</th>");
		out.print("<th>Donor Name</th>");
		out.print("<th>Donor Blood Group</th>");
		out.print("<th>Donor Phone Number</th>");
		out.print("</tr>");
		out.print("<td>"+e1.getdonorid()+"</td>");
		out.print("<td>"+e1.getdonorname()+"</td>");
		out.print("<td>"+e1.getdonorbg()+"</td>");
		out.print("<td>"+e1.getdonorphoneno()+"</td>");
//				response.getWriter().print("<h1><font-color-green>Record Found</font-color></h1>");
%></center>
</body>
</html>