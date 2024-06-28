<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Calculator" method="post" modelAttribute="bean" >
<center><h1>Calculator</h1></center>
<table align="center" cellpadding = "10px" >
            
            <tr>
                <td>Enter Number 1:</td>
                <td><input type="number"  placeholder="Enter  Number 1" name="num" required></td>
            </tr>
            <tr>
                <td>Enter Number 2 :</td>
                <td><input type="number" placeholder="Enter Number 2" name="number" required></td>
            </tr>
            
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="button" value="add" >
                <input type="submit" class="button" name="button" value="sub" >
                <input type="submit" class="button" name="button" value="mul" >
                <input type="submit" class="button" name="button" value="div" ></td>
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