<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.lms.bean.Employee,java.util.LinkedList"  %>  
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
LinkedList<Employee> list = new LinkedList<Employee>();
list=(LinkedList)request.getAttribute("list");
 
out.print("<center><table cols=4 border=1><tr>");
out.print("<th>EmpID</th>");
out.print("<th>EMpName</th>");
out.print("<th>EmpDesig</th>");
out.print("<th>EmpDepartment</th>");
out.print("</tr>");
 
for(Employee e1 : list)
{
	out.print("<tr>");
	out.print("<td>"+e1.getEmpid()+"</td>");
	out.print("<td>"+e1.getEmpname()+"</td>");
	out.print("<td>"+e1.getEmpdesig()+"</td>");
	out.print("<td>"+e1.getEmpdept()+"</td></center>");
	out.print("</tr>");
}
out.print("</table>");
 
%>
</body>
</html>