<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<%-- <%@ page errorPage="" %> <!--   by default it is false-->
<%@ page isErrorPage="true" %> <!-- it is a error page -->
<!-- isthreadsafe,buffer-8kb size,autoflush - defaultly true, --> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println(new Date());
RequestDispatcher rd = request.getRequestDispatcher("simple2.jsp");
request.setAttribute("uname","subash");
rd.forward(request,response);

%>

</body>
</html>