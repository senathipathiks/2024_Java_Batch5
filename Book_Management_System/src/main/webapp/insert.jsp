<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>

<style>


*{

background: rgb(34,193,195);
background: linear-gradient(0deg, rgba(34,193,195,1) 0%, rgba(253,187,45,1) 100%);
background-attachment: fixed;
background-repeat: no-repeat;
}

}
button {
  width: 35px;
  height: 35px;
background: rgb(34,193,195);
  animation-name: example;
  animation-duration: 4s;
}

@keyframes example {
  0%   {background-color: red;}
  25%  {background-color: yellow;}
  50%  {background-color: blue;}
  100% {background-color: green;}
}
</style>
<script>
 
function insertvalidate(){
var id = document.forms["Inserting"]["id"].value;
var name = document.forms["Inserting"]["name"].value;
var author = document.forms["Inserting"]["author"].value;
var buys = document.forms["Inserting"]["buys"].value;
if(name == ""){
	alert("please fill the id !!!!");
	event.preventDefault();
}

</script>
</head>
<body>

	<form action="Controller" method="get" name="Inserting"
		onsubmit="return insertvalidate();">
		<center>
			<label>Book Id:</label><br> <br> <input type="number"
				name="id"><br> <br> <label>Book Name:</label><br>
			<br> <input type="text" name="name"><br> <br>
			<label>Book Author</label><br> <br> <input type="text"
				name="author"><br> <br> <label>Book Date
				Of Buy</label><br> <br> <input type="text" name="buys"><br>
			<br> <input type="submit" name="action" value="Insert">
		</center>
	</form>

</body>
</html>