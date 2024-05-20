<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
		<%
			int n1= Integer.parseInt(request.getParameter("n1"));
		    int n2 = Integer.parseInt(request.getParameter("n2"));
			
		    int result = 0;
		    
		    if("add".equals(request.getParameter("cl"))){
		    	result = n1+n2;
		    }
		    else if("sub".equals(request.getParameter("cl"))){
		    	result = n1-n2;
		    }
		    else if("mul".equals(request.getParameter("cl"))){
		    	result = n1*n2;
		    }
		    else if("div".equals(request.getParameter("cl"))){
		    	result = n1/n2;
		    }
			
		    out.print("The result is : "+ result);
		%>
		
		
		
</body>
</html>