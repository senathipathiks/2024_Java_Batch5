<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.sms.bean.Student, java.util.*" %>
    <%@ include file="Find.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Success</title>
</head>
<body>



<% 

out.println("<center><h3 style=color:green>Successfully Found</h3></center>");


LinkedList<Student> list = (LinkedList<Student>) request.getAttribute("list");


out.println("<table align=center border=3px><tr><th>Student ID</th><th>Student Name</th><th>Student Email</th><th>Password</th></tr>");

for(Student li:list){

out.println("<tr><td>"+li.getStudid()+"</td><td>"+li.getStudName()+"</td><td>"+li.getStudEmail()+"</td><td>"+li.getPassword()+"</td></tr>");
}

out.println("</table>");

%>


</body>
</html>