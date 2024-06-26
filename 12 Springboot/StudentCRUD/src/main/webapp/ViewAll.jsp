
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
.but[disabled]{
cursor:not-alllowed;
}
</style>
<script>
function enableFields(button) {
    const row = button.closest('tr');
    const textInputs = row.querySelectorAll('input[type="text"]');
    textInputs.forEach(input => input.removeAttribute('disabled'));
}
</script>

</head>
<body>
<center>
<form action="operation" method="post">
<h1>Student Details</h1>
<table>
<tr>
<th>Student Id</th>
<th>Student Name</th>
<th>Student City</th>
</tr>
 
 
 
<tr>
<c:forEach items="${Studlist}" var="stud">
<td><input class="but" type="text" value= "${stud.getSid()}" name="sid" disabled></td>
<td><input class="but" type="text" value= "${stud.getSname()}" name="sname" disabled></td>
<td><input class="but" type="text" value= "${stud.getScity()}" name="scity" disabled></td>
<td><input type="button" placeholder="Edit" onclick="enableFields(this)" value="Edit" id="edit"></td>
<td><input type="submit" placeholder="Save" value="Save" name="action"></td>
<td><input type="submit" placeholder="Remove" value="Delete" name="action" onclick="enableFields(this)"></td>
</tr>
</c:forEach>
<tr>
<td><input type="number" name="sid" placeholder="Enter sid"></td>
<td><input type="text" name="sname" placeholder="Enter sname"></td>
<td><input type="text" name="scity" placeholder="Enter scity"></td>
<td colspan="3"><input type="Submit" Value="Add" name="action"></td>
</tr>
</table>
</form>
<%
String result = (String) request.getAttribute("Action");
String result1 = (String) request.getAttribute("Action1");
String result2 = (String) request.getAttribute("Action2");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Updation Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Updation Operation is Failure</font></h3></div>");
}
 
}
 
if(result1!=null){
	
if(result1.equals("Success")){
	 out.print("<h3><font color=green>Deletion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Deletion Operation is Failure</font></h3></div>");
}
 
}
 
if(result2!=null){
	
if(result2.equals("Success")){
	 out.print("<h3><font color=green>Insertion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
}
 
}
 
 
%>
</center>
 
 
</body>

</html>