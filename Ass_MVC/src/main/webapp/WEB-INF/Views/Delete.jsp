<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
			body{
                background-color: aliceblue;
            }
           
            h2{
                color:rgba(15,77,134,255);
            }
            table{
                background-color:lightpink;
                color: aliceblue;
                padding: 10px 10px;
                border-radius: 25px;
                font-weight: bold;
                font-size: 15px;
                border-width:10px;
                
                border-color: white;
                margin-top:10px;
                margin-left:10px;
                
            }
            table td{
                padding: 10px 10px;
                border-radius:2px;
                border-width:3px;
                border-color: white;
            }
</style>
</head>
<body>
<center>
<form action="Deletion" method="post" modelAttribute="bean">
<table>
<h1>Delete Employee by ID</h1>
<tr><h2>ID :
	   <select name="eid">
	   <option selected>Select ID </option>

	   <c:forEach items="${idList}" var="id" >

      <option value="${id}">${id}</option>

      </c:forEach></tr>
      
      </select><br>

	  <br><input type="Submit" value="Delete" name="button">
</h2>
</form>
</center>
</table>
<%
 
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Deletion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Deletion Operation is Failure</font></h3>");
}
 
}
%>
 
</center>
</body>
</html>