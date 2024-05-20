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
			int n= Integer.parseInt(request.getParameter("n"));
		    
		
			for(int i=1;i<=10;i++)
			{
				out.print(i+" * "+ n +" = "+ i*n+"<br><br>"); 
			}
			    
		%>
</body>
</html>