<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int num = Integer.parseInt(request.getParameter("num"));

for(int i = 1 ; i <= 10 ; i++){
	out.println("<table><tr><td>"+i+"</td><td>*</td><td>"+num+"</td><td> = </td><td>"+(i*num)+"</td></tr></table>");
}
%>
</body>
</html>