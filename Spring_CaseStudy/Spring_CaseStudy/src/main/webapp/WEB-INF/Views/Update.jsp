<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

<style>
h1,p,td,h3{
color:white
}
body{
background-image: linear-gradient(#0f0c29,#302b63,#24243e);
background-repeat:no-repeat;
background-size: cover;
height:440px;
background-attachment: fixed;
}

#b1:hover,#b2:hover,#b3:hover,#b4:hover,#b5:hover{
transform:scale(1.01);
}
@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
#cont{
  animation-name: ani;
  animation-duration: 3s;
  animation-timing-function: ease;
  animation-direction: forwards;
  animation-iteration-count: 1;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="Fetch" method="post" modelAttribute="bean">
<h1 class="display-1">Update Employee by ID</h1>
<h3 class="display-2">Choose ID:</h3>
	   <select name="sid">
	   <option selected>Select ID </option>
	   <c:forEach items="${IdList}" var="sid" >
      <option value="${sid}">${sid}</option>
      </c:forEach>
      </select>
	  
	  <br><br><input class="btn btn-warning" type="Submit" value="Fetch" name="button">
</form>


<br>
<form action="Updation" method="post" modelAttribute="bean">
<table>
	<tr>
		<td>
			Student ID:
		</td>
		<td>
			<input type="text" disabled name="sid" plcaeholder="Student ID" value="${studfetch.getSid() }" required>
		</td>
	</tr>
	<tr>
		<td>
			Student Name:
		</td>
		<td>
			<input type="text" name="sname" plcaeholder="Student Name" value="${studfetch.getSname() }" required>
		</td>
	</tr>
	<tr>
		<td>
			Student City:
		</td>
		<td>
			<input type="text" name="scity" placeholder="Student City" value="${studfetch.getScity() }" required>
		</td>
</table>

</form>




<%
 
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3 class=display-1><font color=green>Updation Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3 class=display-1><font color=red>Updation Operation is Failure</font></h3>");
}
 
}
%>
 
</center>
</body>
</html>