<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student</title>
<style>
form{
background-color:rgb(255, 179, 209);
padding:4rem;
margin:0px auto;
width:50%

}
input[type="number"]{
	width:300px;
	height:30px;
}
input[type="text"]{
	width:300px;
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
h1{
color:rgb(82, 122, 122);
}
body{
background-image:url("https://images.pexels.com/photos/6985136/pexels-photo-6985136.jpeg?cs=srgb&dl=pexels-codioful-6985136.jpg&fm=jpg");

}
</style>
</head>
<body>
<form action="Insertion" method="post" modelAttribute="bean">
<center>
<h1 id="head1">Insert Student Details</h1>
	  	<label>Name</label><br><br>
	    <input type="text" name="sname" class="in" required><br><br>
	    <label>City</label><br><br>
	    <input type="text" name="scity" class="in" required><br><br>
	   
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