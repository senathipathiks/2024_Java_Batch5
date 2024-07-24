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
<style>
h1{
color:rgb(255, 4, 4);
}
body{
background: rgb(231,252,255);
background: linear-gradient(90deg, rgba(231,252,255,1) 35%, rgba(245,240,255,1) 100%);
}
select,input{
width:250px;
height:30px;
}
input[type="submit"]{
background-color: rgb(69, 117, 249);
width:100px;
height :30px;
border: none;
color: white;
font-weight: bold;
font-size: 15px;
}
table{
border-color:rgb(251, 103, 12);
}
td{
color:rgb(251, 103, 12);
font-weight:bold;
}

</style>
<body>
<center>
<form action="Fetch" method="post">
<h1>Update Student by ID</h1>
<table  cellpadding="10px" border="7">
    <tr>
      <td>ID : </td>
	  <td><select name="sid">
	      <option selected>Select ID </option>
	      <c:forEach items="${IdList}" var="id" >
              <option value="${id}">${id}</option>
          </c:forEach>
       </select>
	  </td>
	</tr>
</table>
	  <br><input type="Submit" value="Fetch" name="button">
</form>
<br><br>
<form action="Updation" method="post" modelAttribute="bean">
<center>
<table  cellpadding="5px" border="7" >
     
	 <input type="hidden" name="id" placeholder="ID" value="${Stud.getId()}">
	 
     <tr>
         <td>Name :</td>
	     <td><input type="text" name="sname" placeholder="Student Name" value="${Stud.getSname()}"></td>
	 </tr>
	 <tr>
	     <td>City :</td>
	     <td><input type="text" name="scity" placeholder="Student city" value="${Stud.getScity()}"></td>
	 </tr>
</table>  
	    <br><input type="Submit" value="Update" name="button">
</center>

</form>
</center>
<%

String result = (String) request.getAttribute("Action");

if(result!=null){
	 
if(result.equals("Success")){
	 out.print("<center><h1><font color=green>Update Operation is Successfully Done</font></h1></center>");
}
else{
	 out.print("<center><h1><font color=red>Update Operation is Failure</font></h1></center>");
}

}
%>

</center>
</body>
</html>