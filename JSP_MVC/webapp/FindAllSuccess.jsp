<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="findall.jsp" %>
    <%@ page import="com.meena.util.StudUtil, java.util.*,com.meena.bean.Student1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
LinkedList<Student1> list=new LinkedList<Student1>();
list=(LinkedList)request.getAttribute("list");
out.print("<table border=1><tr>");
out.print("<th>studId</th>");
out.print("<th>StudName</th>");
out.print("<th>StudAge</th>");
out.print("<th>StudCity</th>");
out.print("</tr>");
for(Student1 stu1:list)
{
	out.print("<tr>");
	out.print("<td>"+stu1.getStudId()+"</td>");
	out.print("<td>"+stu1.getStudName()+"</td>");
	out.print("<td>"+stu1.getStudAge()+"</td>");
	out.print("<td>" + stu1.getStudCity()+"</td>");
	out.print("</tr>");
}
 
%>
</body>
</html>