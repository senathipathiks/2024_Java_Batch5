<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
#form{

background-color: transparent;
	box-shadow: 15px 9px 10px 3px rgb(700, 254, 500);
	border-radius:20px;
	font-weight:bold;
	width: 60%;
	height:30%;
	
	
}
form{
padding-top:15%;
font-size:1.2rem;
font-weight:bold;
}
body{
background-image:url('./Images/emplbg.png');

}
input{

height:30px;
width:200px;
border-radius:10px;
border:transparent;


}
#btn{
width:70%;
	height:60%;
	background-color:pink;
width:25%;
height:10%;
padding:10px;
border-radius:15px;
margin-top:20px;
font-weight:bold;
}



</style>
<center>
<form action="JdbcMainservlet" method="post">
<div id="form">
<h1>Delete Applicant  by ID</h1>
ID               : 
	    <input type="text" name="eid"  required>
	    <br><input type="Submit" value="Delete" name="button" id="btn">


</div>

</form>

</center>
</body>
</html>