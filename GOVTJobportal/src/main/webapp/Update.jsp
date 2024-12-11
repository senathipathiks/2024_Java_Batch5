<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{

    background-image:url('./Images/emplbg.png');
    
}
#update{
	border: solid 2px transparent;
	width: 60%;
    padding-bottom: 3%;
	background-color: transparent;
	box-shadow: 15px 9px 10px 3px Lightyellow;
	border-radius:20px;
	font-weight:bold;
	font-size:1.5rem;
}
form{
padding-top:10%;
}
input{
height:50px;
width:300px;
border-radius:10px;
border:transparent;

}
#btn{
background-color:Lightyellow;
width:25%;
height:10%;
padding:20px;
border-radius:15px;
font-weight:bold;

}
</style>
</head>
<body>
<center>
	
		<form action="JdbcMainservlet" method="post">
		<div id="update">
			<h1>Edit Applicant profile </h1><br>         
			   
			
					Applicant    ID    : 
					<input type="text" name="eid" class="in" required><br><br>
					Applicant   Name    :
					<input type="text" name="name" class="in" required><br>
					<br>
					Applied Job  Post   :
					<input type="text" name="desg" class="in" required><br>
					<br>
					Application Status  :
					<input type="text" name="salary" class="in" required><br>
					<br><input type="Submit" value="update" name="button" id="btn">
					</div>
			</form>
	


</center>
</body>
</html>