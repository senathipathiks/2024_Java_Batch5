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
int num1=Integer.parseInt(request.getParameter("num"));
for(int i=1;i<=10;i++)
	{
		out.println(i+"*"+num1+"="+i*num1);
%>
<br>
<%
}
%>	


</body>
</html>