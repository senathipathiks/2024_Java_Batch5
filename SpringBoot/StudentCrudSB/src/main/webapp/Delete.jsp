<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<style>
h1{
color:rgb(82, 122, 122);
}
form{
background-color:rgb(255, 179, 209);
padding:4rem;
margin:0px auto;
width:50%

}
select{
	width:200px;
	height:30px;
}

input[type="submit"]{
border:none;
 width:100px;
 height:30px;
 background-color:rgba(28, 180, 28, 0.605);
 border-radius:3px;
 font-weight:bold;
 color:blue;
 font-size:20px;
}
label{
font-weight:bold;
font-size:20px;
color:rgb(191, 64, 128);
}
body{
background-image:url("https://images.pexels.com/photos/6985136/pexels-photo-6985136.jpeg?cs=srgb&dl=pexels-codioful-6985136.jpg&fm=jpg");

}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="Deletion" method="post" modelAttribute="bean">
<h1>Delete Student by ID</h1>
<label>ID</label><br><br>
	   <select name="sid">
	   <option selected>Select ID </option>
	   <c:forEach items="${IdList}" var="id" >
      <option value="${id}">${id}</option>
      </c:forEach>
      </select>
	  
	  <br><br><input type="Submit" value="Delete" name="button">
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