<%@page import="com.sms.bean.Student"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sms.dao.SMSDao"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="com.mysql.cj.exceptions.RSAException"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
<style type="text/css">

body {
background-image: linear-gradient(120deg, #fdfbfb 0%, #ebedee 100%);  background-repeat: no-repeat;
  background-attachment: fixed;
  background-position: center;
  background-size: 100% 100%;
}
div{

padding: 5%;
background-color: lightblue;
}

table{
padding: 10%;
background-color: white;
}

</style>
</head>
<body>

<center><h1>Display Content</h1>

<%

SMSDao dao = new SMSDao();
int cnt=0;
try{
	LinkedList<Student> list = dao.viewAll();

	out.println("<div><table border=3px><tr><th>Student ID</th><th>Student Name</th><th>Student Email</th><th>Password</th></tr>");

	for(Student li : list) {
		out.println("<tr><td>"+li.getStudid()+"</td><td>"+li.getStudName()+"</td><td>"+li.getStudEmail()+"</td><td>"+li.getPassword()+"</td></tr>");
		cnt++;
	}
	out.println("</table></div>");
} catch (Exception e) {
	System.out.println(e);
}
if(cnt<1) {
out.println("No records found");
}

%>
</center>
</body>
</html>