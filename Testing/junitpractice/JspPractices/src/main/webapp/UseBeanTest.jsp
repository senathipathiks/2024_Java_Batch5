<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.nandha.jsp.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Use Bean Test</title>
</head>
<body>

<% 

int id=Integer.parseInt(request.getParameter("stuId"));

String name = request.getParameter("stuName");
String city = request.getParameter("stuCity");
Student stu = new Student();
stu.setStuId(id);
stu.setStuName(name);
stu.setStuCity(city);
out.println(stu.getStuId());
out.println(stu.getStuName());
out.println(stu.getStuCity());

%>

</body>
</html>