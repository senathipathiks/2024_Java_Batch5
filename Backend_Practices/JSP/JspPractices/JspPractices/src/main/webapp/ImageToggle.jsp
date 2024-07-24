<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Image Toggle</title>
</head>
<style>

#but{
width: 150px;
height: 30px;
border-radius: 5px;
background-color: blue;
color: orange;
border: none;
font-weight:1000;
}

#but:hover{
width: 180px;
height: 40px;
}

</style>
<body>

<center>

<center>
		<h2>Toggle Button</h2>
		<button onclick="toggleImage()" id="but">Toggle Image</button> <br> <br>
		<img id="image" src="./Images/download.png" width="300" height="300">
	</center>
	
	

</center>

<script>
		function toggleImage()
		{
			var img = document.getElementById("image");
			
			if(img.src.match("download")){
				img.src = "./Images/sachin.png";
			} else{
				img.src = "./Images/download.png";
			}
		}
	</script>

</body>
</html>