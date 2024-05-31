<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

body{
background-image:url('./Images/emplbg.png');

}


form{
padding-top:15%;
font-weight:bold;
	font-size:1.5rem;
}
#div{

border: solid 2px transparent;
	width: 60%;
	height:60%;
    padding-bottom: 3%;
	background-color: transparent;
	box-shadow: 15px 9px 10px 3px rgb(100, 254, 233);
	border-radius:20px;
}
#btn{
background-color:lightbrown;
width:25%;
height:10%;
padding:10px;
border-radius:15px;
margin-top:20px;
font-weight:bold;
}
</style>
<body>
<center>
<form action="JdbcMainservlet" method="post">
<div id="div">

<h1>Filter Applicant by Job Post</h1>
Applied Posts              : 
	    <input type="text" name="desg" class="in" required>
	    <br><input type="submit" value="Filter" name="button" id="btn">
</div>

</form>

</center>
</body>
</html>