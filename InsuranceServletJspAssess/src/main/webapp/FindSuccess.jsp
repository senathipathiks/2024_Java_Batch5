<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.ims.bean.Customer" %>
 <%@ include file="JSPFind.jsp" %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Success</title>
</head>
<body>
<% 
Customer c1 = (Customer)request.getAttribute("res");
 out.println("<center><table border=1><tr>");
				out.println("<th>CusID</th>");
				out.println("<th>CusName</th>");
				out.println("<th>Age</th>");
				out.println("<th>Phone Number</th>");
				out.println("<th>Email ID</th>");
				out.println("<th>Nominee Name</th>");
				out.println("<th>Nominee Relation</th>");
				out.println("<th>Address</th> </tr> <tr>");
				out.println("<td class>"+c1.getCusid()+"</td>");
				out.println("<td>"+c1.getCusname()+"</td>");
				out.println("<td>"+c1.getAge()+"</td>");
				out.println("<td>"+c1.getPhoneNo()+"</td>");
				out.println("<td>"+c1.getEmailID()+"</td>");
				out.println("<td>"+c1.getNomineeName()+"</td>");
				out.println("<td>"+c1.getNomineeRelation()+"</td>");
				out.println("<td>"+c1.getAddress()+"</td></tr></table><center>");

%>	
</body>
</html>