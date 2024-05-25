<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.ims.bean.Customer,java.util.LinkedList"  %>  
<%@ include file="JSPViewAll.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Success</title>
<style>
			body{
                background-color: aliceblue;
            }
            h2{
                color:rgba(15,77,134,255);
            }
            table{
                background-color:rgba(15,77,134,255);
                color: aliceblue;
                padding: 10px 10px;
                border-radius: 25px;
                font-weight: bold;
                font-size: 15px;
                border-width:10px;
                border-style:double;
                border-color: white;
            }
            table td{
                padding: 10px 10px;
                border-radius:2px;
                border-width:3px;
                border-color: white;
            }
</style>
</head>
<body>
<%
LinkedList<Customer> list = new LinkedList<Customer>();
list=(LinkedList)request.getAttribute("list");
 

out.println("<center><table cols=8 border=1><tr>");
out.println("<th>CusID</th>");
out.println("<th>CusName</th>");
out.println("<th>Age</th>");
out.println("<th>Phone Number</th>");
out.println("<th>Email ID</th>");
out.println("<th>Nominee Name</th>");
out.println("<th>Nominee Relation</th>");
out.println("<th>Address</th>");
out.print("</tr>");

 
for(Customer c1 : list)
{
	
	out.print("</tr>");
	out.print("<tr>");
	out.println("<td>"+c1.getCusid()+"</td>");
	out.println("<td>"+c1.getCusname()+"</td>");
	out.println("<td>"+c1.getAge()+"</td>");
	out.println("<td>"+c1.getPhoneNo()+"</td>");
	out.println("<td>"+c1.getEmailID()+"</td>");
	out.println("<td>"+c1.getNomineeName()+"</td>");
	out.println("<td>"+c1.getNomineeRelation()+"</td>");
	out.println("<td>"+c1.getAddress()+"</td><center>");
	out.print("</tr>");

}
out.print("</table>");
 
%>
</body>
</html>