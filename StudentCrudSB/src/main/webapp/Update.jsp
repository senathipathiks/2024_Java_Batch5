<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
 
</head>
<body>
<center>
<form action="Fetch" method="post" modelAttribute="bean">
<h1>Update Student by ID</h1>
ID               :
	   <select name="id">
	   <option selected>Select ID </option>
	   <c:forEach items="${IdList}" var="sid" >
      <option value="${sid}">${sid}</option>
      </c:forEach>
      </select>
	  
	  <br><input type="Submit" value="Fetch" name="action">
</form>
 
 
<form action="Updation" method="post" modelAttribute="bean">
<center>
<h1 >Insert Student Details</h1>
<input type="hidden"  name="sid" placeholder="ID" value=${Stud.getSid()} ><br><br>
Enter Student Name: <input type="text"  name="sname" placeholder="Student Name" value=${Stud.getSname()}><br><br>
Enter Student City: <input type="text"  name="scity" placeholder="Student city" value=${Stud.getScity()}  ><br><br>
 
<input type="submit"  name="action" value="Update" ><br>
</center>
</form>
 
 
 
 
<%
 
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Updation Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Updation Operation is Failure</font></h3>");
}
 
}
%>
 
</center>
 
</body>
</html>