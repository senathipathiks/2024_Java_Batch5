<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
        function validate() {
            var name = document.forms["Form"]["user"].value;
            var pass = document.forms["Form"]["pass"].value;
           
 
            if ( name === "" || pass === "") {
                alert("Please fill in all required fields.");
                return false;
            }
        }
    </script>
</head>
<body>
<form action="login" name="Form" onsubmit="return validate()" modelAttribute="bean" method="post">
Enter username:<input type="text" name="user"><br><br>
Enter Password:<input type="password" name="pass"><br><br>
<input type="submit" value="login">
</form>
</body>
<%
String result = (String) request.getAttribute("Action");

if(result!=null){
	 
if(result.equals("Success")){
	 out.print("<h3><font color=green>Login Success</font></h3>");
}
else{
	 out.print("<h3><font color=red>Login Failure</font></h3></div>");
}

}

%>

</html>