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
background-image: linear-gradient(#200122,#6f0000);
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
<title>TMS</title>
</head>
<body>
<center>
<form action="Fetch" method="post" modelAttribute="bean">
<h1 class="display-1">Update Tender Details by ID</h1>
<h3 class="display-2">Choose ID:</h3>
	   <select name="tid">
	   <option selected>Select ID </option>
	   <c:forEach items="${IdList}" var="tid" >
      <option value="${tid}">${tid}</option>
      </c:forEach>
      </select>
	  
	  <br><br><input class="btn btn-warning" type="Submit" value="Fetch" name="button">
</form>


<br>
<form action="Updation" method="post" modelAttribute="bean">
<table>
	<tr>
		<td>
			Tender ID:
		</td>
		<td>
			<input type="text" disabled name="tid" plcaeholder="Tender ID" value="${tendfetch.getTid() }" required>
		</td>
	</tr>
	<tr>
		<td>
			Tender Project Name:
		</td>
		<td>
			<input type="text" name="tname" plcaeholder="Tender Project Name" value="${tendfetch.getTname() }" required>
		</td>
	</tr>
	<tr>
		<td>
			Tender City:
		</td>
		<td>
			<input type="text" name="tcity" placeholder="Project City" value="${tendfetch.getTcity() }" required>
		</td>
	</tr>
	<tr>
		<td>
			Tender Budget:
		</td>
		<td>
			<input type="text" name="tbudget" placeholder="Tender Budget" value="${tendfetch.getTbudget() }" required>
		</td>
	</tr>
	<tr>
		<td>
			Tender Description:
		</td>
		<td>
		<textarea rows="2" cols="23" input type="text" name="tdesc" value="${tendfetch.getTdesc() }" placeholder="Project Description" required></textarea>
		</td>
	</tr>
	<tr>
		<td>
			Tender Owner:
		</td>
		<td>
			<input type="text" name="towner" placeholder="Tender Owner Name" value="${tendfetch.getTowner() }" required>
		</td>
	</tr>
</table>
<br>
<div class="text-center">
	<input type="submit" class="btn btn-warning" name="button" value="Update">
</div>
</form>




<%
 
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3 align=center class=display-1><font color=green>Successfully Updated!</font></h3>");
}
else{
	 out.print("<h3 align=center class=display-1><font color=red>Updation Failure!!!</font></h3>");
}
 
}
%>
 
</center>
</body>
</html>