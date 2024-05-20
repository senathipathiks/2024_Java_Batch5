<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Toggle Images</title>
</head>
<body>

	<center>
		<h2>Toggle Button</h2>
		<button onclick="toggleImage()">Toggle Image</button> <br> <br>
		<img id="image" src="./Images/Dhoni.jpg" width="600" height="600">
	</center>
	
	<script>
		function toggleImage()
		{
			var img = document.getElementById("image");
			
			if(img.src.match("Dhoni")){
				img.src = "./Images/sachin.jpg";
			} else{
				img.src = "./Images/Dhoni.jpg";
			}
		}
	</script>
	
</body>
</html>