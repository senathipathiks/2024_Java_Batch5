<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- <script>
        function validateForm() {
            var sid = document.forms["memberform"]["id"].value;
            var sname = document.forms["memberform"]["name"].value;
            var sloc = document.forms["memberform"]["location"].value;
            var semail = document.forms["memberform"]["email"].value;
            var stotal = document.forms["memberform"]["total"].value;
 
            if (sid === "" || sname === "" || semail === "" || sloc === "" || stotal === "") {
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
        function validateName(name) {
            var pattern = /^[a-zA-Z\s]*$/;
            if (pattern.test(name)) {
 
                return true;
            } else {
            	alert("Please fill the Validate Student Name");
 
                return false;
            }
        }
    </script> -->

</head>
<body>
	<div class="background-wrap">
		<div class="background"></div>
	</div>

	<form id="accesspanel" method="post" modelAttribute="bean" action="Insertion">
		<h1 id="litheader">Insert Student Details</h1>
		<div class="inset">
			<p>
				<input type="text" name="name" placeholder="Name">
			</p>
			<p>
				<input type="text" name="batch" placeholder="Batch">
			</p>
		</div>

		<p class="p-container">
			<input type="submit" value="Insert">
		</p>

	</form>
	<%
	String result = (String) request.getAttribute("Action");

	if (result != null) {
		if (result.equals("Success")) {
			out.print("<h3><font color=green>Insertion Operation is Successfully Done</font></h3>");
		} else {
			out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
		}
	}
	%>
</body>
</html>