<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Controller</title>
</head>
<body>
<center>

<%

int mul = Integer.parseInt(request.getParameter("num"));

out.println("<h1>Multiplication Table of "+mul+"</h1>");
out.println("<table border=1> "
		+ "<th colspan=2>"
		+mul+" Table</th>");
for(int i=1;i<=10;i++) {
	out.println("<tr><td>"+i+" * "+mul+" = "+(i*mul)+"</td></tr>");
}
out.println("</table>");

%>

</center>



</body>
</html>