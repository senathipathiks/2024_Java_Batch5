<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Login" method="post" modelAttribute="bean" >
<center><h1>Login</h1></center>
<table align="center" cellpadding = "10px" >
            
            <tr>
                <td>Enter User Name :</td>
                <td><input type="text"  placeholder="Enter  Name" name="username" required></td>
            </tr>
            <tr>
                <td>Enter Password :</td>
                <td><input type="password" placeholder="Enter password" name="password" required></td>
            </tr>
            
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="ins" value="Login" ></td>
            </tr>
</table>
</form>
<center>
<%
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Login Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Login Operation is Failure</font></h3></div>");
}
 
}
 
 
%>
</center>
</body>
</html>