<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.stu.bean.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("sid");
String name = request.getParameter("sname");
String city = request.getParameter("scity");
Student stu = new Student();
stu.setSid(id);
stu.setSname(name);
stu.setScity(city);
out.println(stu.getSid());
out.println(stu.getSname());
out.println(stu.getScity());
%>
</body>
</html>