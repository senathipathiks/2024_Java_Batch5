<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./webapp/pages/style.css">

</head>
<body>

<center>

<h1>Calculator</h1>
<form action="calculation" method="post">
       
                
            
                Number 1:
                <input type="text" name="num1" ><br><br>
                
           		Number 2:
                <input type="text" name="num2" ><br><br>
                
            	<input type="submit" name="op" value="add">
                <input type="submit" name="op" value="sub"> 
                <input type="submit" name="op" value="mul"> 
                <input type="submit" name="op" value="div">
                
          
    </form>
    
    <%
 String Action = (String) request.getAttribute("Action");
String result = (String) request.getAttribute("result");

 if("Success".equals(Action)){
out.println("<h2>Result :</h2>");
out.print("<h3><font color=green>" + result + "</font></h3>");
 }
 else if("Failure".equals(Action)){
	 out.println("<h2>Calculation Failed</h2>");

 }
%>

</center>

</body>
</html>