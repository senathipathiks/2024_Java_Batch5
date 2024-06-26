<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student</title>
</head>
<body>
<form action="Insertion" method="post" modelAttribute="bean">
<center>
<h1 id="head1">Insert Student Details</h1>
	  	Name         :
	    <input type="text" name="sname" class="in" required><br>
	    <br>City  :
	    <input type="text" name="scity" class="in" required><br>
	   
	    <br><input type="Submit" value="Insert" name="button">
</center>

</form>

<%
String result = (String) request.getAttribute("Action");

if(result!=null){
	 
if(result.equals("Success")){
	 out.print("<h3><font color=green>Insertion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
}

}

%>

</body>
</html>