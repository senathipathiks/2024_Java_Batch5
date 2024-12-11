<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find</title>
<style>
body{
    background-image:url('./Images/emplbg.png');

}

 #find{
	border: solid 2px transparent;
	width: 60%;
	height:60%;
    padding-bottom: 3%;
	background-color: transparent;
	box-shadow: 15px 9px 10px 3px rgb(100, 254, 233);
	border-radius:20px;
	
}
form{
padding-top:15%;
font-weight:bold;
	font-size:1.5rem;
}

#btn{
background-color:cyan;
width:25%;
height:10%;
padding:10px;
border-radius:15px;
margin-top:20px;
font-weight:bold;
}
</style>

</head>
<body>
<center>
	
		<form action="JdbcMainservlet" method="get">
		   <div id="find">
			<h1>Find Applicant by ID</h1>
			ID               : 
					<input type="text" name="id" class="in" required>
					<br><input type="Submit" value="Find" name="search" id="btn">
					</div>
			</form>
	


</center>
</body>
</html>