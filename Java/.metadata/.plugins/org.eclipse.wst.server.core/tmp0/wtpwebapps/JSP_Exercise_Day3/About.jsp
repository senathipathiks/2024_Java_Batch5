<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style>
body{
background-image: linear-gradient(#0f0c29,#302b63,#24243e);
background-repeat:no-repeat;
background-size: cover;
background-attachment:fixed;
}
#content{
position: fixed;
  inset: 0;
  width: fit-content;
  height: fit-content;
  margin: auto;
}
p{
color:white;}
@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
a{
text-decoration:none;
color:white;
}
</style>
<style>
body{
background-attachment: fixed;
background-repeat: no-repeat;
background-size: cover;
}
#img{

width:500px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<p class="display-1 text-center">About us</p>
<div class="row">
<div class="col-md-6 align-content-center">
<img id="img" src="about.jpg">
</div>

<div class="col-md-6 align-content-center">
<p>About Our Employee Management System
At EMS, we recognize that managing employees efficiently is crucial for organizational success. Our Employee Management System (EMS) is designed to simplify HR processes, enhance productivity, and foster employee satisfaction.
<br>
Key Features of Our EMS:
Streamlined HR Functions: Our EMS acts as a single source of truth, integrating essential HR functions such as recruitment, onboarding, time and attendance tracking, performance management, training, payroll, and benefits administration.
Automation: Say goodbye to manual paperwork! Our system automates routine tasks, allowing HR professionals to focus on strategic initiatives.
Analytics-Driven Insights: We harness data analytics to provide actionable insights. From identifying trends to predicting workforce needs, our EMS empowers informed decision-making.

<br>
Our Commitment:
At EMS, we are committed to delivering an intuitive, user-friendly EMS that enhances your HR operations. Our dedicated support team ensures a seamless experience for you and your employees.

Join us on this journey toward efficient workforce management!
<br>
Feel free to customize the content above to align with your company’s unique values and mission. If you need further assistance or have specific requirements, don’t hesitate to reach out.</p>
</div>

</div>
</div>
</body>
</html>