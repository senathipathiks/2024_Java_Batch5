<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function validate(){
	var name = document.forms["Fform"]["uname"].value;
	var pass = document.forms["Fform"]["pass"].value;
	if(name == "Nagarjun" && pass == "123"){
		alert("Success");
	}
	else{
		alert("Invalid Username and Password!!!");
		event.preventDefault();
	}
}
</script>
</head>
<body>

</body>
</html>