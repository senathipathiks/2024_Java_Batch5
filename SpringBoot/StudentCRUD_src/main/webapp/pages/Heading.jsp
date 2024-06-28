<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	@import url("https://fonts.googleapis.com/css2?family=Alumni+Sans:wght@400;600;700&display=swap");
	
	$blue: #2962ff;
	
	* {
		box-sizing: border-box;
		margin: 0;
		padding: 0;
	}
	
	body {
		font-family: "Alumni Sans", sans-serif;
		font-size: 16px;
		background-image: url("https://media.istockphoto.com/id/1701407934/photo/red-and-blue-lightning-abstract-electrical-background.jpg?s=2048x2048&w=is&k=20&c=ydgSXfFHJ-STO5ch2NAAbE8Ud9Fn8RCO0ee32LomLbE=");
 			background-repeat: no-repeat;
 			background-attachment: fixed;
	}
	
	section {
		display: flex;
		flex-direction: column;
		min-height: 100vh;
		font-size: 2em;
		justify-content: center;
		align-items: center;
		color: #fff;
		text-transform: uppercase;
		gap: 30px;
	}
	
	h1 {
		font-size: 2.5em;
		text-decoration: underline;
		@media (max-width: 768px) {
			font-size: 1.3em;
		}
	}
	
	.text-shadow {
		font-style: italic;
		text-transform: uppercase;
		color: transparent;
		-webkit-text-stroke: #fff;
		-webkit-text-stroke-width: 1px;
		text-shadow: 2px 2px 10px $blue;
		transition: all 0.5s ease-in-out;
		letter-spacing: 0.3em;
		animation: flicker 0.5s ease-in-out infinite alternate;
		font-size: 30px;
	
		&:hover {
			color: #fff;
		}
	}
	
	.tags small {
		@media (max-width: 768px) {
			font-size: 1em;
		}
	}
	
	@keyframes flicker {
		0% {
			opacity: 0.5;
			text-shadow: 2px 2px 10px $blue;
		}
		100% {
			opacity: 1;
			text-shadow: 2px 2px 20px $blue;
		}
	}
</style>

</head>
<body style="overflow: hidden;">
	<section>
	<div class="tags">
		<p class="text-shadow"><small>Electricity Board Sensus Management</small></p>
	</div>
	</section>	
</body>
</html>