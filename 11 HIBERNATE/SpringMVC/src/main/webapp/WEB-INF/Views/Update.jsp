<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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