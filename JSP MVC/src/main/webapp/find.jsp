<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image:url("img.jpg");
background-repeate:no-repeate;
background-size:cover;
}
form{
background-color:rgb(196, 255, 179);
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
}


</style>
<script>
function validate(){
	var id = document.forms["employeeForm"]["id"].value;
	if(id==""){
		alert("Enter id to find");
		return false;
	}
}
</script>
</head>
<body>
<form action ="Controller"  method="get" name="employeeForm" onsubmit="return validate();">
<center>
<label>Enter the Emp id to find:</label><br><br>
<input type="number" name="id" ><br><br>
<input type="submit" name="action" value="Find">
</center> 
</form>

</body>
</html>