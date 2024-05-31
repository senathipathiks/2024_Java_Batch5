<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Employee</title>
<style>
body{
    background-image:url('./Images/emplbg.png');

}
#insert{
	border: solid 2px transparent;
	width: 60%;
    padding-bottom: 3%;
	background-color: transparent;
	box-shadow: 15px 9px 10px 3px grey;
	border-radius:15px;
	font-weight:bold;
	font-size:1.5rem;
}
form{
padding-top: 10%;

}
h1{
padding-bottom:5%;
}
#btn{
background-color:lightblue;
width:25%;
height:10%;
padding:20px;
border-radius:15px;
font-weight:bold;

}

input{
height:50px;
width:300px;
border-radius:10px;
border:transparent;

}

</style>
</head>
<body>
<form action="JdbcMainservlet" method="post" onSubmit="return validateForm();" name="employeeForm">
<center>
	<div id="insert">
		<h1 id="head1">Fill  Applicant Details</h1>
	    Enter Applicant   ID    : 
	    <input type="text" name="id" class="in" onblur="return validateID();"><br><br>
	    Enter Applicant Name    :
	    <input type="text" name="name" class="in" onblur="return validateName();"><br>
	    <br>
	    Applied job   Post      :
	    <input type="text" name="job" class="in" ><br>
	    <br>
	    Application status      :
	    <input type="text" name="sts" class="in" ><br>
	    <br><input type="Submit" value="Insert" name="button" id="btn">
	</div>

</center>

</form>


<script>
        function validateForm() {
            var eid =  document.forms["employeeForm"]["id"].value;
            var ename = document.forms["employeeForm"]["name"].value;
            var esal = document.forms["employeeForm"]["job"].value;
            var edesg = document.forms["employeeForm"]["sts"].value;
 
            if (eid ===""|| ename === "" || esal ==="" || edesg === "") {
                alert("Please fill in all required fields.");
                return false;
            }
        }
        
        function validateEmail(email) {
            var pattern = /^[a-zA-Z0-9-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/;
            if (pattern.test(email)) {
            	
 
                return true;
            } else {
            	alert("Please Fill the Validate email ID");
                return false;
            }
        }
        function validatePassword(password) {
            var pattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
            if (pattern.test(password)) {
 
                return true;
            } else {
            	alert("Please fill the Validate Password");
                return false;
            }
        }
        function validateID(id) {
            var pattern = /^[0-9]{6}$/;
            if (pattern.test(id)) {
                return true;
            } else {
            	alert("Please fill the Valid Student ID");
                return false;
            }
        }
        function validateName(name) {
            var pattern = /^[a-zA-Z\s]*$/;
            if (pattern.test(name)) {
                return true;
            } else {
            	alert("Please fill the Valida Student Name");
                return false;
            }
        }
    </script>
</body>
</html>