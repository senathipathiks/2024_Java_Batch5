<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<style>
h1{
color:white
}
body{
background-image: linear-gradient(#0f0c29,#302b63,#24243e);
background-repeat:no-repeat;
background-size: cover;
height:440px;
background-attachment: fixed;
}

#b1:hover,#b2:hover,#b3:hover,#b4:hover,#b5:hover{
transform:scale(1.01);
}
@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
#cont{
  animation-name: ani;
  animation-duration: 3s;
  animation-timing-function: ease;
  animation-direction: forwards;
  animation-iteration-count: 1;
}
</style>
<title>Buttons</title>
</head>
<body>
<div id="cont" align="center">
<br>
<h1 align="center" class="display-4">Dashboard</h1>
<br>
<a href="Insert.jsp" id="b1"><input type="submit" class="btn btn-info"  value="Insert"></a><br><hr>
<a href="Update.jsp" id="b2" target="frame3"><input type="submit"  class="btn btn-info" value="Update"></a><br><hr>
<a href="Delete.jsp" id="b3" target="frame3"><input type="submit"  class="btn btn-info" value="Delete"></a><br><hr>
<a href="Find.jsp" id="b4" target="frame3"><input type="submit" class="btn btn-info" value="Find"></a><br><hr>
<a href="ViewAll.jsp" id="b5" target="frame3"><input type="submit" class="btn btn-info" value="ViewAll"></a><br>
</div>
</body>
</html>