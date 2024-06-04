<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Management System</title>

<style>
body {
	margin: 0;
	padding: 0;
	width: 100%;
	height:70%;
	background: linear-gradient(0deg, rgba(34,193,195,1) 0%, rgba(253,187,45,1) 100%);
	display: flex;
	justify-content: center;
	align-items: center;

animation:ani 3s ease-in 1 forwards;

}


@keyframes ani{
0%{
opacity:0;
}
50%{
color:red;
}
100%{

opacity:1;
}

}


.content-container {
	text-align: center;
}

h1, img {
	position: relative;
	z-index: 1;
	color: white;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
	max-width: 90%;
	max-height: 90%;
	margin: 0 auto;
	padding: 20px;
}

img {

	
	box-shadow: 5px 5px 10px rgba(0, 0, 0, 0);
	animation: rise 20s ease forwards;
	height:540px;
	width: 1500px;
}

</style>
</head>
<body>

	<div class="content-container">
		<h1>Welcome to the Book Management System</h1>
		<img
			src="https://www.studentprojects.live/wp-content/uploads/2022/02/Library-Management-System.jpg"
			alt="Lake Bled">
	</div>

</body>
</html>


