<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style>
 		body{
		    margin:0;
		    padding:0;
		    box-sizing:border-box;
		    font-family: 'Montserrat', sans-serif;
		    color:#fff;
		    background-image: url("https://media.istockphoto.com/id/1701407934/photo/red-and-blue-lightning-abstract-electrical-background.jpg?s=2048x2048&w=is&k=20&c=ydgSXfFHJ-STO5ch2NAAbE8Ud9Fn8RCO0ee32LomLbE=");
 			background-repeat: no-repeat;
 			background-attachment: fixed;
		}
		
		h1{
		    font-weight:900
		}
		.container{
		    height:100vh;
		    display:flex;
		    justify-content:center;
		    align-items:center;
		    font-size: 16px;
		    flex-direction: column;
		}
		
		.box{
		    width:350px;
		    height:460px;
		    font-size:16px;
		    padding:40px 40px;
		    background-color: #0f044c;
		    box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
		    border-radius: 30px;
		}
		
		.user{
		    margin-top: 50px;
		}
		
		.fas{
		    position: absolute;
		}
		
		input{
		    width:90%;
		    margin-bottom:25px;
		    padding:0 30px 15px;
		    font-size:16px;
		    border:none;
		    border-bottom: 1px solid #141e75;
		    outline:none;
		    background-color: #0f044c;
		    color: #fff;
		}
		
		input:focus{
		    border-bottom: 1px solid #eeeeee;
		}
		
		.reset-password{
		    color:#ff7f50;
		    text-align:right;
		    margin-top:0px;
		    font-size:12px;
		}
		
		.login-btn{
		    margin-top:25px;
		    display:flex;
		    justify-content:center;
		    align-items:center;
		    flex-direction:column;
		}
		
		.btn{
		    display:block;
		    width:80%;
		    padding:15px;
		    background-color: #eeeeee;
		    color:#0f044c;
		    border:none;
		    border-radius:20px;
		    font-size:20px;
		    font-weight:600;
		    opacity:0.8;
		    box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
		}
		
		.btn:hover{
		    opacity:1;
		}
		
		.signup span{
		    color:#7fb8e6;
		}
		
		.signup span::hover{
		    color:#3793df
		}
		
		a{
		    text-decoration: none;
		}
		.btn1{
		    display:block;
		    width:10%;
		    padding:15px;
		    background-color: #eeeeee;
		    color:#0f044c;
		    border:none;
		    border-radius:20px;
		    font-size:20px;
		    font-weight:600;
		    opacity:0.8;
		    box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
		}
		
		.btn1:hover{
		    opacity:1;
		}
 	</style>
</head>

<body>
	<div class="background-wrap">
	  <div class="background"></div>
	</div>
	
	<center>
	<form action="Fetch" method="post">
		<h1>Update Customer</h1>
		<span style="color: yellow;">ID :</span><select name="id">
			<option selected>Select ID</option>
			<c:forEach items="${IdList}" var="id">
				<option value="${id}">${id}</option>
			</c:forEach>
		</select> <br><br>
		<button class="btn1">
			Find
		</button>
	</form>
	</center>
	<form id="accesspanel" method="post" action="Updation">
		<div class="container">
			<div class="box">
				<h1>Insert Customer</h1>
				<div class="user">
					<input type="text" name="id" placeholder="ID" value="${student.id}" placeholder="Id" hidden>
					<i class="fas fa-user"></i> 
					<input type="text" name="name" id="username" placeholder="Full Name" value="${student.getName()}"> 
					<i class="fas fa-envelope"></i> 
					<input type="text" name="city" id="email" placeholder="city" value="${student.getCity()}"> 
				</div>
				<div class="login-btn">
					<button class="btn">
						Update
					</button>
				</div>
			</div>
		</div>

	</form>
	
	<%
	String action = (String) request.getAttribute("Action");
	if (action != null) {

		if (action.equals("Success")) {
			out.print("<h3><font color=black>Update Operation is Success</font></h3>");
		} else {
			out.print("<h3><font color=red>Update Operation is Failure</font></h3>");
		}
	}
	%>
</body>
</html>