<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cms.dao.CmsDao,java.sql.ResultSet,java.util.LinkedList,com.cms.bean.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style>
h1{
color:white
}
body{
background-image: linear-gradient(#0f0c29,#302b63,#24243e);
background-repeat:no-repeat;
background-size: cover;
height:440px;
background-attachment: fixed;
}

#b1:hover,#b2:hover,#b3:hover,#b4:hover,#b5:hover{
transform:scale(1.01);
}
@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
#cont{
  animation-name: ani;
  animation-duration: 3s;
  animation-timing-function: ease;
  animation-direction: forwards;
  animation-iteration-count: 1;
}
</style>
</head>
<body>
<a href="Welcome.jsp" style="color:white; text-decoration:none;"><b>Go Home</b></a>
<h1 align="center" class="display-4 text-center">Employee Details</h1>
<hr>
<form class="container">
<%
CmsDao dao = new CmsDao();
int c=0;
try{
	LinkedList<User> list = dao.viewAll();
	out.println("<center><table class=table table-striped table-light><tr class=thead-dark><th>Employee ID</th><th>Employee Name</th><th>Employee Designation</th><th>Employee Department</th></tr>");
	for(User e : list){
		out.println("<tbody><tr><td>"+e.getEid()+"</td>"+"<td>"+e.getEname()+"</td>"+"<td>"+e.getEdes()+"</td>"+"<td>"+e.getEdep()+"</td></tr></tbody>");
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
</form>
</body>
</html>