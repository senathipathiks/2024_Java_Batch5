<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.jsp.dao.LMSDAO,java.sql.ResultSet,java.sql.ResultSetMetaData"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
            
            body{
                background-color:rgba(100, 164, 189);
                
            }
            table,input{
            background-color : rgba(208, 238, 242);
            }
            table{
            border-radius : 10px;
            }

        </style>
</head>
<body>
 
<h1 align="center">.....EMPLOYEE DETAILS.....</h1>
<h1 align="center">------------------------------------------------------</h1>
<%
LMSDAO dao = new LMSDAO();
ResultSet rs =dao.viewAll();
int cnt =0;
 
out.println("<center> <table border=3px> <tr><th>Employee Id </th> <th>Employee Name </th> <th>Designation</th> <th> Department </th></tr> ");
while(rs.next()) {
	out.println("<tr> <td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
	 cnt++;
}
out.println("</table> </center>");
if(cnt<=0) {
	  System.out.println("No records found");
}
%>
</body>
</html>
