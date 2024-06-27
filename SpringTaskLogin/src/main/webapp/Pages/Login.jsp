<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="LoginPage" method="post"  modelAttribute="bean">
Enter Name:<input type="text" name="username">
Enter Password:<input type="password" name="password">
<input type="submit" value="Login" name ="button" >
</form> 
 <% 
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Login is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Login is Failure</font></h3></div>");
}
 
}
 
%>

</body>
</html>