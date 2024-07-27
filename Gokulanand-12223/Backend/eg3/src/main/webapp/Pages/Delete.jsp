<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Page</title>
</head>

<style>
<style>
form
{
margin-top:150px;
}

	.button {
  text-decoration: none;
  position: relative;
  border: none;
  font-size: 14px;
  font-family: sans-serif;
  cursor: pointer;
  color: #fff;
  width: 9em;
  height: 3em;
  line-height: 2em;
  text-align: center;
  background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
  background-size: 300%;
  border-radius: 30px;
  z-index: 1;
}

.button:hover {
  animation: ani 8s linear infinite;
  border: none;
}

@keyframes ani {
  0% {
    background-position: 0%;
  }

  100% {
    background-position: 400%;
  }
}

.button:before {
  content: "";
  position: absolute;
  top: -5px;
  left: -5px;
  right: -5px;
  bottom: -5px;
  z-index: -1;
  background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
  background-size: 400%;
  border-radius: 35px;
  transition: 1s;
}

.button:hover::before {
  filter: blur(20px);
}

.button:active {
  background: linear-gradient(32deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
}
</style>
</style>

<body>
<center>
<form action="Deletion" method="post">
<h1 style="font-family: sans-serif; font-weight: bolder;"> Select Id to Delete</h1>
<h3 style="font-family: sans-serif;">ID</h3>
	   <select name="id">
	   <option selected>Select ID </option>
	   <c:forEach items="${IdList}" var="id" >
      <option value="${id}">${id}</option>
      </c:forEach>
      </select>
	  <br>
	  <br>
	  <input type="submit" class="button" value="Delete" name="button">
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