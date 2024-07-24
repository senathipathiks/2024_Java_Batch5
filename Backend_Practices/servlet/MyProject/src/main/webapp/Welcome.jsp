<%@page import="java.io.PrintWriter"%>
<%@page import="java.awt.color.ProfileDataException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body >
<%



///String name = request.getParameter("uname");

///out.println("<center><h1>Hi "+name+" </h1></center>");

///cookies
///Cookie cookie[] = request.getCookies();
///out.println("<center><h1>Hi "+cookie[0].getValue()+" </h1></center>");

///for(Cookie c:cookie){
///	System.out.println(c.getName()+"  "+c.getValue());}

///Session

String name = session.getAttribute("uname").toString();
out.println("<center><h1>Hi "+name+" </h1></center>");

%>
<center>

 <!-- <h1>Welcome ${param.message}</h1>-->
<h2 > Welcome to your Inbox</h2>

</center>

<%
///out.println("<center><h2><a style=text-decoration:none href= Send.jsp?uname="+cookie[0].getValue()+">Send Mail !!!</a></h2></center>");
out.println("<center><h2><a style=text-decoration:none href= Send.jsp?uname="+name+">Send Mail !!!</a></h2></center>");

%>


</body>
</html>