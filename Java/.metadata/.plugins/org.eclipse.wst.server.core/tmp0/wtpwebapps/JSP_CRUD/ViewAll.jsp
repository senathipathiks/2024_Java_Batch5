<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cms.dao.CmsDao,java.sql.ResultSet,java.util.LinkedList,com.cms.bean.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Employee Details</h1>
<hr>
<%
CmsDao dao = new CmsDao();
int c=0;
try{
	LinkedList<User> list = dao.viewAll();
	out.println("<center><table border=1><tr><th>Employee ID</th><th>Employee Name</th><th>Employee Designation</th><th>Employee Department</th></tr>");
	for(User e : list){
		out.println("<tr><td>"+e.getEid()+"</td>"+"<td>"+e.getEname()+"</td>"+"<td>"+e.getEdes()+"</td>"+"<td>"+e.getEdep()+"</td></tr>");
		c++;
	}
}
catch(Exception e){
	e.printStackTrace();
}
if(c<=0){
	out.println("No Records Found!!!");
}
%>
</body>
</html>