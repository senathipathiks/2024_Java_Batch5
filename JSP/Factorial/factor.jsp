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
	int number = Integer.parseInt(request.getParameter("n")),fact = 1;
	for(int i=1;i<=number;i++){    
       fact=fact*i;    
	}    
    out.print("Factorial of "+number+" is: "+ fact);    
%>
	
	
</body>
</html>