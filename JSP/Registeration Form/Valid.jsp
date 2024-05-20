<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validation</title>
</head>
<body>
<%
	String name  = request.getParameter("name");
	String age  = request.getParameter("age");
	String Phnum  = request.getParameter("Phnum");
	String email  = request.getParameter("email");
	String pwd = request.getParameter("pwd");
	
	String email_regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    boolean result = email.matches(email_regex);
	
    String pass_regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
	
    
	if(!name.equals(" ")&& age.length()>=1 && age.length()<=100 && Phnum.length()==10 && result && pwd.matches(pass_regex))
	{
%>
		<jsp:forward page="LoginSuccess.jsp"></jsp:forward>
		<%
	}
	else
	{ 
		%>
				<jsp:include page="Register.jsp" />	
       <%   
				out.print("<center><h1><font color=red>Invalid User Details</font></h1></center>");
					
		
	}		
%>

</body>
</html>