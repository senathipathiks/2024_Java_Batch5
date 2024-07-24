<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Navbar.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
<link rel="stylesheet" href="Style.css">


<style>

body{

 height: 100vh;
    margin: 0;
    background-size: 400% 400%;
    background-image: linear-gradient(45deg, #ff9a9e 0%, #fad0c4 25%, #fad0c4 50%, #ff9a9e 75%, #ff9a9e 100%);
    animation: gradient 15s ease infinite;
}

.form-container {
  width: 320px;
  border-radius: 0.75rem;
  background-color: rgba(17, 24, 39, 1);
  padding: 2rem;
  color: rgba(243, 244, 246, 1);
}

.title {
  text-align: center;
  font-size: 1.5rem;
  line-height: 2rem;
  font-weight: 700;
}

.form {
  margin-top: 1.5rem;
}

.input-group {
  margin-top: 0.25rem;
  font-size: 0.875rem;
  line-height: 1.25rem;
}

.input-group label {
  display: block;
  color: white;
  margin-bottom: 4px;
}

.input-group input {
  width: 80%;
  border-radius: 0.375rem;
  border: 1px solid rgba(55, 65, 81, 1);
  outline: 0;
  background-color: rgba(17, 24, 39, 1);
  padding: 0.75rem 1rem;
  color: rgba(243, 244, 246, 1);
}

.input-group input:focus {
  border-color: rgba(167, 139, 250);
}

.button2 {
  display: inline-block;
  transition: all 0.2s ease-in;
  position: relative;
  overflow: hidden;
  z-index: 1;
  color: #090909;
  padding: 0.7em 1.7em;
  cursor: pointer;
  font-size: 18px;
  border-radius: 0.5em;
  background: #e8e8e8;
  border: 1px solid #e8e8e8;
  box-shadow: 6px 6px 12px #c5c5c5, -6px -6px 12px #ffffff;
  margin-top:5%;
}

.button2:active {
  color: #666;
  box-shadow: inset 4px 4px 12px #c5c5c5, inset -4px -4px 12px #ffffff;
}

.button2:before {
  content: "";
  position: absolute;
  left: 50%;
  transform: translateX(-50%) scaleY(1) scaleX(1.25);
  top: 100%;
  width: 140%;
  height: 180%;
  background-color: rgba(0, 0, 0, 0.05);
  border-radius: 50%;
  display: block;
  transition: all 0.5s 0.1s cubic-bezier(0.55, 0, 0.1, 1);
  z-index: -1;
}

.button2:after {
  content: "";
  position: absolute;
  left: 55%;
  transform: translateX(-50%) scaleY(1) scaleX(1.45);
  top: 180%;
  width: 160%;
  height: 190%;
  background-color: #009087;
  border-radius: 50%;
  display: block;
  transition: all 0.5s 0.1s cubic-bezier(0.55, 0, 0.1, 1);
  z-index: -1;
}

.button2:hover {
  color: #ffffff;
  border: 1px solid #009087;
}

.button2:hover:before {
  top: -35%;
  background-color: #009087;
  transform: translateX(-50%) scaleY(1.3) scaleX(0.8);
}

.button2:hover:after {
  top: -45%;
  background-color: purple;
  transform: translateX(-50%) scaleY(1.3) scaleX(0.8);
}

#inserth2{

padding-top:10%;
}

@keyframes gradient {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}



</style>

</head>
<body>

	<center>

		<h2 id="inserth2">Enter Student Details</h2>

		<!-- <form action="Insertion" method="post" modelAttribute="bean">

			Student Name:<br>
			<input type="text" name="studName"><br>
			<br> Student Email:<br>
			<input type="email" name="studEmail"><br>
			<br> Password:<br>
			<input type="password" name="password"><br>
			<br> <input type="submit" name="button" value="Insert"><br>
			<br>

		</form> -->
		
		<div class="form-container">
	<p class="title">Insert Page</p>
	<form class="form" action="Insertion" method="post" modelAttribute="bean">
		<div class="input-group">
			<label for="username">Student Name</label>
			<input type="text" name="studName" id="username" placeholder="">
		</div>
		<div class="input-group">
			<label for="city">Student City</label>
			<input type="text" name="studCity" id="username" placeholder="">
		</div>
		
		<button class="button2" type="submit" name="button" value="Insert">Insert</button>
	</form></div>
	
	
		<%
		String result = (String) request.getAttribute("Action");

		if (result != null) {
			if ("Success".equals(result)) {
				out.print("<h3 style=color:green>Student Inserted Successfully</h3>");
			} else {
				out.print("<h3 style=color:red>Student Inserted Failed</h3>");
			}
		}
		%>

	</center>
</body>
</html>