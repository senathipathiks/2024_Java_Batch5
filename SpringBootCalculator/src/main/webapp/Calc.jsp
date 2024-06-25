<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<center><h1>CALCULATOR</h1></center>
<center>
<form action="Calculate" method="post" ModelAttribute="bean">
<br>
Number 1 :<input type="text" name="num1" /><br>
<br>
Number 2 :<input type="text" name="num2" /><br>
<br>
<input type="submit" name="but" value="Add" />
<input type="submit" name="but" value="Sub" />
<input type="submit" name="but" value="Mul" />
<input type="submit" name="but" value="Div" />
</center>
</form>
<%
String result =(String )request.getAttribute("Action");
 
	if(result!= null){
 
	out.print("<center>");
	out.println("<h2>Result :</h2>");
	 out.print("<h3><font color=g]reen><span>"+result+"</span></font></h3>" );
	 out.print("</center>");
	}
 
%>
</body>
</html>