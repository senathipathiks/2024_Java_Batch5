<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student</title>
<style type="text/css">
h1{
color:rgb(255, 4, 4);
}
body{
background: rgb(231,252,255);
background: linear-gradient(90deg, rgba(231,252,255,1) 35%, rgba(245,240,255,1) 100%);
}
input{
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
</head>
<body>
<form action="Insertion" method="post" modelAttribute="bean">
<center>
<h1 id="head1">Insert Student Details</h1>
<table  cellpadding="5px" border="7" >
     <tr>
         <td>Name :</td>
	     <td><input type="text" name="sname" class="in" required></td>
	 </tr>
	 <tr>
	     <td>City :</td>
	     <td><input type="text" name="scity" class="in" required></td>
	 </tr>
</table>  
	    <br><input type="Submit" value="Insert" name="button">
</center>
</form>

<%
String result = (String) request.getAttribute("Action");

if(result!=null){
	 
if(result.equals("Success")){
	 out.print("<center><h1><font color=green>Insertion Operation is Successfully Done</font></h1></center>");
}
else{
	 out.print("<center><h1><font color=red>Insertion Operation is Failure</font></h1></div></center>");
}

}
%>

</body>
</html>