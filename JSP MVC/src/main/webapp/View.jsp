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

padding:4rem;
margin:0px auto;
width:50%

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
</head>
<body>
<form action = "Controller" method="get" >
<center>
<input type="submit" name="action" value="View">
</center>
</form>

</body>
</html>