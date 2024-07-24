<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Links</title>

<style>

body{

background-image: linear-gradient(#7F7FD5,#91EAE4);
  background-size: 100% 200%;

}

a{
font-size:20px;
}
</style>
</head>
<body>

<center>

<h1>Options</h1>

<%

out.println("<button><a style=text-decoration:none href=Insert.jsp target=frame3>Insert</a></button><br><br><button><a style=text-decoration:none href=Update.jsp target=frame3>Update</a></button><br><br><button><a style=text-decoration:none href=Delete.jsp target=frame3>Delete</a></button><br><br><button><a style=text-decoration:none href=Find.jsp target=frame3>Find</a></button><br><br><button><a style=text-decoration:none href=Display.jsp target=frame3 name=Display value=Display>Display</a></button>");


%>

</center>

</body>
</html>