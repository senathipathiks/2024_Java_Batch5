<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Navbar.jsp" %>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

body {
    height: 100vh;
    margin: 0;
    background-size: 400% 400%;
    background-image: linear-gradient(45deg, #FFA07A 0%, #FFD700 25%, #FFD700 50%, #FFA07A 75%, #FFA07A 100%);
    animation: gradient 15s ease infinite;
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

select {
  -webkit-appearance: none;
  -moz-appearance: none;
  appearance: none;
  border: 0;
  outline: 0;
  font: inherit;
  width: 20em;
  height: 3em;
  padding: 0 4em 0 1em;
  background-color:black;
  color: white;
  border-radius: 0.25em;
  box-shadow: 0 0 1em 0 rgba(0, 0, 0, 0.2);
  cursor: pointer;
}

/* Style individual options */
select option {
  color: inherit;
  background-color: #320a28;
}

/* Remove focus outline */
select:focus {
  outline: none;
}

/* Remove IE arrow */
select::-ms-expand {
  display: none;
}


.btn-53,
.btn-53 *,
.btn-53 :after,
.btn-53 :before,
.btn-53:after,
.btn-53:before {
  border: 0 solid;
  box-sizing: border-box;
}

.btn-53 {
  -webkit-tap-highlight-color: transparent;
  -webkit-appearance: button;
  background-color: #000;
  background-image: none;
  color: #fff;
  cursor: pointer;
  font-family: ui-sans-serif, system-ui, -apple-system, BlinkMacSystemFont,
    Segoe UI, Roboto, Helvetica Neue, Arial, Noto Sans, sans-serif,
    Apple Color Emoji, Segoe UI Emoji, Segoe UI Symbol, Noto Color Emoji;
  font-size: 100%;
  line-height: 1.5;
  margin: 0;
  -webkit-mask-image: -webkit-radial-gradient(#000, #fff);
  padding: 0;
  margin-top:5%;
}

.btn-53:disabled {
  cursor: default;
}

.btn-53:-moz-focusring {
  outline: auto;
}

.btn-53 svg {
  display: block;
  vertical-align: middle;
}

.btn-53 [hidden] {
  display: none;
}

.btn-53 {
  border: 1px solid;
  border-radius: 999px;
  box-sizing: border-box;
  display: block;
  font-weight: 900;
  overflow: hidden;
  padding: 1.2rem 3rem;
  position: relative;
  text-transform: uppercase;
}

.btn-53 .original {
  background: #fff;
  color: #000;
  display: grid;
  inset: 0;
  place-content: center;
  position: absolute;
  transition: transform 0.2s cubic-bezier(0.87, 0, 0.13, 1);
}

.btn-53:hover .original {
  transform: translateY(100%);
}

.btn-53 .letters {
  display: inline-flex;
}

.btn-53 span {
  opacity: 0;
  transform: translateY(-15px);
  transition: transform 0.2s cubic-bezier(0.87, 0, 0.13, 1), opacity 0.2s;
}

.btn-53 span:nth-child(2n) {
  transform: translateY(15px);
}

.btn-53:hover span {
  opacity: 1;
  transform: translateY(0);
}

.btn-53:hover span:nth-child(2) {
  transition-delay: 0.1s;
}

.btn-53:hover span:nth-child(3) {
  transition-delay: 0.2s;
}

.btn-53:hover span:nth-child(4) {
  transition-delay: 0.3s;
}

.btn-53:hover span:nth-child(5) {
  transition-delay: 0.4s;
}

.btn-53:hover span:nth-child(6) {
  transition-delay: 0.5s;
}

#maindiv{
	display:flex;
	flex-direction:row;
	justify-content:center;
	align-items:center;
	padding-top:10%;
	gap:10%;
}

</style>
</head>
<body>
<center>
    
    <div id="maindiv">
	<div>
	<form action="Searching" method="post">
		<h1>Find Student Details</h1>
		<select name="studid">
			<option selected>Select ID</option>
			<c:forEach items="${IdList}" var="studid">
				<option value="${studid}">${studid}</option>
			</c:forEach>
		</select> <br>
<!-- 		<input type="Submit" value="Find" name="button">
 -->	
 <button class="btn-53" type="Submit" value="Find" name="button">
  <div class="original">FIND</div>
  <div class="letters">
    
    <span>F</span>
    <span>I</span>
    <span>N</span>
    <span>D</span>
  </div>
</button>
 </form>
 <form action="SearchingName" method="post" modelAttribute="bean">
		<h1>Find Student Details</h1>
		<select name="studName">
			<option selected>Select Name</option>
			<c:forEach items="${NameList}" var="studName">
				<option value="${studName}">${studName}</option>
			</c:forEach>
		</select> <br>
<!-- 		<input type="Submit" value="Find" name="button">
 -->	
 <button class="btn-53" type="Submit" value="Find" name="button">
  <div class="original">FIND</div>
  <div class="letters">
    
    <span>F</span>
    <span>I</span>
    <span>N</span>
    <span>D</span>
  </div>
</button>
 </form>
 </div>
 
 <div class="form-container">
	<p class="title">Data</p>
	<form class="form" >
	<div class="input-group">
			<label for="userId">Student ID</label>
			<input type="text" name="studid" placeholder="Student ID" value="${student.getStudid()}" readonly>
		</div>
		<div class="input-group">
			<label for="username">Student Name</label>
			<input type="text" name="studName"  placeholder="Student Name" value="${student.getStudName()}" readonly>
		</div>
		<div class="input-group">
			<label for="userCity">Student City</label>
			<input type="text" name="studCity" placeholder="Student city" value="${student.getStudCity()}" readonly>
		</div>
		
	</form></div></div>
	
	<%
		String result = (String) request.getAttribute("Action");
		 
			if (result != null) {
		 
				if (result.equals("Success")) {
			/* out.print("<h3><font color=green>"
					+ student.getStudName()+ student.getStudEmail()+ student.getPassword()
					+"</font></h3>"); */
			out.print("<h3><font color=green>Data Found Successfully</font></h3>");

				} else {
			out.print("<h3><font color=red>Finding Operation is Failure</font></h3>");
				}
			}
		%>
	
	</center>
</body>
</html>