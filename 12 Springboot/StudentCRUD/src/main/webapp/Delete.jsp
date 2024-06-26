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
<form action="Deletion" method="post">
<h1>Delete Employee by ID</h1>
ID               : 
	   <select name="sid">
	   <option selected>Select ID </option>
	   <c:forEach items="${IdList}" var="sid" >
      <option value="${sid}">${sid}</option>
      </c:forEach>
      </select>
	  
	  <br><input type="Submit" value="Delete" name="button">

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
</form>
<form action="DeletionByName" method="post">
<h1>Delete Employee by Name</h1>
Name               : 
	   <select name="sname">
	   <option selected>Select Name </option>
	   <c:forEach items="${NameList}" var="sname" >
      <option value="${sname}">${sname}</option>
      </c:forEach>
      </select>
	  
	  <br><input type="Submit" value="Delete" name="button">

<%

String result1 = (String) request.getAttribute("Action1");

if(result1!=null){
	 
if(result1.equals("Success")){
	 out.print("<h3><font color=green>Deletion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Deletion Operation is Failure</font></h3>");
}

}
%>
</form>

</center>
</body>
</html>