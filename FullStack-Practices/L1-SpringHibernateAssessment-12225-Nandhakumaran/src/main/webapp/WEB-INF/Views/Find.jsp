<%@page import="com.shp.bean.Meet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	    <%@ include file="Navbar.jsp" %>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find By ID</title>

<style>

body {
	 background-image:
		url('https://images.pexels.com/photos/260928/pexels-photo-260928.jpeg?auto=compress&cs=tinysrgb&w=600');
	background-attachment: fixed;
	background-position: center;
	background-size: 100% 100%;
	
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
	padding-top:7%;
	gap:10%;
}

</style>
</head>
<body>
<center>
    
    <div id="maindiv">
	<div>
	<form action="Searching" method="post">
		<h1>Find User Details By ID</h1>
		<select name="bookingid">
			<option selected><font>Select ID</font></option>
			<c:forEach items="${IdList}" var="bookingid">
				<option value="${bookingid}">${bookingid}</option>
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
	<p class="title">Find By ID</p>
	<form class="form" action="Updation" method="post" modelAttribute="bean">
	<div class="input-group">
			<label for="userId">Booking ID</label>
			<input type="text" name="bookingid" placeholder="BookingID" value="${meet.getBookingid()}" readonly>
		</div>
		<div class="input-group">
			<label for="userId">User ID</label>
			<input type="text" name="meetUserid" placeholder="UserId" value="${meet.getMeetUserid()}" readonly>
		</div>
		<div class="input-group">
			<label for="userId">Room ID</label>
			<input type="text" name="meetRoomid" placeholder="RoomId" value="${meet.getMeetRoomid()}" readonly>
		</div>
		<div class="input-group">
			<label for="username">Name</label>
			<input type="text" name="meetUserName"  placeholder="UserName" value="${meet.getMeetUserName()}" readonly>
		</div>
		<div class="input-group">
			<label for="emailid">Meeting Starting Date and Time</label>
			<input type="text" name="meetStartTime" placeholder="MeetingStartTime" value="${meet.getMeetStartTime()}" readonly>
		</div>
		<div class="input-group">
			<label for="password">Meeting Ending Date and Time</label>
			<input type="text" name="meetEndTime" placeholder="MeetingEndTime" value="${meet.getMeetEndTime()}" readonly>
		</div>
	</form></div></div>
	
	<%
		String result = (String) request.getAttribute("Action");
			Meet student = (Meet) request.getAttribute("student");
		 
			if (result != null) {
		 
				if (result.equals("Success")) {
			/* out.print("<h3><font color=green>"
					+ student.getStudName()+ student.getStudEmail()+ student.getPassword()
					+"</font></h3>"); */
			out.print("<h3><font color=white>Data Found Successfully</font></h3>");

				} else {
			out.print("<h3><font color=red>Finding Operation is Failure</font></h3>");
				}
			}
		%>
	
	</center>
</body>
</html>